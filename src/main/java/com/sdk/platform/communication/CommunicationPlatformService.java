package com.sdk.platform.communication;

import com.sdk.common.*;
import com.sdk.common.model.FDKException;
import com.sdk.common.model.FDKServerResponseError;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.platform.*;


public class CommunicationPlatformService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private CommunicationPlatformApiList communicationPlatformApiList;

    public CommunicationPlatformService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.communicationPlatformApiList = generateCommunicationPlatformApiList(this.platformConfig.getPersistentCookieStore());
    }

    private CommunicationPlatformApiList generateCommunicationPlatformApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),CommunicationPlatformApiList.class, interceptorList, cookieStore);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public CommunicationPlatformModels.SystemNotifications getSystemNotifications(Integer pageNo, Integer pageSize, String sort, String query) throws FDKServerResponseError, FDKException {
        return this.getSystemNotifications(pageNo, pageSize, sort, query, new HashMap<>());
    }

    public CommunicationPlatformModels.SystemNotifications getSystemNotifications(Integer pageNo, Integer pageSize, String sort, String query, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.SystemNotifications> response = null;
            try {
                response = communicationPlatformApiList.getSystemNotifications(this.companyId, pageNo, pageSize, sort, query, requestHeaders).execute();
                if (!response.isSuccessful()) {
                    throw new FDKServerResponseError(response.code(),
                                            response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                            response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                            response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getSystemNotifications
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CommunicationPlatformModels.SystemNotifications> getSystemNotificationsPagination(
        Integer pageSize ,
        String sort ,
        String query 
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CommunicationPlatformModels.SystemNotifications> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CommunicationPlatformModels.SystemNotifications callback = this.getSystemNotifications(
                
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 sort,
                 query
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }
    
    
    
    
    
    
    
    
    
    
    



public class ApplicationClient {
    private PlatformConfig platformConfig;

    private String applicationId;

    private String companyId;

    public ApplicationClient(PlatformConfig platformConfig, String applicationId) {
        this.platformConfig = platformConfig;
        this.applicationId = applicationId;
        this.companyId = this.platformConfig.getCompanyId();
    }

    public CommunicationPlatformModels.EngineRes sendCommunicationAsynchronously(CommunicationPlatformModels.EngineReq body) throws FDKServerResponseError, FDKException {
        return this.sendCommunicationAsynchronously(body, new HashMap<>());
    }

    public CommunicationPlatformModels.EngineRes sendCommunicationAsynchronously(CommunicationPlatformModels.EngineReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.EngineRes> response = null;
            try {
            response = communicationPlatformApiList.sendCommunicationAsynchronously(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.SendInstantRes sendCommunicationSynchronously(CommunicationPlatformModels.EngineReq body) throws FDKServerResponseError, FDKException {
        return this.sendCommunicationSynchronously(body, new HashMap<>());
    }

    public CommunicationPlatformModels.SendInstantRes sendCommunicationSynchronously(CommunicationPlatformModels.EngineReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.SendInstantRes> response = null;
            try {
            response = communicationPlatformApiList.sendCommunicationSynchronously(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.EventSubscriptions getEventSubscriptions(Integer pageNo, Integer pageSize, String populate) throws FDKServerResponseError, FDKException {
        return this.getEventSubscriptions(pageNo, pageSize, populate, new HashMap<>());
    }

    public CommunicationPlatformModels.EventSubscriptions getEventSubscriptions(Integer pageNo, Integer pageSize, String populate, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.EventSubscriptions> response = null;
            try {
            response = communicationPlatformApiList.getEventSubscriptions(this.companyId, this.applicationId, pageNo, pageSize, populate, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getEventSubscriptions
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CommunicationPlatformModels.EventSubscriptions> getEventSubscriptionsPagination(
        Integer pageSize,
        String populate
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CommunicationPlatformModels.EventSubscriptions> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CommunicationPlatformModels.EventSubscriptions callback = this.getEventSubscriptions(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 populate
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }

    public List<CommunicationPlatformModels.EventSubscriptionsBulkUpdateRes> createEventSubscriptionsByBulk(CommunicationPlatformModels.EventSubscriptionsBulkUpdateReq body) throws FDKServerResponseError, FDKException {
        return this.createEventSubscriptionsByBulk(body, new HashMap<>());
    }

    public List<CommunicationPlatformModels.EventSubscriptionsBulkUpdateRes> createEventSubscriptionsByBulk(CommunicationPlatformModels.EventSubscriptionsBulkUpdateReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<List<CommunicationPlatformModels.EventSubscriptionsBulkUpdateRes>> response = null;
            try {
            response = communicationPlatformApiList.createEventSubscriptionsByBulk(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.EmailTemplates getEmailTemplates(Integer pageNo, Integer pageSize, String sort, String query) throws FDKServerResponseError, FDKException {
        return this.getEmailTemplates(pageNo, pageSize, sort, query, new HashMap<>());
    }

    public CommunicationPlatformModels.EmailTemplates getEmailTemplates(Integer pageNo, Integer pageSize, String sort, String query, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.EmailTemplates> response = null;
            try {
            response = communicationPlatformApiList.getEmailTemplates(this.companyId, this.applicationId, pageNo, pageSize, sort, query, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getEmailTemplates
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CommunicationPlatformModels.EmailTemplates> getEmailTemplatesPagination(
        Integer pageSize,
        String sort,
        String query
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CommunicationPlatformModels.EmailTemplates> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CommunicationPlatformModels.EmailTemplates callback = this.getEmailTemplates(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 sort,
                 query
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }

    public CommunicationPlatformModels.EmailTemplate createEmailTemplate(CommunicationPlatformModels.EmailTemplateReq body) throws FDKServerResponseError, FDKException {
        return this.createEmailTemplate(body, new HashMap<>());
    }

    public CommunicationPlatformModels.EmailTemplate createEmailTemplate(CommunicationPlatformModels.EmailTemplateReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.EmailTemplate> response = null;
            try {
            response = communicationPlatformApiList.createEmailTemplate(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.EmailTemplate getEmailTemplateById(String id) throws FDKServerResponseError, FDKException {
        return this.getEmailTemplateById(id, new HashMap<>());
    }

    public CommunicationPlatformModels.EmailTemplate getEmailTemplateById(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.EmailTemplate> response = null;
            try {
            response = communicationPlatformApiList.getEmailTemplateById(this.companyId, this.applicationId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.EmailTemplate updateEmailTemplateById(String id, CommunicationPlatformModels.EmailTemplateReq body) throws FDKServerResponseError, FDKException {
        return this.updateEmailTemplateById(id, body, new HashMap<>());
    }

    public CommunicationPlatformModels.EmailTemplate updateEmailTemplateById(String id, CommunicationPlatformModels.EmailTemplateReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.EmailTemplate> response = null;
            try {
            response = communicationPlatformApiList.updateEmailTemplateById(this.companyId, this.applicationId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.BasicDelete deleteEmailTemplateById(String id) throws FDKServerResponseError, FDKException {
        return this.deleteEmailTemplateById(id, new HashMap<>());
    }

    public CommunicationPlatformModels.BasicDelete deleteEmailTemplateById(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.BasicDelete> response = null;
            try {
            response = communicationPlatformApiList.deleteEmailTemplateById(this.companyId, this.applicationId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public List<CommunicationPlatformModels.SystemEmailTemplate> getSystemEmailTemplates() throws FDKServerResponseError, FDKException {
        return this.getSystemEmailTemplates(new HashMap<>());
    }

    public List<CommunicationPlatformModels.SystemEmailTemplate> getSystemEmailTemplates(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<List<CommunicationPlatformModels.SystemEmailTemplate>> response = null;
            try {
            response = communicationPlatformApiList.getSystemEmailTemplates(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.SubscribedEmailTemplates getSubscribedEmailTemplates(Integer pageNo, Integer pageSize, String query) throws FDKServerResponseError, FDKException {
        return this.getSubscribedEmailTemplates(pageNo, pageSize, query, new HashMap<>());
    }

    public CommunicationPlatformModels.SubscribedEmailTemplates getSubscribedEmailTemplates(Integer pageNo, Integer pageSize, String query, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.SubscribedEmailTemplates> response = null;
            try {
            response = communicationPlatformApiList.getSubscribedEmailTemplates(this.companyId, this.applicationId, pageNo, pageSize, query, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.EmailProviders getEmailProviders(Integer pageNo, Integer pageSize, String sort, String query) throws FDKServerResponseError, FDKException {
        return this.getEmailProviders(pageNo, pageSize, sort, query, new HashMap<>());
    }

    public CommunicationPlatformModels.EmailProviders getEmailProviders(Integer pageNo, Integer pageSize, String sort, String query, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.EmailProviders> response = null;
            try {
            response = communicationPlatformApiList.getEmailProviders(this.companyId, this.applicationId, pageNo, pageSize, sort, query, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getEmailProviders
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CommunicationPlatformModels.EmailProviders> getEmailProvidersPagination(
        Integer pageSize,
        String sort,
        String query
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CommunicationPlatformModels.EmailProviders> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CommunicationPlatformModels.EmailProviders callback = this.getEmailProviders(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 sort,
                 query
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }

    public CommunicationPlatformModels.EmailProvider createEmailProvider(CommunicationPlatformModels.EmailProviderReq body) throws FDKServerResponseError, FDKException {
        return this.createEmailProvider(body, new HashMap<>());
    }

    public CommunicationPlatformModels.EmailProvider createEmailProvider(CommunicationPlatformModels.EmailProviderReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.EmailProvider> response = null;
            try {
            response = communicationPlatformApiList.createEmailProvider(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.EmailProvider getEmailProviderById(String id) throws FDKServerResponseError, FDKException {
        return this.getEmailProviderById(id, new HashMap<>());
    }

    public CommunicationPlatformModels.EmailProvider getEmailProviderById(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.EmailProvider> response = null;
            try {
            response = communicationPlatformApiList.getEmailProviderById(this.companyId, this.applicationId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.EmailProvider updateEmailProviderById(String id, CommunicationPlatformModels.EmailProviderReq body) throws FDKServerResponseError, FDKException {
        return this.updateEmailProviderById(id, body, new HashMap<>());
    }

    public CommunicationPlatformModels.EmailProvider updateEmailProviderById(String id, CommunicationPlatformModels.EmailProviderReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.EmailProvider> response = null;
            try {
            response = communicationPlatformApiList.updateEmailProviderById(this.companyId, this.applicationId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public List<CommunicationPlatformModels.DefaultEmailProviders> getDefaultEmailProviders() throws FDKServerResponseError, FDKException {
        return this.getDefaultEmailProviders(new HashMap<>());
    }

    public List<CommunicationPlatformModels.DefaultEmailProviders> getDefaultEmailProviders(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<List<CommunicationPlatformModels.DefaultEmailProviders>> response = null;
            try {
            response = communicationPlatformApiList.getDefaultEmailProviders(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.SmsProviders getSmsProviders(Integer pageNo, Integer pageSize, String sort, String query) throws FDKServerResponseError, FDKException {
        return this.getSmsProviders(pageNo, pageSize, sort, query, new HashMap<>());
    }

    public CommunicationPlatformModels.SmsProviders getSmsProviders(Integer pageNo, Integer pageSize, String sort, String query, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.SmsProviders> response = null;
            try {
            response = communicationPlatformApiList.getSmsProviders(this.companyId, this.applicationId, pageNo, pageSize, sort, query, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.SmsProvider createSmsProvider(CommunicationPlatformModels.SmsProviderReq body) throws FDKServerResponseError, FDKException {
        return this.createSmsProvider(body, new HashMap<>());
    }

    public CommunicationPlatformModels.SmsProvider createSmsProvider(CommunicationPlatformModels.SmsProviderReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.SmsProvider> response = null;
            try {
            response = communicationPlatformApiList.createSmsProvider(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.SmsProvider getSmsProviderById(String id) throws FDKServerResponseError, FDKException {
        return this.getSmsProviderById(id, new HashMap<>());
    }

    public CommunicationPlatformModels.SmsProvider getSmsProviderById(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.SmsProvider> response = null;
            try {
            response = communicationPlatformApiList.getSmsProviderById(this.companyId, this.applicationId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.SmsProvider updateSmsProviderById(String id, CommunicationPlatformModels.SmsProviderReq body) throws FDKServerResponseError, FDKException {
        return this.updateSmsProviderById(id, body, new HashMap<>());
    }

    public CommunicationPlatformModels.SmsProvider updateSmsProviderById(String id, CommunicationPlatformModels.SmsProviderReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.SmsProvider> response = null;
            try {
            response = communicationPlatformApiList.updateSmsProviderById(this.companyId, this.applicationId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public List<CommunicationPlatformModels.DefaultSmsProviders> getDefaultSmsProviders() throws FDKServerResponseError, FDKException {
        return this.getDefaultSmsProviders(new HashMap<>());
    }

    public List<CommunicationPlatformModels.DefaultSmsProviders> getDefaultSmsProviders(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<List<CommunicationPlatformModels.DefaultSmsProviders>> response = null;
            try {
            response = communicationPlatformApiList.getDefaultSmsProviders(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.SmsTemplates getSmsTemplates(Integer pageNo, Integer pageSize, String sort, String query) throws FDKServerResponseError, FDKException {
        return this.getSmsTemplates(pageNo, pageSize, sort, query, new HashMap<>());
    }

    public CommunicationPlatformModels.SmsTemplates getSmsTemplates(Integer pageNo, Integer pageSize, String sort, String query, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.SmsTemplates> response = null;
            try {
            response = communicationPlatformApiList.getSmsTemplates(this.companyId, this.applicationId, pageNo, pageSize, sort, query, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getSmsTemplates
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CommunicationPlatformModels.SmsTemplates> getSmsTemplatesPagination(
        Integer pageSize,
        String sort,
        String query
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CommunicationPlatformModels.SmsTemplates> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CommunicationPlatformModels.SmsTemplates callback = this.getSmsTemplates(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 sort,
                 query
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }

    public CommunicationPlatformModels.SmsTemplate createSmsTemplate(CommunicationPlatformModels.SmsTemplateReq body) throws FDKServerResponseError, FDKException {
        return this.createSmsTemplate(body, new HashMap<>());
    }

    public CommunicationPlatformModels.SmsTemplate createSmsTemplate(CommunicationPlatformModels.SmsTemplateReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.SmsTemplate> response = null;
            try {
            response = communicationPlatformApiList.createSmsTemplate(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.SmsTemplate getSmsTemplateById(String id) throws FDKServerResponseError, FDKException {
        return this.getSmsTemplateById(id, new HashMap<>());
    }

    public CommunicationPlatformModels.SmsTemplate getSmsTemplateById(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.SmsTemplate> response = null;
            try {
            response = communicationPlatformApiList.getSmsTemplateById(this.companyId, this.applicationId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.SmsTemplate updateSmsTemplateById(String id, CommunicationPlatformModels.SmsTemplateReq body) throws FDKServerResponseError, FDKException {
        return this.updateSmsTemplateById(id, body, new HashMap<>());
    }

    public CommunicationPlatformModels.SmsTemplate updateSmsTemplateById(String id, CommunicationPlatformModels.SmsTemplateReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.SmsTemplate> response = null;
            try {
            response = communicationPlatformApiList.updateSmsTemplateById(this.companyId, this.applicationId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.BasicDelete deleteSmsTemplateById(String id) throws FDKServerResponseError, FDKException {
        return this.deleteSmsTemplateById(id, new HashMap<>());
    }

    public CommunicationPlatformModels.BasicDelete deleteSmsTemplateById(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.BasicDelete> response = null;
            try {
            response = communicationPlatformApiList.deleteSmsTemplateById(this.companyId, this.applicationId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public List<CommunicationPlatformModels.SystemSmsTemplates> getSystemSmsTemplates() throws FDKServerResponseError, FDKException {
        return this.getSystemSmsTemplates(new HashMap<>());
    }

    public List<CommunicationPlatformModels.SystemSmsTemplates> getSystemSmsTemplates(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<List<CommunicationPlatformModels.SystemSmsTemplates>> response = null;
            try {
            response = communicationPlatformApiList.getSystemSmsTemplates(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.SubscribedSmsTemplates getSubscribedSmsTemplates(Integer pageNo, Integer pageSize, String query) throws FDKServerResponseError, FDKException {
        return this.getSubscribedSmsTemplates(pageNo, pageSize, query, new HashMap<>());
    }

    public CommunicationPlatformModels.SubscribedSmsTemplates getSubscribedSmsTemplates(Integer pageNo, Integer pageSize, String query, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.SubscribedSmsTemplates> response = null;
            try {
            response = communicationPlatformApiList.getSubscribedSmsTemplates(this.companyId, this.applicationId, pageNo, pageSize, query, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.TriggerJobRes triggerCampaignJob(CommunicationPlatformModels.TriggerJobReq body) throws FDKServerResponseError, FDKException {
        return this.triggerCampaignJob(body, new HashMap<>());
    }

    public CommunicationPlatformModels.TriggerJobRes triggerCampaignJob(CommunicationPlatformModels.TriggerJobReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.TriggerJobRes> response = null;
            try {
            response = communicationPlatformApiList.triggerCampaignJob(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.Jobs getJobs(Integer pageNo, Integer pageSize, String sort, String query) throws FDKServerResponseError, FDKException {
        return this.getJobs(pageNo, pageSize, sort, query, new HashMap<>());
    }

    public CommunicationPlatformModels.Jobs getJobs(Integer pageNo, Integer pageSize, String sort, String query, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.Jobs> response = null;
            try {
            response = communicationPlatformApiList.getJobs(this.companyId, this.applicationId, pageNo, pageSize, sort, query, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getJobs
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CommunicationPlatformModels.Jobs> getJobsPagination(
        Integer pageSize,
        String sort,
        String query
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CommunicationPlatformModels.Jobs> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CommunicationPlatformModels.Jobs callback = this.getJobs(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 sort,
                 query
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }

    public CommunicationPlatformModels.JobLogs getJobLogs(Integer pageNo, Integer pageSize, String sort, String query) throws FDKServerResponseError, FDKException {
        return this.getJobLogs(pageNo, pageSize, sort, query, new HashMap<>());
    }

    public CommunicationPlatformModels.JobLogs getJobLogs(Integer pageNo, Integer pageSize, String sort, String query, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.JobLogs> response = null;
            try {
            response = communicationPlatformApiList.getJobLogs(this.companyId, this.applicationId, pageNo, pageSize, sort, query, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getJobLogs
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CommunicationPlatformModels.JobLogs> getJobLogsPagination(
        Integer pageSize,
        String sort,
        String query
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CommunicationPlatformModels.JobLogs> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CommunicationPlatformModels.JobLogs callback = this.getJobLogs(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 sort,
                 query
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }

    public CommunicationPlatformModels.GlobalVariablesGetRes getGlobalVariables() throws FDKServerResponseError, FDKException {
        return this.getGlobalVariables(new HashMap<>());
    }

    public CommunicationPlatformModels.GlobalVariablesGetRes getGlobalVariables(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.GlobalVariablesGetRes> response = null;
            try {
            response = communicationPlatformApiList.getGlobalVariables(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.GlobalVariablesPostRes postGlobalVariables(CommunicationPlatformModels.GlobalVariablesReq body) throws FDKServerResponseError, FDKException {
        return this.postGlobalVariables(body, new HashMap<>());
    }

    public CommunicationPlatformModels.GlobalVariablesPostRes postGlobalVariables(CommunicationPlatformModels.GlobalVariablesReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.GlobalVariablesPostRes> response = null;
            try {
            response = communicationPlatformApiList.postGlobalVariables(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.Logs getCommunicationLogs(Integer pageNo, Integer pageSize, String sort, Object query) throws FDKServerResponseError, FDKException {
        return this.getCommunicationLogs(pageNo, pageSize, sort, query, new HashMap<>());
    }

    public CommunicationPlatformModels.Logs getCommunicationLogs(Integer pageNo, Integer pageSize, String sort, Object query, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.Logs> response = null;
            try {
            response = communicationPlatformApiList.getCommunicationLogs(this.companyId, this.applicationId, pageNo, pageSize, sort, query, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getCommunicationLogs
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CommunicationPlatformModels.Logs> getCommunicationLogsPagination(
        Integer pageSize,
        String sort,
        Object query
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CommunicationPlatformModels.Logs> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CommunicationPlatformModels.Logs callback = this.getCommunicationLogs(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 sort,
                 query
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }

    public CommunicationPlatformModels.AppProvider updateAppProviders(CommunicationPlatformModels.AppProviderReq body) throws FDKServerResponseError, FDKException {
        return this.updateAppProviders(body, new HashMap<>());
    }

    public CommunicationPlatformModels.AppProvider updateAppProviders(CommunicationPlatformModels.AppProviderReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.AppProvider> response = null;
            try {
            response = communicationPlatformApiList.updateAppProviders(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.AppProvider getAppProviders() throws FDKServerResponseError, FDKException {
        return this.getAppProviders(new HashMap<>());
    }

    public CommunicationPlatformModels.AppProvider getAppProviders(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.AppProvider> response = null;
            try {
            response = communicationPlatformApiList.getAppProviders(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.GlobalProviders getGlobalProviders() throws FDKServerResponseError, FDKException {
        return this.getGlobalProviders(new HashMap<>());
    }

    public CommunicationPlatformModels.GlobalProviders getGlobalProviders(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.GlobalProviders> response = null;
            try {
            response = communicationPlatformApiList.getGlobalProviders(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.Audiences getAudiences(Integer pageNo, Integer pageSize, String sort, String query) throws FDKServerResponseError, FDKException {
        return this.getAudiences(pageNo, pageSize, sort, query, new HashMap<>());
    }

    public CommunicationPlatformModels.Audiences getAudiences(Integer pageNo, Integer pageSize, String sort, String query, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.Audiences> response = null;
            try {
            response = communicationPlatformApiList.getAudiences(this.companyId, this.applicationId, pageNo, pageSize, sort, query, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    /**
    * Summary: get paginator for getAudiences
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<CommunicationPlatformModels.Audiences> getAudiencesPagination(
        Integer pageSize,
        String sort,
        String query
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<CommunicationPlatformModels.Audiences> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            CommunicationPlatformModels.Audiences callback = this.getAudiences(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                ,
                 sort,
                 query
            );
            boolean hasNext = Objects.nonNull(callback.getPage().getHasNext())?callback.getPage().getHasNext():false;
            paginator.setPaginator(hasNext, callback.getPage().getNextId(), paginator.getPageNo() + 1);
            return callback;
        }catch(Exception e) {
            return null;
        }
    });
    return paginator ;
    }

    public CommunicationPlatformModels.Audience createAudience(CommunicationPlatformModels.AudienceReq body) throws FDKServerResponseError, FDKException {
        return this.createAudience(body, new HashMap<>());
    }

    public CommunicationPlatformModels.Audience createAudience(CommunicationPlatformModels.AudienceReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.Audience> response = null;
            try {
            response = communicationPlatformApiList.createAudience(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.Audience getAudienceById(String id) throws FDKServerResponseError, FDKException {
        return this.getAudienceById(id, new HashMap<>());
    }

    public CommunicationPlatformModels.Audience getAudienceById(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.Audience> response = null;
            try {
            response = communicationPlatformApiList.getAudienceById(this.companyId, this.applicationId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.GetNRecordsCsvRes getNSampleRecordsFromCsv(CommunicationPlatformModels.GetNRecordsCsvReq body) throws FDKServerResponseError, FDKException {
        return this.getNSampleRecordsFromCsv(body, new HashMap<>());
    }

    public CommunicationPlatformModels.GetNRecordsCsvRes getNSampleRecordsFromCsv(CommunicationPlatformModels.GetNRecordsCsvReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.GetNRecordsCsvRes> response = null;
            try {
            response = communicationPlatformApiList.getNSampleRecordsFromCsv(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.Campaigns getCampaigns(String query, Integer pageNo, Integer pageSize, String sort) throws FDKServerResponseError, FDKException {
        return this.getCampaigns(query, pageNo, pageSize, sort, new HashMap<>());
    }

    public CommunicationPlatformModels.Campaigns getCampaigns(String query, Integer pageNo, Integer pageSize, String sort, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.Campaigns> response = null;
            try {
            response = communicationPlatformApiList.getCampaigns(this.companyId, this.applicationId, query, pageNo, pageSize, sort, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.Campaign createCampaign(CommunicationPlatformModels.CampaignReq body) throws FDKServerResponseError, FDKException {
        return this.createCampaign(body, new HashMap<>());
    }

    public CommunicationPlatformModels.Campaign createCampaign(CommunicationPlatformModels.CampaignReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.Campaign> response = null;
            try {
            response = communicationPlatformApiList.createCampaign(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.Campaign getCampaignById(String id) throws FDKServerResponseError, FDKException {
        return this.getCampaignById(id, new HashMap<>());
    }

    public CommunicationPlatformModels.Campaign getCampaignById(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.Campaign> response = null;
            try {
            response = communicationPlatformApiList.getCampaignById(this.companyId, this.applicationId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.Campaign updateCampaignById(String id, CommunicationPlatformModels.CampaignReq body) throws FDKServerResponseError, FDKException {
        return this.updateCampaignById(id, body, new HashMap<>());
    }

    public CommunicationPlatformModels.Campaign updateCampaignById(String id, CommunicationPlatformModels.CampaignReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.Campaign> response = null;
            try {
            response = communicationPlatformApiList.updateCampaignById(this.companyId, this.applicationId, id, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.GetStats getStatsOfCampaignById(String id) throws FDKServerResponseError, FDKException {
        return this.getStatsOfCampaignById(id, new HashMap<>());
    }

    public CommunicationPlatformModels.GetStats getStatsOfCampaignById(String id, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.GetStats> response = null;
            try {
            response = communicationPlatformApiList.getStatsOfCampaignById(this.companyId, this.applicationId, id, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.SendOtpCommsRes sendOtp(Boolean ci, CommunicationPlatformModels.SendOtpCommsReq body) throws FDKServerResponseError, FDKException {
        return this.sendOtp(ci, body, new HashMap<>());
    }

    public CommunicationPlatformModels.SendOtpCommsRes sendOtp(Boolean ci, CommunicationPlatformModels.SendOtpCommsReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.SendOtpCommsRes> response = null;
            try {
            response = communicationPlatformApiList.sendOtp(this.companyId, this.applicationId, ci, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.VerifyOtpCommsSuccessRes verfiyOtp(CommunicationPlatformModels.VerifyOtpCommsReq body) throws FDKServerResponseError, FDKException {
        return this.verfiyOtp(body, new HashMap<>());
    }

    public CommunicationPlatformModels.VerifyOtpCommsSuccessRes verfiyOtp(CommunicationPlatformModels.VerifyOtpCommsReq body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.VerifyOtpCommsSuccessRes> response = null;
            try {
            response = communicationPlatformApiList.verfiyOtp(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.OtpConfiguration getOtpConfiguration() throws FDKServerResponseError, FDKException {
        return this.getOtpConfiguration(new HashMap<>());
    }

    public CommunicationPlatformModels.OtpConfiguration getOtpConfiguration(Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.OtpConfiguration> response = null;
            try {
            response = communicationPlatformApiList.getOtpConfiguration(this.companyId, this.applicationId, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    public CommunicationPlatformModels.OtpConfiguration updateOtpConfiguration(CommunicationPlatformModels.OtpConfiguration body) throws FDKServerResponseError, FDKException {
        return this.updateOtpConfiguration(body, new HashMap<>());
    }

    public CommunicationPlatformModels.OtpConfiguration updateOtpConfiguration(CommunicationPlatformModels.OtpConfiguration body, Map<String, String> requestHeaders) throws FDKServerResponseError, FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<CommunicationPlatformModels.OtpConfiguration> response = null;
            try {
            response = communicationPlatformApiList.updateOtpConfiguration(this.companyId, this.applicationId, body, requestHeaders).execute();
                if (!response.isSuccessful()) {
                        throw new FDKServerResponseError(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage() != null ? e.getMessage() : Fields.UNKNOWN_ERROR, e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

}


private interface Fields {
    String UNKNOWN_ERROR = "Unknown error";
}

}