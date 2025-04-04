package com.sdk.application;

import com.sdk.common.RequestSignerInterceptor;
import lombok.Getter;
import lombok.Setter;
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

import com.sdk.application.rewards.RewardsApplicationService;

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
    
    public RewardsApplicationService rewards;
    
    public ShareApplicationService share;
    
    public ThemeApplicationService theme;
    
    public UserApplicationService user;
    
    public WebhookApplicationService webhook;
    

    public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
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

    public ApplicationClient(ApplicationConfig applicationConfig) {
        this.config = applicationConfig;
        
        this.cart = new CartApplicationService(applicationConfig);
        
        this.catalog = new CatalogApplicationService(applicationConfig);
        
        this.common = new CommonApplicationService(applicationConfig);
        
        this.communication = new CommunicationApplicationService(applicationConfig);
        
        this.configuration = new ConfigurationApplicationService(applicationConfig);
        
        this.content = new ContentApplicationService(applicationConfig);
        
        this.fileStorage = new FileStorageApplicationService(applicationConfig);
        
        this.finance = new FinanceApplicationService(applicationConfig);
        
        this.lead = new LeadApplicationService(applicationConfig);
        
        this.logistic = new LogisticApplicationService(applicationConfig);
        
        this.order = new OrderApplicationService(applicationConfig);
        
        this.payment = new PaymentApplicationService(applicationConfig);
        
        this.rewards = new RewardsApplicationService(applicationConfig);
        
        this.share = new ShareApplicationService(applicationConfig);
        
        this.theme = new ThemeApplicationService(applicationConfig);
        
        this.user = new UserApplicationService(applicationConfig);
        
        this.webhook = new WebhookApplicationService(applicationConfig);
        
    }
}