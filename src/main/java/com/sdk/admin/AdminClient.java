package com.sdk.admin;

import lombok.Getter;
import lombok.Setter;


import com.sdk.admin.catalog.CatalogAdminService;

import com.sdk.admin.communication.CommunicationAdminService;

import com.sdk.admin.finance.FinanceAdminService;

import com.sdk.admin.partner.PartnerAdminService;

import com.sdk.admin.payment.PaymentAdminService;


@Getter
@Setter
public class AdminClient {

    private AdminConfig config;

    
    public CatalogAdminService catalog;
    
    public CommunicationAdminService communication;
    
    public FinanceAdminService finance;
    
    public PartnerAdminService partner;
    
    public PaymentAdminService payment;
    

    public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
    }

    public AdminClient(AdminConfig adminConfig) {
        this.config = adminConfig;
        
        this.catalog = new CatalogAdminService(adminConfig);
        
        this.communication = new CommunicationAdminService(adminConfig);
        
        this.finance = new FinanceAdminService(adminConfig);
        
        this.partner = new PartnerAdminService(adminConfig);
        
        this.payment = new PaymentAdminService(adminConfig);
        
    }
}