

package com.sdk.internal.filestorage;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.internal.*;
import com.sdk.common.*;


@Getter
public class FileStorageInternalService {
    private InternalConfig internalConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private FileStorageInternalApiList filestorageInternalApiList;

    public FileStorageInternalService(InternalConfig internalConfig) {
        this.internalConfig = internalConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.filestorageInternalApiList = generateFilestorageInternalApiList(this.internalConfig.getPersistentCookieStore());
    }

    private FileStorageInternalApiList generateFilestorageInternalApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new InternalHeaderInterceptor(internalConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(internalConfig.getDomain(),FileStorageInternalApiList.class, interceptorList, cookieStore);
    }

    
    
    
    public FileStorageInternalModels.GenerateShipment200 generateBulkPdf(FileStorageInternalModels.GenerateShipmentRequestBody body) throws IOException {
    
        Response<FileStorageInternalModels.GenerateShipment200> response = filestorageInternalApiList.generateBulkPdf( body).execute();
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

