package com.sdk.universal;

import lombok.Getter;
import lombok.Setter;


import com.sdk.universal.configuration.ConfigurationPublicService;

import com.sdk.universal.webhook.WebhookPublicService;


@Getter
@Setter
public class PublicClient {

    private PublicConfig config;

    
    public ConfigurationPublicService configuration;
    
    public WebhookPublicService webhook;
    

    public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
    }

    public PublicClient(PublicConfig publicConfig) {
        this.config = publicConfig;
        
        this.configuration = new ConfigurationPublicService(publicConfig);
        
        this.webhook = new WebhookPublicService(publicConfig);
        
    }
}