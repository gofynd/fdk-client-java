package com.sdk.platform.authorization;

import com.sdk.common.*;
import com.sdk.common.model.FDKException;
import com.sdk.common.model.FDKServerResponseError;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.platform.*;


public class AuthorizationPlatformService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private AuthorizationPlatformApiList authorizationPlatformApiList;

    public AuthorizationPlatformService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.authorizationPlatformApiList = generateAuthorizationPlatformApiList(this.platformConfig.getPersistentCookieStore());
    }

    private AuthorizationPlatformApiList generateAuthorizationPlatformApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),AuthorizationPlatformApiList.class, interceptorList, cookieStore);
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

    public AuthorizationPlatformModels.ApplicationStaffPage getApplicationStaffList(Integer pageNo, Integer pageSize, Boolean orderIncent, Integer orderingStore, String user, String userName) throws FDKServerResponseError, FDKException {
        return this.getApplicationStaffList(pageNo, pageSize, orderIncent, orderingStore, user, userName, new HashMap<>());
    }

    public AuthorizationPlatformModels.ApplicationStaffPage getApplicationStaffList(Integer pageNo, Integer pageSize, Boolean orderIncent, Integer orderingStore, String user, String userName, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<AuthorizationPlatformModels.ApplicationStaffPage> response = null;
            try {
            response = authorizationPlatformApiList.getApplicationStaffList(this.companyId, this.applicationId, pageNo, pageSize, orderIncent, orderingStore, user, userName, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getApplicationStaffList
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<AuthorizationPlatformModels.ApplicationStaffPage> getApplicationStaffListPagination(
        Integer pageSize,
        Boolean orderIncent,
        Integer orderingStore,
        String user,
        String userName
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<AuthorizationPlatformModels.ApplicationStaffPage> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            AuthorizationPlatformModels.ApplicationStaffPage callback = this.getApplicationStaffList(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 orderIncent,
                 orderingStore,
                 user,
                 userName
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

}


private interface Fields {
    String UNKNOWN_ERROR = "Unknown error";
}

}