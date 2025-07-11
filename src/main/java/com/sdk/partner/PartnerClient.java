package com.sdk.partner;
import com.sdk.common.model.AccessTokenDto;
import lombok.Getter;
import lombok.Setter;
import java.net.CookieStore;
import com.sdk.common.CustomRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.Interceptor;
import okhttp3.Response;


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
        this.initialiseConfigAndServices(config);
    }

    public PartnerClient(String organizationId, String apiKey, String apiSecret, String domain, boolean useAutoRenewTimer)   
    {
        PartnerConfig config = new PartnerConfig(organizationId, apiKey, apiSecret, domain, useAutoRenewTimer);
        this.initialiseConfigAndServices(config);
    }

    public PartnerClient(String organizationId, String apiKey, String apiSecret, String domain)   
    {
        PartnerConfig config = new PartnerConfig(organizationId, apiKey, apiSecret, domain);
        this.initialiseConfigAndServices(config);
    }


    private void initialiseConfigAndServices(PartnerConfig config) {
        this.config = config;
        
        this.fileStorage = new FileStoragePartnerService(config);
        
        this.lead = new LeadPartnerService(config);
        
        this.logistics = new LogisticsPartnerService(config);
        
        this.theme = new ThemePartnerService(config);
        
        this.webhook = new WebhookPartnerService(config);
        
    }

    public CookieStore getPersistentCookieStore() {
        return this.config.getPersistentCookieStore();
    }

    public AccessTokenDto getAccessTokenObj(String grantType) throws IOException  {
        return this.config.getPartnerOauthClient().getAccessTokenObj(grantType);
    }

    public void setToken(AccessTokenDto token){
        this.config.getPartnerOauthClient().setToken(token);
    }

     public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
     }

    public Response request(String url, Map<String, String> queryParams, Map<String, String> headers, Object bodyObject, String method) throws IOException {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(this.config));
        CustomRequest customRequest = new CustomRequest(interceptorList);
        try {
            return customRequest.request(url, queryParams, headers, bodyObject, method, this.config.getDomain());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}