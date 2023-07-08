

package com.sdk.administrator.communication;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.administrator.AdministratorConfig;
import com.sdk.common.*;


@Getter
public class CommunicationAdministratorService {
    private AdministratorConfig administratorConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private CommunicationAdministratorApiList communicationAdministratorApiList;

    public CommunicationAdministratorService(AdministratorConfig administratorConfig) {
        this.administratorConfig = administratorConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.communicationAdministratorApiList = generateCommunicationAdministratorApiList(this.administratorConfig.getPersistentCookieStore());
    }

    private CommunicationAdministratorApiList generateCommunicationAdministratorApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AdministratorHeaderInterceptor(administratorConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(administratorConfig.getDomain(),CommunicationAdministratorApiList.class, interceptorList, cookieStore);
    }

    
    
    
    public CommunicationAdministratorModels.EngineResponse sendSellerCommunicationSynchronously(CommunicationAdministratorModels.EngineRequest body) throws IOException {
    
        Response<CommunicationAdministratorModels.EngineResponse> response = communicationAdministratorApiList.sendSellerCommunicationSynchronously( body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public CommunicationAdministratorModels.EngineResponse sendSellerCommunicationAsynchronously(CommunicationAdministratorModels.EngineRequest body) throws IOException {
    
        Response<CommunicationAdministratorModels.EngineResponse> response = communicationAdministratorApiList.sendSellerCommunicationAsynchronously( body).execute();
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

