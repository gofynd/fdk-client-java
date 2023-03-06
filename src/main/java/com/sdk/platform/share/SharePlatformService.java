package com.sdk.platform.share;

import com.sdk.common.*;
import com.sdk.common.model.FDKException;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.platform.PlatformConfig;







public class SharePlatformService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private SharePlatformApiList sharePlatformApiList;

    public SharePlatformService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.sharePlatformApiList = generateSharePlatformApiList(this.platformConfig.getPersistentCookieStore());
    }

    private SharePlatformApiList generateSharePlatformApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),SharePlatformApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    




public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    public ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public SharePlatformModels.ShortLinkRes createShortLink(SharePlatformModels.ShortLinkReq body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<SharePlatformModels.ShortLinkRes> response = null;
            try {
            response = sharePlatformApiList.createShortLink(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public SharePlatformModels.ShortLinkList getShortLinks(Integer pageNo , Integer pageSize , String createdBy , String active , String q ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<SharePlatformModels.ShortLinkList> response = null;
            try {
            response = sharePlatformApiList.getShortLinks(this.companyId , this.applicationId ,pageNo , pageSize , createdBy , active , q ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getShortLinks
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<SharePlatformModels.ShortLinkList> getShortLinksPagination(
        Integer pageSize,
        String createdBy,
        String active,
        String q
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<SharePlatformModels.ShortLinkList> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            SharePlatformModels.ShortLinkList callback = this.getShortLinks(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 createdBy,
                 active,
                 q
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public SharePlatformModels.ShortLinkRes getShortLinkByHash(String hash ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<SharePlatformModels.ShortLinkRes> response = null;
            try {
            response = sharePlatformApiList.getShortLinkByHash(this.companyId , this.applicationId , hash ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public SharePlatformModels.ShortLinkRes updateShortLinkById(String id ,SharePlatformModels.ShortLinkReq body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<SharePlatformModels.ShortLinkRes> response = null;
            try {
            response = sharePlatformApiList.updateShortLinkById(this.companyId , this.applicationId , id , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    

}


private interface Fields {
    String UNKNOWN_ERROR = "Unknown error";
}

}