package com.sdk.application.share;

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
 public class ShareApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ShareApplicationApiList shareApplicationApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    public ShareApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.shareApplicationApiList = generateShareApplicationApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getApplicationQRCode","/service/application/share/v1.0/qr/".substring(1));
            
                    relativeUrls.put("getProductQRCodeBySlug","/service/application/share/v1.0/qr/products/{slug}/".substring(1));
            
                    relativeUrls.put("getCollectionQRCodeBySlug","/service/application/share/v1.0/qr/collection/{slug}/".substring(1));
            
                    relativeUrls.put("getUrlQRCode","/service/application/share/v1.0/qr/url/".substring(1));
            
                    relativeUrls.put("createShortLink","/service/application/share/v1.0/links/short-link/".substring(1));
            
                    relativeUrls.put("getShortLinkByHash","/service/application/share/v1.0/links/short-link/{hash}/".substring(1));
            
                    relativeUrls.put("getOriginalShortLinkByHash","/service/application/share/v1.0/links/short-link/{hash}/original/".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private ShareApplicationApiList generateShareApplicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),ShareApplicationApiList.class, interceptorList, cookieStore);
    }

    

     
    
    public ShareApplicationModels.QRCodeResp getApplicationQRCode() throws IOException {
     
      String fullUrl = relativeUrls.get("getApplicationQRCode");
        

        Response<ShareApplicationModels.QRCodeResp> response = shareApplicationApiList.getApplicationQRCode(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ShareApplicationModels.QRCodeResp getProductQRCodeBySlug(String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getProductQRCodeBySlug");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ShareApplicationModels.QRCodeResp> response = shareApplicationApiList.getProductQRCodeBySlug(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ShareApplicationModels.QRCodeResp getCollectionQRCodeBySlug(String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCollectionQRCodeBySlug");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<ShareApplicationModels.QRCodeResp> response = shareApplicationApiList.getCollectionQRCodeBySlug(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ShareApplicationModels.QRCodeResp getUrlQRCode(String url ) throws IOException {
     
      String fullUrl = relativeUrls.get("getUrlQRCode");
        

        Response<ShareApplicationModels.QRCodeResp> response = shareApplicationApiList.getUrlQRCode(fullUrl  ,url).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ShareApplicationModels.ShortLinkRes createShortLink(ShareApplicationModels.ShortLinkReq body) throws IOException {
     
      String fullUrl = relativeUrls.get("createShortLink");
        

        Response<ShareApplicationModels.ShortLinkRes> response = shareApplicationApiList.createShortLink(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ShareApplicationModels.ShortLinkRes getShortLinkByHash(String hash ) throws IOException {
     
      String fullUrl = relativeUrls.get("getShortLinkByHash");
        
        fullUrl = fullUrl.replace("{" + "hash" +"}",hash.toString());
        

        Response<ShareApplicationModels.ShortLinkRes> response = shareApplicationApiList.getShortLinkByHash(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public ShareApplicationModels.ShortLinkRes getOriginalShortLinkByHash(String hash ) throws IOException {
     
      String fullUrl = relativeUrls.get("getOriginalShortLinkByHash");
        
        fullUrl = fullUrl.replace("{" + "hash" +"}",hash.toString());
        

        Response<ShareApplicationModels.ShortLinkRes> response = shareApplicationApiList.getOriginalShortLinkByHash(fullUrl ).execute();
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
