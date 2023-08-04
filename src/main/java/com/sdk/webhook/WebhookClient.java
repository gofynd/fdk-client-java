package com.sdk.webhook;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class WebhookClient {

    private WebhookConfig config;

    

    public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
    }

    public WebhookClient(WebhookConfig webhookConfig) {
        this.config = webhookConfig;
        
    }
}