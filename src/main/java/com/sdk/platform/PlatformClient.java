package com.sdk.platform;

import lombok.Getter;
import lombok.Setter;
import com.sdk.common.CustomRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.Interceptor;
import okhttp3.Response;


import com.sdk.platform.analytics.AnalyticsPlatformService;

import com.sdk.platform.audittrail.AuditTrailPlatformService;

import com.sdk.platform.billing.BillingPlatformService;

import com.sdk.platform.cart.CartPlatformService;

import com.sdk.platform.catalog.CatalogPlatformService;

import com.sdk.platform.common.CommonPlatformService;

import com.sdk.platform.communication.CommunicationPlatformService;

import com.sdk.platform.companyprofile.CompanyProfilePlatformService;

import com.sdk.platform.configuration.ConfigurationPlatformService;

import com.sdk.platform.content.ContentPlatformService;

import com.sdk.platform.discount.DiscountPlatformService;

import com.sdk.platform.filestorage.FileStoragePlatformService;

import com.sdk.platform.finance.FinancePlatformService;

import com.sdk.platform.lead.LeadPlatformService;

import com.sdk.platform.serviceability.ServiceabilityPlatformService;

import com.sdk.platform.order.OrderPlatformService;

import com.sdk.platform.partner.PartnerPlatformService;

import com.sdk.platform.payment.PaymentPlatformService;

import com.sdk.platform.rewards.RewardsPlatformService;

import com.sdk.platform.share.SharePlatformService;

import com.sdk.platform.theme.ThemePlatformService;

import com.sdk.platform.user.UserPlatformService;

import com.sdk.platform.webhook.WebhookPlatformService;



@Getter
@Setter
public class PlatformClient {

    private PlatformConfig config;

    
    public AnalyticsPlatformService analytics;
    
    public AuditTrailPlatformService auditTrail;
    
    public BillingPlatformService billing;
    
    public CartPlatformService cart;
    
    public CatalogPlatformService catalog;
    
    public CommonPlatformService common;
    
    public CommunicationPlatformService communication;
    
    public CompanyProfilePlatformService companyProfile;
    
    public ConfigurationPlatformService configuration;
    
    public ContentPlatformService content;
    
    public DiscountPlatformService discount;
    
    public FileStoragePlatformService fileStorage;
    
    public FinancePlatformService finance;
    
    public LeadPlatformService lead;
    
    public ServiceabilityPlatformService serviceability;
    
    public OrderPlatformService order;
    
    public PartnerPlatformService partner;
    
    public PaymentPlatformService payment;
    
    public RewardsPlatformService rewards;
    
    public SharePlatformService share;
    
    public ThemePlatformService theme;
    
    public UserPlatformService user;
    
    public WebhookPlatformService webhook;
    

    public PlatformClient(PlatformConfig config)   
    {
        this.config = config;
        
        this.analytics = new AnalyticsPlatformService(config);
        
        this.auditTrail = new AuditTrailPlatformService(config);
        
        this.billing = new BillingPlatformService(config);
        
        this.cart = new CartPlatformService(config);
        
        this.catalog = new CatalogPlatformService(config);
        
        this.common = new CommonPlatformService(config);
        
        this.communication = new CommunicationPlatformService(config);
        
        this.companyProfile = new CompanyProfilePlatformService(config);
        
        this.configuration = new ConfigurationPlatformService(config);
        
        this.content = new ContentPlatformService(config);
        
        this.discount = new DiscountPlatformService(config);
        
        this.fileStorage = new FileStoragePlatformService(config);
        
        this.finance = new FinancePlatformService(config);
        
        this.lead = new LeadPlatformService(config);
        
        this.serviceability = new ServiceabilityPlatformService(config);
        
        this.order = new OrderPlatformService(config);
        
        this.partner = new PartnerPlatformService(config);
        
        this.payment = new PaymentPlatformService(config);
        
        this.rewards = new RewardsPlatformService(config);
        
        this.share = new SharePlatformService(config);
        
        this.theme = new ThemePlatformService(config);
        
        this.user = new UserPlatformService(config);
        
        this.webhook = new WebhookPlatformService(config);
        
    }

    public ApplicationClient application(String applicationId) {
        return new ApplicationClient(config, applicationId);
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

    @Getter
    public class ApplicationClient{

        private PlatformConfig config;

        
        public AnalyticsPlatformService.ApplicationClient analytics;
        
        public AuditTrailPlatformService.ApplicationClient auditTrail;
        
        public BillingPlatformService.ApplicationClient billing;
        
        public CartPlatformService.ApplicationClient cart;
        
        public CatalogPlatformService.ApplicationClient catalog;
        
        public CommonPlatformService.ApplicationClient common;
        
        public CommunicationPlatformService.ApplicationClient communication;
        
        public CompanyProfilePlatformService.ApplicationClient companyProfile;
        
        public ConfigurationPlatformService.ApplicationClient configuration;
        
        public ContentPlatformService.ApplicationClient content;
        
        public DiscountPlatformService.ApplicationClient discount;
        
        public FileStoragePlatformService.ApplicationClient fileStorage;
        
        public FinancePlatformService.ApplicationClient finance;
        
        public LeadPlatformService.ApplicationClient lead;
        
        public ServiceabilityPlatformService.ApplicationClient serviceability;
        
        public OrderPlatformService.ApplicationClient order;
        
        public PartnerPlatformService.ApplicationClient partner;
        
        public PaymentPlatformService.ApplicationClient payment;
        
        public RewardsPlatformService.ApplicationClient rewards;
        
        public SharePlatformService.ApplicationClient share;
        
        public ThemePlatformService.ApplicationClient theme;
        
        public UserPlatformService.ApplicationClient user;
        
        public WebhookPlatformService.ApplicationClient webhook;
        

        public ApplicationClient(PlatformConfig platformConfig, String applicationId) {
            this.config = platformConfig;
            
            this.analytics = new AnalyticsPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.auditTrail = new AuditTrailPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.billing = new BillingPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.cart = new CartPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.catalog = new CatalogPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.common = new CommonPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.communication = new CommunicationPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.companyProfile = new CompanyProfilePlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.configuration = new ConfigurationPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.content = new ContentPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.discount = new DiscountPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.fileStorage = new FileStoragePlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.finance = new FinancePlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.lead = new LeadPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.serviceability = new ServiceabilityPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.order = new OrderPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.partner = new PartnerPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.payment = new PaymentPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.rewards = new RewardsPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.share = new SharePlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.theme = new ThemePlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.user = new UserPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
            this.webhook = new WebhookPlatformService(platformConfig).new ApplicationClient(platformConfig, applicationId);
            
        }

    }
}