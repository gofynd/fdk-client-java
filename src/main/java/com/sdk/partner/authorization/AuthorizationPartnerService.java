package com.sdk.partner.authorization;

import com.sdk.common.*;
import com.sdk.common.model.FDKException;
import com.sdk.common.model.FDKServerResponseError;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.partner.*;


public class AuthorizationPartnerService {
    private PartnerConfig partnerConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String organizationId;

    private AuthorizationPartnerApiList authorizationPartnerApiList;

    public AuthorizationPartnerService(PartnerConfig partnerConfig) {
        this.partnerConfig = partnerConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.organizationId = this.partnerConfig.getOrganizationId();
        this.authorizationPartnerApiList = generateAuthorizationPartnerApiList(this.partnerConfig.getPersistentCookieStore());
    }

    private AuthorizationPartnerApiList generateAuthorizationPartnerApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(partnerConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(partnerConfig.getDomain(),AuthorizationPartnerApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    

    public AuthorizationPartnerModels.ClientResponseSchema createOrganizationClient(AuthorizationPartnerModels.ClientData body) throws FDKServerResponseError, FDKException {
        return this.createOrganizationClient(body, new HashMap<>());
    }

    public AuthorizationPartnerModels.ClientResponseSchema createOrganizationClient(AuthorizationPartnerModels.ClientData body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<AuthorizationPartnerModels.ClientResponseSchema> response = null;
            try {
                response = authorizationPartnerApiList.createOrganizationClient(this.organizationId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public AuthorizationPartnerModels.ClientListSchema getOrganizationClientList(Integer pageNo, Integer pageSize, Boolean isActive) throws FDKServerResponseError, FDKException {
        return this.getOrganizationClientList(pageNo, pageSize, isActive, new HashMap<>());
    }

    public AuthorizationPartnerModels.ClientListSchema getOrganizationClientList(Integer pageNo, Integer pageSize, Boolean isActive, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<AuthorizationPartnerModels.ClientListSchema> response = null;
            try {
                response = authorizationPartnerApiList.getOrganizationClientList(this.organizationId, pageNo, pageSize, isActive, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public AuthorizationPartnerModels.ClientResponseSchema getOrganizationClientById(String clientId) throws FDKServerResponseError, FDKException {
        return this.getOrganizationClientById(clientId, new HashMap<>());
    }

    public AuthorizationPartnerModels.ClientResponseSchema getOrganizationClientById(String clientId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<AuthorizationPartnerModels.ClientResponseSchema> response = null;
            try {
                response = authorizationPartnerApiList.getOrganizationClientById(this.organizationId, clientId, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public AuthorizationPartnerModels.ClientResponseSchema updateOrganizationClientById(String clientId, AuthorizationPartnerModels.UpdateClient body) throws FDKServerResponseError, FDKException {
        return this.updateOrganizationClientById(clientId, body, new HashMap<>());
    }

    public AuthorizationPartnerModels.ClientResponseSchema updateOrganizationClientById(String clientId, AuthorizationPartnerModels.UpdateClient body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<AuthorizationPartnerModels.ClientResponseSchema> response = null;
            try {
                response = authorizationPartnerApiList.updateOrganizationClientById(this.organizationId, clientId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public AuthorizationPartnerModels.ClientResponseSchema deleteOrganizationOAuthClientById(String clientId) throws FDKServerResponseError, FDKException {
        return this.deleteOrganizationOAuthClientById(clientId, new HashMap<>());
    }

    public AuthorizationPartnerModels.ClientResponseSchema deleteOrganizationOAuthClientById(String clientId, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<AuthorizationPartnerModels.ClientResponseSchema> response = null;
            try {
                response = authorizationPartnerApiList.deleteOrganizationOAuthClientById(this.organizationId, clientId, requestHeaders).execute();
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
    
    
    


private interface Fields {
    String UNKNOWN_ERROR = "Unknown error";
}

}