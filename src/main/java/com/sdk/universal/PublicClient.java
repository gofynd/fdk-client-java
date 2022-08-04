package com.sdk.universal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PublicClient {

    
    public PublicService.ConfigurationService configuration;
    

    public PublicClient(PublicConfig publicConfig) {
        
        this.configuration = new PublicService.ConfigurationService(publicConfig);
        
    }
}