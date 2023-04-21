package com.sdk.;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class Client {

    private Config config;

    

    public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
    }

    public Client(Config Config) {
        this.config = Config;
        
    }
}