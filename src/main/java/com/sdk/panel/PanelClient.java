package com.sdk.panel;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class PanelClient {

    private PanelConfig config;

    

    public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
    }

    public PanelClient(PanelConfig panelConfig) {
        this.config = panelConfig;
        
    }
}