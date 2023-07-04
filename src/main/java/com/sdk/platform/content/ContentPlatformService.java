package com.sdk.platform.content;

import com.sdk.common.*;
import com.sdk.common.model.FDKException;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;

import com.sdk.platform.PlatformConfig;







public class ContentPlatformService {
    private PlatformConfig platformConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private String companyId;

    private ContentPlatformApiList contentPlatformApiList;

    public ContentPlatformService(PlatformConfig platformConfig) {
        this.platformConfig = platformConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.companyId = this.platformConfig.getCompanyId();
        this.contentPlatformApiList = generateContentPlatformApiList(this.platformConfig.getPersistentCookieStore());
    }

    private ContentPlatformApiList generateContentPlatformApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new AccessTokenInterceptor(platformConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(platformConfig.getDomain(),ContentPlatformApiList.class, interceptorList, cookieStore);
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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.GetAnnouncementListSchema getAnnouncementsList(Integer pageNo , Integer pageSize ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.GetAnnouncementListSchema> response = null;
            try {
            response = contentPlatformApiList.getAnnouncementsList(this.companyId , this.applicationId ,pageNo , pageSize ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getAnnouncementsList
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ContentPlatformModels.GetAnnouncementListSchema> getAnnouncementsListPagination(
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ContentPlatformModels.GetAnnouncementListSchema> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ContentPlatformModels.GetAnnouncementListSchema callback = this.getAnnouncementsList(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.CreateAnnouncementSchema createAnnouncement(ContentPlatformModels.AdminAnnouncementSchema body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.CreateAnnouncementSchema> response = null;
            try {
            response = contentPlatformApiList.createAnnouncement(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.AdminAnnouncementSchema getAnnouncementById(String announcementId ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.AdminAnnouncementSchema> response = null;
            try {
            response = contentPlatformApiList.getAnnouncementById(this.companyId , this.applicationId , announcementId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.CreateAnnouncementSchema updateAnnouncement(String announcementId ,ContentPlatformModels.AdminAnnouncementSchema body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.CreateAnnouncementSchema> response = null;
            try {
            response = contentPlatformApiList.updateAnnouncement(this.companyId , this.applicationId , announcementId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.CreateAnnouncementSchema updateAnnouncementSchedule(String announcementId ,ContentPlatformModels.ScheduleSchema body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.CreateAnnouncementSchema> response = null;
            try {
            response = contentPlatformApiList.updateAnnouncementSchedule(this.companyId , this.applicationId , announcementId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.CreateAnnouncementSchema deleteAnnouncement(String announcementId ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.CreateAnnouncementSchema> response = null;
            try {
            response = contentPlatformApiList.deleteAnnouncement(this.companyId , this.applicationId , announcementId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.BlogSchema createBlog(ContentPlatformModels.BlogRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.BlogSchema> response = null;
            try {
            response = contentPlatformApiList.createBlog(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.BlogGetResponse getBlogs(Integer pageNo , Integer pageSize ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.BlogGetResponse> response = null;
            try {
            response = contentPlatformApiList.getBlogs(this.companyId , this.applicationId ,pageNo , pageSize ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getBlogs
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ContentPlatformModels.BlogGetResponse> getBlogsPagination(
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ContentPlatformModels.BlogGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ContentPlatformModels.BlogGetResponse callback = this.getBlogs(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.BlogSchema updateBlog(String id ,ContentPlatformModels.BlogRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.BlogSchema> response = null;
            try {
            response = contentPlatformApiList.updateBlog(this.companyId , this.applicationId , id , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.BlogSchema deleteBlog(String id ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.BlogSchema> response = null;
            try {
            response = contentPlatformApiList.deleteBlog(this.companyId , this.applicationId , id ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.BlogSchema getComponentById(String slug ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.BlogSchema> response = null;
            try {
            response = contentPlatformApiList.getComponentById(this.companyId , this.applicationId , slug ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.DataLoaderResponseSchema addDataLoader(ContentPlatformModels.DataLoaderSchema body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.DataLoaderResponseSchema> response = null;
            try {
            response = contentPlatformApiList.addDataLoader(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.DataLoadersSchema getDataLoaders() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.DataLoadersSchema> response = null;
            try {
            response = contentPlatformApiList.getDataLoaders(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.DataLoaderResponseSchema deleteDataLoader(String dataLoaderId ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.DataLoaderResponseSchema> response = null;
            try {
            response = contentPlatformApiList.deleteDataLoader(this.companyId , this.applicationId , dataLoaderId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.DataLoaderResponseSchema editDataLoader(String dataLoaderId ,ContentPlatformModels.DataLoaderSchema body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.DataLoaderResponseSchema> response = null;
            try {
            response = contentPlatformApiList.editDataLoader(this.companyId , this.applicationId , dataLoaderId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.DataLoaderResponseSchema selectDataLoader(String dataLoaderId ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.DataLoaderResponseSchema> response = null;
            try {
            response = contentPlatformApiList.selectDataLoader(this.companyId , this.applicationId , dataLoaderId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.DataLoaderResetResponseSchema resetDataLoader(String service , String operationId ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.DataLoaderResetResponseSchema> response = null;
            try {
            response = contentPlatformApiList.resetDataLoader(this.companyId , this.applicationId , service , operationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.GetFaqCategoriesSchema getFaqCategories() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.GetFaqCategoriesSchema> response = null;
            try {
            response = contentPlatformApiList.getFaqCategories(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.GetFaqCategoryBySlugSchema getFaqCategoryBySlugOrId(String idOrSlug ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.GetFaqCategoryBySlugSchema> response = null;
            try {
            response = contentPlatformApiList.getFaqCategoryBySlugOrId(this.companyId , this.applicationId , idOrSlug ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.CreateFaqCategorySchema createFaqCategory(ContentPlatformModels.CreateFaqCategoryRequestSchema body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.CreateFaqCategorySchema> response = null;
            try {
            response = contentPlatformApiList.createFaqCategory(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.CreateFaqCategorySchema updateFaqCategory(String id ,ContentPlatformModels.UpdateFaqCategoryRequestSchema body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.CreateFaqCategorySchema> response = null;
            try {
            response = contentPlatformApiList.updateFaqCategory(this.companyId , this.applicationId , id , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.FaqSchema deleteFaqCategory(String id ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.FaqSchema> response = null;
            try {
            response = contentPlatformApiList.deleteFaqCategory(this.companyId , this.applicationId , id ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.GetFaqSchema getFaqsByCategoryIdOrSlug(String idOrSlug ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.GetFaqSchema> response = null;
            try {
            response = contentPlatformApiList.getFaqsByCategoryIdOrSlug(this.companyId , this.applicationId , idOrSlug ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.CreateFaqResponseSchema addFaq(String categoryId ,ContentPlatformModels.CreateFaqSchema body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.CreateFaqResponseSchema> response = null;
            try {
            response = contentPlatformApiList.addFaq(this.companyId , this.applicationId , categoryId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.CreateFaqResponseSchema updateFaq(String categoryId , String faqId ,ContentPlatformModels.CreateFaqSchema body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.CreateFaqResponseSchema> response = null;
            try {
            response = contentPlatformApiList.updateFaq(this.companyId , this.applicationId , categoryId , faqId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.CreateFaqResponseSchema deleteFaq(String categoryId , String faqId ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.CreateFaqResponseSchema> response = null;
            try {
            response = contentPlatformApiList.deleteFaq(this.companyId , this.applicationId , categoryId , faqId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.CreateFaqResponseSchema getFaqByIdOrSlug(String idOrSlug ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.CreateFaqResponseSchema> response = null;
            try {
            response = contentPlatformApiList.getFaqByIdOrSlug(this.companyId , this.applicationId , idOrSlug ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.GeneratedSEOContent generateSEOTitle(ContentPlatformModels.GenerationEntityType type ,ContentPlatformModels.GenerateSEOContent body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.GeneratedSEOContent> response = null;
            try {
            response = contentPlatformApiList.generateSEOTitle(this.companyId , this.applicationId , type , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.LandingPageGetResponse getLandingPages(Integer pageNo , Integer pageSize ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.LandingPageGetResponse> response = null;
            try {
            response = contentPlatformApiList.getLandingPages(this.companyId , this.applicationId ,pageNo , pageSize ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getLandingPages
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ContentPlatformModels.LandingPageGetResponse> getLandingPagesPagination(
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ContentPlatformModels.LandingPageGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ContentPlatformModels.LandingPageGetResponse callback = this.getLandingPages(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.LandingPageSchema createLandingPage(ContentPlatformModels.LandingPageSchema body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.LandingPageSchema> response = null;
            try {
            response = contentPlatformApiList.createLandingPage(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.LandingPageSchema updateLandingPage(String id ,ContentPlatformModels.LandingPageSchema body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.LandingPageSchema> response = null;
            try {
            response = contentPlatformApiList.updateLandingPage(this.companyId , this.applicationId , id , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.LandingPageSchema deleteLandingPage(String id ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.LandingPageSchema> response = null;
            try {
            response = contentPlatformApiList.deleteLandingPage(this.companyId , this.applicationId , id ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.ApplicationLegal getLegalInformation() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.ApplicationLegal> response = null;
            try {
            response = contentPlatformApiList.getLegalInformation(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.ApplicationLegal updateLegalInformation(ContentPlatformModels.ApplicationLegal body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.ApplicationLegal> response = null;
            try {
            response = contentPlatformApiList.updateLegalInformation(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.NavigationGetResponse getNavigations(String devicePlatform , Integer pageNo , Integer pageSize ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.NavigationGetResponse> response = null;
            try {
            response = contentPlatformApiList.getNavigations(this.companyId , this.applicationId ,devicePlatform , pageNo , pageSize ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getNavigations
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ContentPlatformModels.NavigationGetResponse> getNavigationsPagination(
        String devicePlatform,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ContentPlatformModels.NavigationGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ContentPlatformModels.NavigationGetResponse callback = this.getNavigations(
                
                 
                 
                 devicePlatform,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.NavigationSchema createNavigation(ContentPlatformModels.NavigationRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.NavigationSchema> response = null;
            try {
            response = contentPlatformApiList.createNavigation(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.DefaultNavigationResponse getDefaultNavigations() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.DefaultNavigationResponse> response = null;
            try {
            response = contentPlatformApiList.getDefaultNavigations(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.NavigationSchema getNavigationBySlug(String slug , String devicePlatform ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.NavigationSchema> response = null;
            try {
            response = contentPlatformApiList.getNavigationBySlug(this.companyId , this.applicationId , slug ,devicePlatform ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.NavigationSchema updateNavigation(String id ,ContentPlatformModels.NavigationRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.NavigationSchema> response = null;
            try {
            response = contentPlatformApiList.updateNavigation(this.companyId , this.applicationId , id , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.NavigationSchema deleteNavigation(String id ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.NavigationSchema> response = null;
            try {
            response = contentPlatformApiList.deleteNavigation(this.companyId , this.applicationId , id ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.PageMetaSchema getPageMeta() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.PageMetaSchema> response = null;
            try {
            response = contentPlatformApiList.getPageMeta(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.PageSpec getPageSpec() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.PageSpec> response = null;
            try {
            response = contentPlatformApiList.getPageSpec(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.PageSchema createPagePreview(ContentPlatformModels.PageRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.PageSchema> response = null;
            try {
            response = contentPlatformApiList.createPagePreview(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.PageSchema updatePagePreview(String slug ,ContentPlatformModels.PagePublishRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.PageSchema> response = null;
            try {
            response = contentPlatformApiList.updatePagePreview(this.companyId , this.applicationId , slug , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.PageSchema deletePage(String id ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.PageSchema> response = null;
            try {
            response = contentPlatformApiList.deletePage(this.companyId , this.applicationId , id ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.PathMappingSchema addPathRedirectionRules(ContentPlatformModels.PathMappingSchema body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.PathMappingSchema> response = null;
            try {
            response = contentPlatformApiList.addPathRedirectionRules(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.PathMappingSchema getPathRedirectionRules(Integer pageSize , Integer pageNo ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.PathMappingSchema> response = null;
            try {
            response = contentPlatformApiList.getPathRedirectionRules(this.companyId , this.applicationId ,pageSize , pageNo ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.PathMappingSchema getPathRedirectionRule(String pathId ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.PathMappingSchema> response = null;
            try {
            response = contentPlatformApiList.getPathRedirectionRule(this.companyId , this.applicationId , pathId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.PathMappingSchema updatePathRedirectionRules(String pathId ,ContentPlatformModels.PathMappingSchema body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.PathMappingSchema> response = null;
            try {
            response = contentPlatformApiList.updatePathRedirectionRules(this.companyId , this.applicationId , pathId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public Object deletePathRedirectionRules(String pathId ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<Object> response = null;
            try {
            response = contentPlatformApiList.deletePathRedirectionRules(this.companyId , this.applicationId , pathId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.SeoComponent getSEOConfiguration() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.SeoComponent> response = null;
            try {
            response = contentPlatformApiList.getSEOConfiguration(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.SeoSchema updateSEOConfiguration(ContentPlatformModels.SeoComponent body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.SeoSchema> response = null;
            try {
            response = contentPlatformApiList.updateSEOConfiguration(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.SlideshowGetResponse getSlideshows(String devicePlatform , Integer pageNo , Integer pageSize ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.SlideshowGetResponse> response = null;
            try {
            response = contentPlatformApiList.getSlideshows(this.companyId , this.applicationId ,devicePlatform , pageNo , pageSize ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getSlideshows
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ContentPlatformModels.SlideshowGetResponse> getSlideshowsPagination(
        String devicePlatform,
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ContentPlatformModels.SlideshowGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ContentPlatformModels.SlideshowGetResponse callback = this.getSlideshows(
                
                 
                 
                 devicePlatform,
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.SlideshowSchema createSlideshow(ContentPlatformModels.SlideshowRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.SlideshowSchema> response = null;
            try {
            response = contentPlatformApiList.createSlideshow(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.SlideshowSchema getSlideshowBySlug(String slug , String devicePlatform ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.SlideshowSchema> response = null;
            try {
            response = contentPlatformApiList.getSlideshowBySlug(this.companyId , this.applicationId , slug ,devicePlatform ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.SlideshowSchema updateSlideshow(String id ,ContentPlatformModels.SlideshowRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.SlideshowSchema> response = null;
            try {
            response = contentPlatformApiList.updateSlideshow(this.companyId , this.applicationId , id , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.SlideshowSchema deleteSlideshow(String id ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.SlideshowSchema> response = null;
            try {
            response = contentPlatformApiList.deleteSlideshow(this.companyId , this.applicationId , id ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.Support getSupportInformation() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.Support> response = null;
            try {
            response = contentPlatformApiList.getSupportInformation(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.Support updateSupportInformation(ContentPlatformModels.Support body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.Support> response = null;
            try {
            response = contentPlatformApiList.updateSupportInformation(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.TagsSchema updateInjectableTag(ContentPlatformModels.CreateTagRequestSchema body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.TagsSchema> response = null;
            try {
            response = contentPlatformApiList.updateInjectableTag(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.TagsSchema deleteAllInjectableTags() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.TagsSchema> response = null;
            try {
            response = contentPlatformApiList.deleteAllInjectableTags(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.TagsSchema getInjectableTags() throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.TagsSchema> response = null;
            try {
            response = contentPlatformApiList.getInjectableTags(this.companyId , this.applicationId ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.TagsSchema addInjectableTag(ContentPlatformModels.CreateTagRequestSchema body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.TagsSchema> response = null;
            try {
            response = contentPlatformApiList.addInjectableTag(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.TagDeleteSuccessResponse removeInjectableTag(ContentPlatformModels.RemoveHandpickedSchema body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.TagDeleteSuccessResponse> response = null;
            try {
            response = contentPlatformApiList.removeInjectableTag(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.TagsSchema editInjectableTag(String tagId ,ContentPlatformModels.UpdateHandpickedSchema body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.TagsSchema> response = null;
            try {
            response = contentPlatformApiList.editInjectableTag(this.companyId , this.applicationId , tagId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.BlogSchema getBlogBySlug(String slug ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.BlogSchema> response = null;
            try {
            response = contentPlatformApiList.getBlogBySlug(this.companyId , this.applicationId , slug ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.PageSchema createPage(ContentPlatformModels.PageRequest body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.PageSchema> response = null;
            try {
            response = contentPlatformApiList.createPage(this.companyId , this.applicationId , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.PageGetResponse getPages(Integer pageNo , Integer pageSize ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.PageGetResponse> response = null;
            try {
            response = contentPlatformApiList.getPages(this.companyId , this.applicationId ,pageNo , pageSize ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    /**
    * Summary: get paginator for getPages
    * Description: fetch the next page by calling .next(...) function
    **/
    public Paginator<ContentPlatformModels.PageGetResponse> getPagesPagination(
        Integer pageSize
        
        ){ 
    
    pageSize = pageSize!=0?20:pageSize; 

    Paginator<ContentPlatformModels.PageGetResponse> paginator = new Paginator<>(pageSize, "number");

    paginator.setCallback(()-> {
        try {
            ContentPlatformModels.PageGetResponse callback = this.getPages(
                
                 
                 
                 paginator.getPageNo()
                ,
                 paginator.getPageSize()
                
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.PageSchema updatePage(String id ,ContentPlatformModels.PageSchema body) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.PageSchema> response = null;
            try {
            response = contentPlatformApiList.updatePage(this.companyId , this.applicationId , id , body).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
            }
            return response.body();
        } else {
            return null;
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ContentPlatformModels.PageSchema getPageBySlug(String slug ) throws FDKException {
        if (this.platformConfig.getPlatformOauthClient().isAccessTokenValid()) {
            Response<ContentPlatformModels.PageSchema> response = null;
            try {
            response = contentPlatformApiList.getPageBySlug(this.companyId , this.applicationId , slug ).execute();
                if (!response.isSuccessful()) {
                        throw new FDKException(response.code(),
                                                response.errorBody() != null ? response.errorBody().string() : Fields.UNKNOWN_ERROR,
                                                response.headers() != null ? response.headers().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().method() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().url().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null && response.raw().request().body() != null ? response.raw().request().body().toString() : Fields.UNKNOWN_ERROR,
                                                response.raw() != null ? response.raw().request().headers().toString() : Fields.UNKNOWN_ERROR);
                }
            } catch (IOException e) {
                throw new FDKException(e.getMessage(), e);
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