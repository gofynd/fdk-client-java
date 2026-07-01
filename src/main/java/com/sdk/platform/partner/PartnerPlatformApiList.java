package com.sdk.platform.partner;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface PartnerPlatformApiList {

    @POST ("/service/platform/partners/v1.0/company/{company_id}/application/{application_id}/proxy/{extension_id}")
    Call<PartnerPlatformModels.ExtensionProxyPathCreation> addProxyPath(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("extension_id") String extensionId, @Body PartnerPlatformModels.AddProxyReq payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/platform/partners/v1.0/company/{company_id}/application/{application_id}/proxy/{extension_id}/{attached_path}")
    Call<PartnerPlatformModels.ExtensionProxyPathDelete> removeProxyPath(@Path("company_id") String companyId, @Path("application_id") String applicationId, @Path("extension_id") String extensionId, @Path("attached_path") String attachedPath, @HeaderMap Map<String, String> requestHeaders);
}