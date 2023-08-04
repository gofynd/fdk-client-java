package com.sdk.universal.partner;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.universal.*;
import com.sdk.common.*;





@Getter
public class PartnerPublicService {
    private PublicConfig publicConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private PartnerPublicApiList partnerPublicApiList;

    public PartnerPublicService(PublicConfig publicConfig) {
        this.publicConfig = publicConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.partnerPublicApiList = generatePartnerPublicApiList(this.publicConfig.getPersistentCookieStore());
    }

    private PartnerPublicApiList generatePartnerPublicApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new PublicHeaderInterceptor(publicConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(publicConfig.getDomain(),PartnerPublicApiList.class, interceptorList, cookieStore);
    }

    
    
    
    public PartnerPublicModels.ExtensionUsingSlug getPanelExtensionDetails(String slug ) throws IOException {
    
        Response<PartnerPublicModels.ExtensionUsingSlug> response = partnerPublicApiList.getPanelExtensionDetails(slug).execute();
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
