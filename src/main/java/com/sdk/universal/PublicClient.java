package com.sdk.universal;

import lombok.Getter;
import lombok.Setter;


import com.sdk.universal.configuration.ConfigurationPublicService;

import com.sdk.universal.inventory.InventoryPublicService;

import com.sdk.universal.partner.PartnerPublicService;

import com.sdk.universal.webhook.WebhookPublicService;


@Getter
@Setter
public class PublicClient {

    private PublicConfig config;

    
    public ConfigurationPublicService configuration;
    
    public InventoryPublicService inventory;
    
    public PartnerPublicService partner;
    
    public WebhookPublicService webhook;
    

    public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
    }

    public PublicClient(PublicConfig publicConfig) {
        this.config = publicConfig;
        
        this.configuration = new ConfigurationPublicService(publicConfig);
        
        this.inventory = new InventoryPublicService(publicConfig);
        
        this.partner = new PartnerPublicService(publicConfig);
        
        this.webhook = new WebhookPublicService(publicConfig);
        
    }
}