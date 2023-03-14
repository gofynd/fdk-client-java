package com.sdk.application.theme;

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
 public class ThemeApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ThemeApplicationApiList themeApplicationApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    public ThemeApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.themeApplicationApiList = generateThemeApplicationApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getAllPages","/service/application/theme/v1.0/{theme_id}/page".substring(1));
            
                    relativeUrls.put("getPage","/service/application/theme/v1.0/{theme_id}/{page_value}".substring(1));
            
                    relativeUrls.put("getAppliedTheme","/service/application/theme/v1.0/applied-theme".substring(1));
            
                    relativeUrls.put("getThemeForPreview","/service/application/theme/v1.0/{theme_id}/preview".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private ThemeApplicationApiList generateThemeApplicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),ThemeApplicationApiList.class, interceptorList, cookieStore);
    }

    

     
    
    
    public ThemeApplicationModels.AllAvailablePageSchema getAllPages(String themeId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getAllPages");
        
        fullUrl = fullUrl.replace("{" + "theme_id" +"}",themeId.toString());
        

        Response<ThemeApplicationModels.AllAvailablePageSchema> response = themeApplicationApiList.getAllPages(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemeApplicationModels.AvailablePageSchema getPage(String themeId , String pageValue ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPage");
        
        fullUrl = fullUrl.replace("{" + "theme_id" +"}",themeId.toString());
        
        fullUrl = fullUrl.replace("{" + "page_value" +"}",pageValue.toString());
        

        Response<ThemeApplicationModels.AvailablePageSchema> response = themeApplicationApiList.getPage(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemeApplicationModels.ThemesSchema getAppliedTheme() throws IOException {
     
      String fullUrl = relativeUrls.get("getAppliedTheme");
        

        Response<ThemeApplicationModels.ThemesSchema> response = themeApplicationApiList.getAppliedTheme(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public ThemeApplicationModels.ThemesSchema getThemeForPreview(String themeId ) throws IOException {
     
      String fullUrl = relativeUrls.get("getThemeForPreview");
        
        fullUrl = fullUrl.replace("{" + "theme_id" +"}",themeId.toString());
        

        Response<ThemeApplicationModels.ThemesSchema> response = themeApplicationApiList.getThemeForPreview(fullUrl ).execute();
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
