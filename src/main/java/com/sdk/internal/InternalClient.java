package com.sdk.internal;

import lombok.Getter;
import lombok.Setter;


import com.sdk.internal.filestorage.FileStorageInternalService;


@Getter
@Setter
public class InternalClient {

    private InternalConfig config;

    
    public FileStorageInternalService fileStorage;
    

    public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
    }

    public InternalClient(InternalConfig internalConfig) {
        this.config = internalConfig;
        
        this.fileStorage = new FileStorageInternalService(internalConfig);
        
    }
}