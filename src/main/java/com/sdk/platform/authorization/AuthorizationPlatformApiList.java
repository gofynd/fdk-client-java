package com.sdk.platform.authorization;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface AuthorizationPlatformApiList {

    @GET ("/service/platform/authorization/v1.0/company/{company_id}/application/{application_id}/staff/list")
    Call<AuthorizationPlatformModels.ApplicationStaffPage> getApplicationStaffList(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Query("page_no") Integer pageNo, @Query("page_size") Integer pageSize, @Query("order_incent") Boolean orderIncent, @Query("ordering_store") Integer orderingStore, @Query("user") String user, @Query("user_name") String userName, @HeaderMap Map<String, String> requestHeaders);
}