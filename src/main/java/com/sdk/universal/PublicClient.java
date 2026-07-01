package com.sdk.universal;

import lombok.Getter;
import lombok.Setter;
import java.net.CookieStore;


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

    public PublicClient(PublicConfig config) {
        this.initialiseConfigAndServices(config);
    }

    public PublicClient(String applicationToken) {
        PublicConfig config = new PublicConfig(applicationToken);
        this.initialiseConfigAndServices(config);
    }

    public PublicClient(String applicationToken, String domain) {
        PublicConfig config = new PublicConfig(applicationToken, domain);
        this.initialiseConfigAndServices(config);
    }

    private void initialiseConfigAndServices(PublicConfig config) {
        this.config = config;
        
        this.catalog = new CatalogPublicService(config);
        
        this.configuration = new ConfigurationPublicService(config);
        
        this.content = new ContentPublicService(config);
        
        this.partner = new PartnerPublicService(config);
        
        this.webhook = new WebhookPublicService(config);
        
    }

    public CookieStore getPersistentCookieStore() {
        return this.config.getPersistentCookieStore();
    }
}