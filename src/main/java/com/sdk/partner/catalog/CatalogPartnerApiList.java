package com.sdk.partner.catalog;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface CatalogPartnerApiList {

    @POST ("/service/partner/catalog/v2.0/organization/{organization_id}/company-details")
    Call<CatalogPartnerModels.CompaniesSerializer> partnerCompanyDetails(@Path("organization_id") String organizationId, @Body CatalogPartnerModels.PartnerCompanyDetailsRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/catalog/v2.0/organization/{organization_id}/referred-companies")
    Call<CatalogPartnerModels.CompanyListSerializer> getCompanies(@Path("organization_id") String organizationId, @Query("q") String q, @Query("stage") String stage, @HeaderMap Map<String, String> requestHeaders);
}