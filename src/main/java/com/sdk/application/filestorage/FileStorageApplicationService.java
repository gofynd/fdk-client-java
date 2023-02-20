package com.sdk.application.filestorage;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;
import java.io.File;

import com.sdk.common.*;
import com.sdk.application.ApplicationConfig;







@Getter
public class FileStorageApplicationService extends FileStorage { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private FileStorageApplicationApiList filestorageApplicationApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    public FileStorageApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.filestorageApplicationApiList = generateFilestorageApplicationApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("startUpload","/service/application/assets/v1.0/namespaces/{namespace}/upload/start/".substring(1));
            
                    relativeUrls.put("completeUpload","/service/application/assets/v1.0/namespaces/{namespace}/upload/complete/".substring(1));
            
                    relativeUrls.put("signUrls","/service/application/assets/v1.0/sign-urls/".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private FileStorageApplicationApiList generateFilestorageApplicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),FileStorageApplicationApiList.class, interceptorList, cookieStore);
    }

    
    public FileStorageApplicationModels.CompleteResponse uploadMedia(String fileName, String contentType, int size, String namespace, File file, HashMap<String,Object> params) {
        return super.uploadMedia(fileName, contentType, size, namespace, file, this, params);
    }
    

     
    
    public FileStorageApplicationModels.StartResponse startUpload(String namespace ,FileStorageApplicationModels.StartRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("startUpload");
        
        fullUrl = fullUrl.replace("{" + "namespace" +"}",namespace.toString());
        

        Response<FileStorageApplicationModels.StartResponse> response = filestorageApplicationApiList.startUpload(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public FileStorageApplicationModels.CompleteResponse completeUpload(String namespace ,FileStorageApplicationModels.StartResponse body) throws IOException {
     
      String fullUrl = relativeUrls.get("completeUpload");
        
        fullUrl = fullUrl.replace("{" + "namespace" +"}",namespace.toString());
        

        Response<FileStorageApplicationModels.CompleteResponse> response = filestorageApplicationApiList.completeUpload(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public FileStorageApplicationModels.SignUrlResponse signUrls(FileStorageApplicationModels.SignUrlRequest body) throws IOException {
     
      String fullUrl = relativeUrls.get("signUrls");
        

        Response<FileStorageApplicationModels.SignUrlResponse> response = filestorageApplicationApiList.signUrls(fullUrl , body).execute();
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
