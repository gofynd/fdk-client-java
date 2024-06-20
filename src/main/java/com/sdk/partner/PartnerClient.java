package com.sdk.partner;

import lombok.Getter;
import lombok.Setter;


import com.sdk.partner.filestorage.FileStoragePartnerService;

import com.sdk.partner.lead.LeadPartnerService;

import com.sdk.partner.logistics.LogisticsPartnerService;

import com.sdk.partner.theme.ThemePartnerService;

import com.sdk.partner.webhook.WebhookPartnerService;



@Getter
@Setter
public class PartnerClient {

    private PartnerConfig config;

    
    public FileStoragePartnerService fileStorage;
    
    public LeadPartnerService lead;
    
    public LogisticsPartnerService logistics;
    
    public ThemePartnerService theme;
    
    public WebhookPartnerService webhook;
    

    public PartnerClient(PartnerConfig config)   
    {
        this.config = config;
        
        this.fileStorage = new FileStoragePartnerService(config);
        
        this.lead = new LeadPartnerService(config);
        
        this.logistics = new LogisticsPartnerService(config);
        
        this.theme = new ThemePartnerService(config);
        
        this.webhook = new WebhookPartnerService(config);
        
    }

     public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
     }

}