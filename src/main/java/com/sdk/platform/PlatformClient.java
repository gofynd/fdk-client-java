package com.sdk.platform;

import lombok.Getter;
import lombok.Setter;


import com.sdk.platform.common.CommonPlatformService;

import com.sdk.platform.lead.LeadPlatformService;

import com.sdk.platform.theme.ThemePlatformService;

import com.sdk.platform.user.UserPlatformService;

import com.sdk.platform.content.ContentPlatformService;

import com.sdk.platform.billing.BillingPlatformService;

import com.sdk.platform.communication.CommunicationPlatformService;

import com.sdk.platform.payment.PaymentPlatformService;

import com.sdk.platform.order.OrderPlatformService;

import com.sdk.platform.catalog.CatalogPlatformService;

import com.sdk.platform.companyprofile.CompanyProfilePlatformService;

import com.sdk.platform.filestorage.FileStoragePlatformService;

import com.sdk.platform.share.SharePlatformService;

import com.sdk.platform.configuration.ConfigurationPlatformService;

import com.sdk.platform.cart.CartPlatformService;

import com.sdk.platform.rewards.RewardsPlatformService;

import com.sdk.platform.discount.DiscountPlatformService;

import com.sdk.platform.partner.PartnerPlatformService;

import com.sdk.platform.webhook.WebhookPlatformService;

import com.sdk.platform.audittrail.AuditTrailPlatformService;



@Getter
@Setter
public class PlatformClient {

    private PlatformConfig config;

    
    public CommonPlatformService common;
    
    public LeadPlatformService lead;
    
    public ThemePlatformService theme;
    
    public UserPlatformService user;
    
    public ContentPlatformService content;
    
    public BillingPlatformService billing;
    
    public CommunicationPlatformService communication;
    
    public PaymentPlatformService payment;
    
    public OrderPlatformService order;
    
    public CatalogPlatformService catalog;
    
    public CompanyProfilePlatformService companyProfile;
    
    public FileStoragePlatformService fileStorage;
    
    public SharePlatformService share;
    
    public ConfigurationPlatformService configuration;
    
    public CartPlatformService cart;
    
    public RewardsPlatformService rewards;
    
    public DiscountPlatformService discount;
    
    public PartnerPlatformService partner;
    
    public WebhookPlatformService webhook;
    
    public AuditTrailPlatformService auditTrail;
    

    public PlatformClient(PlatformConfig config)   
    {
        this.config = config;
        
        this.common = new CommonPlatformService(config);
        
        this.lead = new LeadPlatformService(config);
        
        this.theme = new ThemePlatformService(config);
        
        this.user = new UserPlatformService(config);
        
        this.content = new ContentPlatformService(config);
        
        this.billing = new BillingPlatformService(config);
        
        this.communication = new CommunicationPlatformService(config);
        
        this.payment = new PaymentPlatformService(config);
        
        this.order = new OrderPlatformService(config);
        
        this.catalog = new CatalogPlatformService(config);
        
        this.companyProfile = new CompanyProfilePlatformService(config);
        
        this.fileStorage = new FileStoragePlatformService(config);
        
        this.share = new SharePlatformService(config);
        
        this.configuration = new ConfigurationPlatformService(config);
        
        this.cart = new CartPlatformService(config);
        
        this.rewards = new RewardsPlatformService(config);
        
        this.discount = new DiscountPlatformService(config);
        
        this.partner = new PartnerPlatformService(config);
        
        this.webhook = new WebhookPlatformService(config);
        
        this.auditTrail = new AuditTrailPlatformService(config);
        
    }

    public ApplicationClient application(String applicationId) {
        return new ApplicationClient(config, applicationId);
    }

     public void setExtraHeader(String key, String value){
        this.config.getExtraHeaders().put(key, value);
     }

    @Getter
    public class ApplicationClient{

        private PlatformConfig config;

        
        public CommonPlatformService.ApplicationClient common;
        
        public LeadPlatformService.ApplicationClient lead;
        
        public ThemePlatformService.ApplicationClient theme;
        
        public UserPlatformService.ApplicationClient user;
        
        public ContentPlatformService.ApplicationClient content;
        
        public BillingPlatformService.ApplicationClient billing;
        
        public CommunicationPlatformService.ApplicationClient communication;
        
        public PaymentPlatformService.ApplicationClient payment;
        
        public OrderPlatformService.ApplicationClient order;
        
        public CatalogPlatformService.ApplicationClient catalog;
        
        public CompanyProfilePlatformService.ApplicationClient companyProfile;
        
        public FileStoragePlatformService.ApplicationClient fileStorage;
        
        public SharePlatformService.ApplicationClient share;
        
        public ConfigurationPlatformService.ApplicationClient configuration;
        
        public CartPlatformService.ApplicationClient cart;
        
        public RewardsPlatformService.ApplicationClient rewards;
        
        public DiscountPlatformService.ApplicationClient discount;
        
        public PartnerPlatformService.ApplicationClient partner;
        
        public WebhookPlatformService.ApplicationClient webhook;
        
        public AuditTrailPlatformService.ApplicationClient auditTrail;
        

        public ApplicationClient(PlatformConfig platformConfig, String applicationId) {
            this.config = platformConfig;
            
            this.common = new CommonPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.lead = new LeadPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.theme = new ThemePlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.user = new UserPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.content = new ContentPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.billing = new BillingPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.communication = new CommunicationPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.payment = new PaymentPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.order = new OrderPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.catalog = new CatalogPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.companyProfile = new CompanyProfilePlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.fileStorage = new FileStoragePlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.share = new SharePlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.configuration = new ConfigurationPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.cart = new CartPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.rewards = new RewardsPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.discount = new DiscountPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.partner = new PartnerPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.webhook = new WebhookPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.auditTrail = new AuditTrailPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
        }

    }
}