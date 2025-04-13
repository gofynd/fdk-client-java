package com.sdk.partner.catalog;

import com.sdk.common.*;
import com.sdk.common.model.FDKException;
import com.sdk.common.model.FDKServerResponseError;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.partner.*;


public class CatalogPartnerService {
    private PartnerConfig partnerConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String organizationId;

    private CatalogPartnerApiList catalogPartnerApiList;

    public CatalogPartnerService(PartnerConfig partnerConfig) {
        this.partnerConfig = partnerConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.organizationId = this.partnerConfig.getOrganizationId();
        this.catalogPartnerApiList = generateCatalogPartnerApiList(this.partnerConfig.getPersistentCookieStore());
    }

    private CatalogPartnerApiList generateCatalogPartnerApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(partnerConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(partnerConfig.getDomain(),CatalogPartnerApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    

    public CatalogPartnerModels.CompaniesSerializer partnerCompanyDetails(CatalogPartnerModels.PartnerCompanyDetailsRequestSchema body) throws FDKServerResponseError, FDKException {
        return this.partnerCompanyDetails(body, new HashMap<>());
    }

    public CatalogPartnerModels.CompaniesSerializer partnerCompanyDetails(CatalogPartnerModels.PartnerCompanyDetailsRequestSchema body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<CatalogPartnerModels.CompaniesSerializer> response = null;
            try {
                response = catalogPartnerApiList.partnerCompanyDetails(this.organizationId, body, requestHeaders).execute();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CatalogPartnerModels.CompanyListSerializer getCompanies(String q, String stage) throws FDKServerResponseError, FDKException {
        return this.getCompanies(q, stage, new HashMap<>());
    }

    public CatalogPartnerModels.CompanyListSerializer getCompanies(String q, String stage, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.partnerConfig.getPartnerOauthClient().isAccessTokenValid()) {
            Response<CatalogPartnerModels.CompanyListSerializer> response = null;
            try {
                response = catalogPartnerApiList.getCompanies(this.organizationId, q, stage, requestHeaders).execute();
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