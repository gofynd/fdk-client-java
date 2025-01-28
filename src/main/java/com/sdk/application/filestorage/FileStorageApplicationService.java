package com.sdk.application.filestorage;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;
import java.io.File;

import com.sdk.common.*;
import com.sdk.application.*;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.apache.commons.lang3.StringUtils;
import retrofit2.Call;
import com.sdk.common.model.FDKError;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import retrofit2.http.Url;

class FileStorage {

    private RetrofitServiceFactory retrofitServiceFactory;

    private FileStorageApplicationService fileStorageApplicationService;

    public FileStorageApplicationModels.CompleteResponse uploadMedia(String fileName, String contentType, int size,
                                                                     String namespace, File file, FileStorageApplicationService fileStorageApplicationService,
                                                                     FileStorageApplicationModels.Params params) {
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.fileStorageApplicationService = fileStorageApplicationService;
        AwsApiList awsApiList = generateAwsApiList();
        if (StringUtils.isNotEmpty(fileName) && StringUtils.isNotEmpty(contentType)
                && StringUtils.isNotEmpty(namespace)) {
            FileStorageApplicationModels.StartRequest startRequest = new FileStorageApplicationModels.StartRequest(fileName, contentType,
                    size, List.of(), params);
            try {
                FileStorageApplicationModels.StartResponse startResponse = fileStorageApplicationService.startUpload(namespace, startRequest);
                String uploadUrl = startResponse.getUpload().getUrl();
                if (StringUtils.isNotEmpty(uploadUrl) && Objects.nonNull(file)) {
                    String contentTypeFromResponse = StringUtils.isNotEmpty(startResponse.getContentType())
                            ? startResponse.getContentType()
                            : "";
                    awsApiList.updateAWSMedia(contentTypeFromResponse, uploadUrl,
                            RequestBody.create(MediaType.parse(contentTypeFromResponse), file)).execute();
                    return fileStorageApplicationService.completeUpload(namespace, startResponse);
                }
            } catch (Exception e) {
                throw new FDKError(e.getMessage());
            }
        }
        throw new FDKError("Missing Input Parameters");
    }

    private AwsApiList generateAwsApiList() {
        return retrofitServiceFactory.createService(fileStorageApplicationService.getApplicationConfig().getDomain(),
                AwsApiList.class, List.of());
    }

    interface AwsApiList {
        @PUT
        Call<Void> updateAWSMedia(@Header("Content-type") String header, @Url String url, @Body RequestBody image);
    }
}



@Getter
public class FileStorageApplicationService extends FileStorage { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private FileStorageApplicationApiList filestorageApplicationApiList;

    private HashMap<String,String> relativeUrls = new HashMap<String,String>();

    public FileStorageApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.filestorageApplicationApiList = generateFileStorageApplicationApiList(this.applicationConfig.getPersistentCookieStore());

        
        relativeUrls.put("startUpload","/service/application/assets/v2.0/namespaces/{namespace}/upload/start".substring(1));
        relativeUrls.put("completeUpload","/service/application/assets/v2.0/namespaces/{namespace}/upload/complete".substring(1));
        relativeUrls.put("signUrls","/service/application/assets/v1.0/sign-urls".substring(1)); 

    }

    public void update( HashMap<String,String> updatedUrlMap ){
        for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
            relativeUrls.put(entry.getKey(),entry.getValue());
        }
    }

    private FileStorageApplicationApiList generateFileStorageApplicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),FileStorageApplicationApiList.class, interceptorList, cookieStore);
    }

    public FileStorageApplicationModels.CompleteResponse uploadMedia(String fileName, String contentType, int size, String namespace, File file, FileStorageApplicationModels.Params params) {
        return super.uploadMedia(fileName, contentType, size, namespace, file, this, params);
    }

    public FileStorageApplicationModels.StartResponse startUpload(String namespace, FileStorageApplicationModels.StartRequest body) throws IOException {
        return this.startUpload(namespace, body, new HashMap<>());
    }

    public FileStorageApplicationModels.StartResponse startUpload(String namespace, FileStorageApplicationModels.StartRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("startUpload");
        fullUrl = fullUrl.replace("{" + "namespace" + "}",namespace.toString());

        Response<FileStorageApplicationModels.StartResponse> response = filestorageApplicationApiList.startUpload(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public FileStorageApplicationModels.CompleteResponse completeUpload(String namespace, FileStorageApplicationModels.StartResponse body) throws IOException {
        return this.completeUpload(namespace, body, new HashMap<>());
    }

    public FileStorageApplicationModels.CompleteResponse completeUpload(String namespace, FileStorageApplicationModels.StartResponse body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("completeUpload");
        fullUrl = fullUrl.replace("{" + "namespace" + "}",namespace.toString());

        Response<FileStorageApplicationModels.CompleteResponse> response = filestorageApplicationApiList.completeUpload(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public FileStorageApplicationModels.SignUrlResponse signUrls(FileStorageApplicationModels.SignUrlRequest body) throws IOException {
        return this.signUrls(body, new HashMap<>());
    }

    public FileStorageApplicationModels.SignUrlResponse signUrls(FileStorageApplicationModels.SignUrlRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("signUrls");

        Response<FileStorageApplicationModels.SignUrlResponse> response = filestorageApplicationApiList.signUrls(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
      

    private interface Fields {
        String UNKNOWN_ERROR = "Unknown error";
    }
}