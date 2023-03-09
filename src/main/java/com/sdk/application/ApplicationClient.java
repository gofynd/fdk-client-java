package com.sdk.application;

import lombok.Getter;
import lombok.Setter;


import com.sdk.application.catalog.CatalogApplicationService;

import com.sdk.application.cart.CartApplicationService;

import com.sdk.application.common.CommonApplicationService;

import com.sdk.application.lead.LeadApplicationService;

import com.sdk.application.theme.ThemeApplicationService;

import com.sdk.application.user.UserApplicationService;

import com.sdk.application.content.ContentApplicationService;

import com.sdk.application.communication.CommunicationApplicationService;

import com.sdk.application.share.ShareApplicationService;

import com.sdk.application.filestorage.FileStorageApplicationService;

import com.sdk.application.configuration.ConfigurationApplicationService;

import com.sdk.application.payment.PaymentApplicationService;

import com.sdk.application.order.OrderApplicationService;

import com.sdk.application.rewards.RewardsApplicationService;

import com.sdk.application.poscart.PosCartApplicationService;

import com.sdk.application.logistic.LogisticApplicationService;

import com.sdk.application.documentengine.DocumentEngineApplicationService;


@Getter
@Setter
public class ApplicationClient {

    private ApplicationConfig config;

    
    public CatalogApplicationService catalog;
    
    public CartApplicationService cart;
    
    public CommonApplicationService common;
    
    public LeadApplicationService lead;
    
    public ThemeApplicationService theme;
    
    public UserApplicationService user;
    
    public ContentApplicationService content;
    
    public CommunicationApplicationService communication;
    
    public ShareApplicationService share;
    
    public FileStorageApplicationService fileStorage;
    
    public ConfigurationApplicationService configuration;
    
    public PaymentApplicationService payment;
    
    public OrderApplicationService order;
    
    public RewardsApplicationService rewards;
    
    public PosCartApplicationService posCart;
    
    public LogisticApplicationService logistic;
    
    public DocumentEngineApplicationService documentEngine;
    

    public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
    }

    public ApplicationClient(ApplicationConfig applicationConfig) {
        this.config = applicationConfig;
        
        this.catalog = new CatalogApplicationService(applicationConfig);
        
        this.cart = new CartApplicationService(applicationConfig);
        
        this.common = new CommonApplicationService(applicationConfig);
        
        this.lead = new LeadApplicationService(applicationConfig);
        
        this.theme = new ThemeApplicationService(applicationConfig);
        
        this.user = new UserApplicationService(applicationConfig);
        
        this.content = new ContentApplicationService(applicationConfig);
        
        this.communication = new CommunicationApplicationService(applicationConfig);
        
        this.share = new ShareApplicationService(applicationConfig);
        
        this.fileStorage = new FileStorageApplicationService(applicationConfig);
        
        this.configuration = new ConfigurationApplicationService(applicationConfig);
        
        this.payment = new PaymentApplicationService(applicationConfig);
        
        this.order = new OrderApplicationService(applicationConfig);
        
        this.rewards = new RewardsApplicationService(applicationConfig);
        
        this.posCart = new PosCartApplicationService(applicationConfig);
        
        this.logistic = new LogisticApplicationService(applicationConfig);
        
        this.documentEngine = new DocumentEngineApplicationService(applicationConfig);
        
    }
}