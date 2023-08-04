package com.sdk.partner;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class PartnerClient {

    private PartnerConfig config;

    

    public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
    }

    public PartnerClient(PartnerConfig partnerConfig) {
        this.config = partnerConfig;
        
    }
}