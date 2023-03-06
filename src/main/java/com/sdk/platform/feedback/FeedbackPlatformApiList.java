package com.sdk.platform.feedback;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface FeedbackPlatformApiList {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/attributes/")
    Call<FeedbackPlatformModels.FeedbackAttributes> getAttributes(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_no") Integer  pageNo ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/reviews/")
    Call<FeedbackPlatformModels.GetReviewResponse> getCustomerReviews(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("id") String  id ,  @Query("entity_id") String  entityId ,  @Query("entity_type") String  entityType ,  @Query("user_id") String  userId ,  @Query("media") String  media ,  @Query("rating") List<Double>  rating ,  @Query("attribute_rating") List<String>  attributeRating ,  @Query("facets") Boolean  facets ,  @Query("sort") String  sort ,  @Query("next") String  next ,  @Query("start") String  start ,  @Query("limit") String  limit ,  @Query("count") String  count ,  @Query("page_id") String  pageId ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/reviews/{review_id}/approve/")
    Call<FeedbackPlatformModels.UpdateResponse> updateApprove(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("review_id") String  reviewId ,@Body FeedbackPlatformModels.ApproveRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/reviews/{review_id}/history/")
    Call<List<FeedbackPlatformModels.ActivityDump>> getHistory(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("review_id") String  reviewId );
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/templates/")
    Call<FeedbackPlatformModels.TemplateGetResponse> getApplicationTemplates(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Query("page_id") String  pageId ,  @Query("page_size") Integer  pageSize );
    
    
    
    
    
    
    
    
    
    
    @POST ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/templates/")
    Call<FeedbackPlatformModels.InsertResponse> createTemplate(@Path("company_id")  String companyId , @Path("application_id")  String applicationId ,@Body FeedbackPlatformModels.TemplateRequestList payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/templates/{id}/")
    Call<FeedbackPlatformModels.Template> getTemplateById(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id );
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PUT ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/templates/{id}/")
    Call<FeedbackPlatformModels.UpdateResponse> updateTemplate(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body FeedbackPlatformModels.UpdateTemplateRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @PATCH ("/service/platform/feedback/v1.0/company/{company_id}/application/{application_id}/templates/{id}/status/")
    Call<FeedbackPlatformModels.UpdateResponse> updateTemplateStatus(@Path("company_id")  String companyId , @Path("application_id")  String applicationId , @Path("id") String  id ,@Body FeedbackPlatformModels.UpdateTemplateStatusRequest payload);
    
}