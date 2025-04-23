package com.sdk.universal.content;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.universal.*;
import com.sdk.common.*;

@Getter
public class ContentPublicService {
    private PublicConfig publicConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private ContentPublicApiList contentPublicApiList;

    public ContentPublicService(PublicConfig publicConfig) {
        this.publicConfig = publicConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.contentPublicApiList = generateContentPublicApiList(this.publicConfig.getPersistentCookieStore());
    }

    private ContentPublicApiList generateContentPublicApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new PublicHeaderInterceptor(publicConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(publicConfig.getDomain(),ContentPublicApiList.class, interceptorList, cookieStore);
    }

    public ContentPublicModels.CredentialsSchema getCredentialsByEntity(String entity) throws IOException {
        return this.getCredentialsByEntity(entity, new HashMap<>());
    }

    public ContentPublicModels.CredentialsSchema getCredentialsByEntity(String entity, Map<String, String> requestHeaders) throws IOException {
    
        Response<ContentPublicModels.CredentialsSchema> response = contentPublicApiList.getCredentialsByEntity(entity, requestHeaders).execute();
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