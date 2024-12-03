package com.sdk.universal;

import lombok.Getter;
import lombok.Setter;


import com.sdk.universal.catalog.CatalogPublicService;

import com.sdk.universal.configuration.ConfigurationPublicService;

import com.sdk.universal.content.ContentPublicService;

import com.sdk.universal.partner.PartnerPublicService;

import com.sdk.universal.webhook.WebhookPublicService;


@Getter
@Setter
public class PublicClient {

    private PublicConfig config;

    
    public CatalogPublicService catalog;
    
    public ConfigurationPublicService configuration;
    
    public ContentPublicService content;
    
    public PartnerPublicService partner;
    
    public WebhookPublicService webhook;
    

    public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
    }

    public PublicClient(PublicConfig publicConfig) {
        this.config = publicConfig;
        
        this.catalog = new CatalogPublicService(publicConfig);
        
        this.configuration = new ConfigurationPublicService(publicConfig);
        
        this.content = new ContentPublicService(publicConfig);
        
        this.partner = new PartnerPublicService(publicConfig);
        
        this.webhook = new WebhookPublicService(publicConfig);
        
    }
}