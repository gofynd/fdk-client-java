package com.sdk.panel;

import lombok.Getter;
import lombok.Setter;


import com.sdk.panel.theme.ThemePanelService;


@Getter
@Setter
public class PanelClient {

    private PanelConfig config;

    
    public ThemePanelService theme;
    

    public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
    }

    public PanelClient(PanelConfig panelConfig) {
        this.config = panelConfig;
        
        this.theme = new ThemePanelService(panelConfig);
        
    }
}