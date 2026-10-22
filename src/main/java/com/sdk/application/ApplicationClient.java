package com.sdk.application;

import com.sdk.common.RequestSignerInterceptor;
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


import com.sdk.application.cart.CartApplicationService;

import com.sdk.application.catalog.CatalogApplicationService;

import com.sdk.application.common.CommonApplicationService;

import com.sdk.application.communication.CommunicationApplicationService;

import com.sdk.application.configuration.ConfigurationApplicationService;

import com.sdk.application.content.ContentApplicationService;

import com.sdk.application.filestorage.FileStorageApplicationService;

import com.sdk.application.finance.FinanceApplicationService;

import com.sdk.application.lead.LeadApplicationService;

import com.sdk.application.logistic.LogisticApplicationService;

import com.sdk.application.order.OrderApplicationService;

import com.sdk.application.payment.PaymentApplicationService;

import com.sdk.application.share.ShareApplicationService;

import com.sdk.application.theme.ThemeApplicationService;

import com.sdk.application.user.UserApplicationService;

import com.sdk.application.webhook.WebhookApplicationService;


@Getter
@Setter
public class ApplicationClient {

    private ApplicationConfig config;

    
    public CartApplicationService cart;
    
    public CatalogApplicationService catalog;
    
    public CommonApplicationService common;
    
    public CommunicationApplicationService communication;
    
    public ConfigurationApplicationService configuration;
    
    public ContentApplicationService content;
    
    public FileStorageApplicationService fileStorage;
    
    public FinanceApplicationService finance;
    
    public LeadApplicationService lead;
    
    public LogisticApplicationService logistic;
    
    public OrderApplicationService order;
    
    public PaymentApplicationService payment;
    
    public ShareApplicationService share;
    
    public ThemeApplicationService theme;
    
    public UserApplicationService user;
    
    public WebhookApplicationService webhook;
    

    public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
    }

    public ApplicationClient(ApplicationConfig config) {
        this.initialiseConfigAndServices(config);
    }

    public ApplicationClient(String applicationId, String applicationToken, String domain) {
        ApplicationConfig config = new ApplicationConfig(applicationId, applicationToken, domain);
        this.initialiseConfigAndServices(config);
    }

    public ApplicationClient(String applicationId, String applicationToken) {
        ApplicationConfig config = new ApplicationConfig(applicationId, applicationToken);
        this.initialiseConfigAndServices(config);
    }

    private void initialiseConfigAndServices(ApplicationConfig config) {
        this.config = config;
        
        this.cart = new CartApplicationService(config);
        
        this.catalog = new CatalogApplicationService(config);
        
        this.common = new CommonApplicationService(config);
        
        this.communication = new CommunicationApplicationService(config);
        
        this.configuration = new ConfigurationApplicationService(config);
        
        this.content = new ContentApplicationService(config);
        
        this.fileStorage = new FileStorageApplicationService(config);
        
        this.finance = new FinanceApplicationService(config);
        
        this.lead = new LeadApplicationService(config);
        
        this.logistic = new LogisticApplicationService(config);
        
        this.order = new OrderApplicationService(config);
        
        this.payment = new PaymentApplicationService(config);
        
        this.share = new ShareApplicationService(config);
        
        this.theme = new ThemeApplicationService(config);
        
        this.user = new UserApplicationService(config);
        
        this.webhook = new WebhookApplicationService(config);
        
    }
    public Response request(String url, Map<String, String> queryParams, Map<String, String> headers, Object bodyObject, String method) throws IOException {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(this.config));
        interceptorList.add(new RequestSignerInterceptor());
        CustomRequest customRequest = new CustomRequest(interceptorList);
        try {
            return customRequest.request(url, queryParams, headers, bodyObject, method, this.config.getDomain());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        

    public CookieStore getPersistentCookieStore() {
        return this.config.getPersistentCookieStore();
    }
}