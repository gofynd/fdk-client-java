package com.sdk.partner;

import lombok.Getter;
import lombok.Setter;


import com.sdk.partner.filestorage.FileStoragePartnerService;

import com.sdk.partner.theme.ThemePartnerService;



@Getter
@Setter
public class PartnerClient {

    private PartnerConfig config;

    
    public FileStoragePartnerService fileStorage;
    
    public ThemePartnerService theme;
    

    public PartnerClient(PartnerConfig config)   
    {
        this.config = config;
        
        this.fileStorage = new FileStoragePartnerService(config);
        
        this.theme = new ThemePartnerService(config);
        
    }

     public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
     }

}