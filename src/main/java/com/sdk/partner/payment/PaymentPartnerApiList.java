package com.sdk.partner.payment;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface PaymentPartnerApiList {

    @GET ("/service/partner/payment/v1.0/organization/{organization_id}/payment/methods/configs")
    Call<PaymentPartnerModels.PaymentConfigResponse> getPaymentconfig(@Path("organization_id") String organizationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/payment/v1.0/organization/{organization_id}/payouts")
    Call<PaymentPartnerModels.PayoutResponse> getPayout(@Path("organization_id") String organizationId, @Query("unique_external_id") Integer uniqueExternalId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/payment/v1.0/organization/{organization_id}/payouts")
    Call<PaymentPartnerModels.PostPayoutResponse> postPayout(@Path("organization_id") String organizationId, @Body PaymentPartnerModels.PostPayoutRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/partner/payment/v1.0/organization/{organization_id}/payouts")
    Call<PaymentPartnerModels.PostPayoutResponse> updatePayout(@Path("organization_id") String organizationId, @Body PaymentPartnerModels.PostPayoutRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/partner/payment/v1.0/organization/{organization_id}/payouts")
    Call<PaymentPartnerModels.PostPayoutResponse> putPayout(@Path("organization_id") String organizationId, @Body PaymentPartnerModels.PostPayoutRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/partner/payment/v1.0/organization/{organization_id}/payouts")
    Call<PaymentPartnerModels.PayoutResponse> deletePayout(@Path("organization_id") String organizationId, @Query("unique_external_id") Integer uniqueExternalId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/payment/v1.0/organization/{organization_id}/payouts/{unique_transfer_no}")
    Call<PaymentPartnerModels.PayoutResponse> getPayouts(@Path("organization_id") String organizationId, @Path("unique_transfer_no") String uniqueTransferNo, @Query("unique_external_id") Integer uniqueExternalId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/payment/v1.0/organization/{organization_id}/payouts/{unique_transfer_no}")
    Call<PaymentPartnerModels.PostPayoutResponse> postPayouts(@Path("organization_id") String organizationId, @Path("unique_transfer_no") String uniqueTransferNo, @Body PaymentPartnerModels.PostPayoutRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/partner/payment/v1.0/organization/{organization_id}/payouts/{unique_transfer_no}")
    Call<PaymentPartnerModels.PostPayoutResponse> updatePayouts(@Path("organization_id") String organizationId, @Path("unique_transfer_no") String uniqueTransferNo, @Body PaymentPartnerModels.PostPayoutRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/partner/payment/v1.0/organization/{organization_id}/payouts/{unique_transfer_no}")
    Call<PaymentPartnerModels.PostPayoutResponse> putPayouts(@Path("organization_id") String organizationId, @Path("unique_transfer_no") String uniqueTransferNo, @Body PaymentPartnerModels.PostPayoutRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/partner/payment/v1.0/organization/{organization_id}/payouts/{unique_transfer_no}")
    Call<PaymentPartnerModels.PayoutResponse> deletePayouts(@Path("organization_id") String organizationId, @Path("unique_transfer_no") Integer uniqueTransferNo, @HeaderMap Map<String, String> requestHeaders);
}