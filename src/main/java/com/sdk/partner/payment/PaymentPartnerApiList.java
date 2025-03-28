package com.sdk.partner.payment;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface PaymentPartnerApiList {

    @GET ("/service/partner/payment/v1.0/organization/{organization_id}/payment/methods/configs")
    Call<PaymentPartnerModels.PaymentConfigDetails> getPaymentconfig(@Path("organization_id") String organizationId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/payment/v1.0/organization/{organization_id}/payouts")
    Call<PaymentPartnerModels.PayoutDetails> getPayout(@Path("organization_id") String organizationId, @Query("unique_external_id") Integer uniqueExternalId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/payment/v1.0/organization/{organization_id}/payouts")
    Call<PaymentPartnerModels.PostPayoutDetails> postPayout(@Path("organization_id") String organizationId, @Body PaymentPartnerModels.PostPayout payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/partner/payment/v1.0/organization/{organization_id}/payouts")
    Call<PaymentPartnerModels.PostPayoutDetails> updatePayout(@Path("organization_id") String organizationId, @Body PaymentPartnerModels.PostPayout payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/partner/payment/v1.0/organization/{organization_id}/payouts")
    Call<PaymentPartnerModels.PostPayoutDetails> putPayout(@Path("organization_id") String organizationId, @Body PaymentPartnerModels.PostPayout payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/partner/payment/v1.0/organization/{organization_id}/payouts")
    Call<PaymentPartnerModels.PayoutDetails> deletePayout(@Path("organization_id") String organizationId, @Query("unique_external_id") Integer uniqueExternalId, @HeaderMap Map<String, String> requestHeaders);

    @GET ("/service/partner/payment/v1.0/organization/{organization_id}/payouts/{unique_transfer_no}")
    Call<PaymentPartnerModels.PayoutDetails> getPayouts(@Path("organization_id") String organizationId, @Path("unique_transfer_no") String uniqueTransferNo, @Query("unique_external_id") Integer uniqueExternalId, @HeaderMap Map<String, String> requestHeaders);

    @POST ("/service/partner/payment/v1.0/organization/{organization_id}/payouts/{unique_transfer_no}")
    Call<PaymentPartnerModels.PostPayoutDetails> postPayouts(@Path("organization_id") String organizationId, @Path("unique_transfer_no") String uniqueTransferNo, @Body PaymentPartnerModels.PostPayout payload, @HeaderMap Map<String, String> requestHeaders);

    @PATCH ("/service/partner/payment/v1.0/organization/{organization_id}/payouts/{unique_transfer_no}")
    Call<PaymentPartnerModels.PostPayoutDetails> updatePayouts(@Path("organization_id") String organizationId, @Path("unique_transfer_no") String uniqueTransferNo, @Body PaymentPartnerModels.PostPayout payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT ("/service/partner/payment/v1.0/organization/{organization_id}/payouts/{unique_transfer_no}")
    Call<PaymentPartnerModels.PostPayoutDetails> putPayouts(@Path("organization_id") String organizationId, @Path("unique_transfer_no") String uniqueTransferNo, @Body PaymentPartnerModels.PostPayout payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE ("/service/partner/payment/v1.0/organization/{organization_id}/payouts/{unique_transfer_no}")
    Call<PaymentPartnerModels.PayoutDetails> deletePayouts(@Path("organization_id") String organizationId, @Path("unique_transfer_no") Integer uniqueTransferNo, @HeaderMap Map<String, String> requestHeaders);
}