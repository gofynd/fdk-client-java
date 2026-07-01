package com.sdk.universal.catalog;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.universal.*;
import com.sdk.common.*;

@Getter
public class CatalogPublicService {
    private PublicConfig publicConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private CatalogPublicApiList catalogPublicApiList;

    public CatalogPublicService(PublicConfig publicConfig) {
        this.publicConfig = publicConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.catalogPublicApiList = generateCatalogPublicApiList(this.publicConfig.getPersistentCookieStore());
    }

    private CatalogPublicApiList generateCatalogPublicApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new PublicHeaderInterceptor(publicConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(publicConfig.getDomain(),CatalogPublicApiList.class, interceptorList, cookieStore);
    }

    public CatalogPublicModels.TaxonomyResponseSchema getTaxonomyByLevel(Integer level, String l0Slug, String l1Slug, String l2Slug, String l3Slug, Double limit) throws IOException {
        return this.getTaxonomyByLevel(level, l0Slug, l1Slug, l2Slug, l3Slug, limit, new HashMap<>());
    }

    public CatalogPublicModels.TaxonomyResponseSchema getTaxonomyByLevel(Integer level, String l0Slug, String l1Slug, String l2Slug, String l3Slug, Double limit, Map<String, String> requestHeaders) throws IOException {
    
        Response<CatalogPublicModels.TaxonomyResponseSchema> response = catalogPublicApiList.getTaxonomyByLevel(level, l0Slug, l1Slug, l2Slug, l3Slug, limit, requestHeaders).execute();
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