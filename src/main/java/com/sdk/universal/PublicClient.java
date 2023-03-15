package com.sdk.universal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PublicClient {

    private PublicConfig config;

    
    public PublicService.ConfigurationService configuration;
    
    public PublicService.WebhookService webhook;
    
    public PublicService.InventoryService inventory;
    

    public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
    }

    public PublicClient(PublicConfig publicConfig) {
        this.config = publicConfig;
        
        this.configuration = new PublicService.ConfigurationService(publicConfig);
        
        this.webhook = new PublicService.WebhookService(publicConfig);
        
        this.inventory = new PublicService.InventoryService(publicConfig);
        
    }
}