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

    public FileStorageApplicationModels.FileUploadComplete uploadMedia(String fileName, String contentType, int size,
                                                                     String namespace, File file, FileStorageApplicationService fileStorageApplicationService,
                                                                     FileStorageApplicationModels.Params params, String encKey) {
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.fileStorageApplicationService = fileStorageApplicationService;
        AwsApiList awsApiList = generateAwsApiList();
        if (StringUtils.isNotEmpty(fileName) && StringUtils.isNotEmpty(contentType)
                && StringUtils.isNotEmpty(namespace)) {
            FileStorageApplicationModels.FileUploadStart startRequest = 
                new FileStorageApplicationModels.FileUploadStart(
                    fileName, contentType, size, List.of(), params, encKey
                );
            try {
                FileStorageApplicationModels.FileUpload startResponse = 
                    fileStorageApplicationService.startUpload(namespace, startRequest);
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
        return retrofitServiceFactory.createService(
            fileStorageApplicationService.getApplicationConfig().getDomain(),
            AwsApiList.class, List.of()
        );
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

    public FileStorageApplicationModels.FileUploadComplete uploadMedia(String fileName, String contentType, int size, String namespace, File file, FileStorageApplicationModels.Params params, String encKey) {
        return super.uploadMedia(fileName, contentType, size, namespace, file, this, params, encKey);
    }

    public FileStorageApplicationModels.FileUpload startUpload(String namespace, FileStorageApplicationModels.FileUploadStart body) throws IOException {
        return this.startUpload(namespace, body, new HashMap<>());
    }

    public FileStorageApplicationModels.FileUpload startUpload(String namespace, FileStorageApplicationModels.FileUploadStart body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("startUpload");
        fullUrl = fullUrl.replace("{" + "namespace" + "}",namespace.toString());

        Response<FileStorageApplicationModels.FileUpload> response = filestorageApplicationApiList.startUpload(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public FileStorageApplicationModels.FileUploadComplete completeUpload(String namespace, FileStorageApplicationModels.FileUpload body) throws IOException {
        return this.completeUpload(namespace, body, new HashMap<>());
    }

    public FileStorageApplicationModels.FileUploadComplete completeUpload(String namespace, FileStorageApplicationModels.FileUpload body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("completeUpload");
        fullUrl = fullUrl.replace("{" + "namespace" + "}",namespace.toString());

        Response<FileStorageApplicationModels.FileUploadComplete> response = filestorageApplicationApiList.completeUpload(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public FileStorageApplicationModels.SignUrlResult signUrls(FileStorageApplicationModels.SignUrl body) throws IOException {
        return this.signUrls(body, new HashMap<>());
    }

    public FileStorageApplicationModels.SignUrlResult signUrls(FileStorageApplicationModels.SignUrl body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("signUrls");

        Response<FileStorageApplicationModels.SignUrlResult> response = filestorageApplicationApiList.signUrls(fullUrl, body, requestHeaders).execute();
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