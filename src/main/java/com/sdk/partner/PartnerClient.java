package com.sdk.partner;

import lombok.Getter;
import lombok.Setter;


import com.sdk.partner.theme.ThemePartnerService;


@Getter
@Setter
public class PartnerClient {

    private PartnerConfig config;

    
    public ThemePartnerService theme;
    

    public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
    }

    public PartnerClient(PartnerConfig partnerConfig) {
        this.config = partnerConfig;
        
        this.theme = new ThemePartnerService(partnerConfig);
        
    }
}