package com.sdk.platform.finance;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface FinancePlatformApiList {
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/generate-report")
    Call<FinancePlatformModels.GenerateReportJson> generateReport(@Path("company_id")  String companyId ,@Body FinancePlatformModels.GenerateReportRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/download-report")
    Call<FinancePlatformModels.DownloadReportList> downloadReport(@Path("company_id")  String companyId ,@Body FinancePlatformModels.DownloadReport payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-data")
    Call<FinancePlatformModels.GetEngineResponse> getData(@Path("company_id")  String companyId ,@Body FinancePlatformModels.GetEngineRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-reason")
    Call<FinancePlatformModels.GetReasonResponse> getReason(@Path("company_id")  String companyId ,@Body FinancePlatformModels.GetReasonRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-report-list")
    Call<FinancePlatformModels.GetReportListResponse> getReportList(@Path("company_id")  String companyId ,@Body FinancePlatformModels.GetReportListRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-affiliate-list")
    Call<FinancePlatformModels.GetAffiliateResponse> getAffiliate(@Path("company_id")  String companyId ,@Body FinancePlatformModels.GetAffiliate payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/download-credit-debit-note")
    Call<FinancePlatformModels.DownloadCreditDebitNoteResponse> downloadCreditDebitNote(@Path("company_id")  String companyId ,@Body FinancePlatformModels.DownloadCreditDebitNoteRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/payment-process")
    Call<FinancePlatformModels.PaymentProcessResponse> paymentProcess(@Path("company_id")  String companyId ,@Body FinancePlatformModels.PaymentProcessRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/credit-line-data")
    Call<FinancePlatformModels.CreditlineDataPlatformResponse> creditlineDataplatform(@Path("company_id")  String companyId ,@Body FinancePlatformModels.CreditlineDataPlatformRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/creditline-opted")
    Call<FinancePlatformModels.IsCreditlinePlatformResponse> isCreditlinePlatform(@Path("company_id")  String companyId ,@Body FinancePlatformModels.IsCreditlinePlatformRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/invoice-type")
    Call<FinancePlatformModels.InvoiceTypeResponse> invoiceType(@Path("company_id")  String companyId ,@Body FinancePlatformModels.InvoiceTypeRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/invoice/listing")
    Call<FinancePlatformModels.InvoiceListingResponse> invoiceListing(@Path("company_id")  String companyId ,@Body FinancePlatformModels.InvoiceListingRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/invoice/pdf-view")
    Call<FinancePlatformModels.InvoicePdfResponse> invoicePDF(@Path("company_id")  String companyId ,@Body FinancePlatformModels.InvoicePdfRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/cn-as-refund-method")
    Call<FinancePlatformModels.IsCnRefundMethodResponse> isCnRefundMethod(@Path("company_id")  String companyId ,@Body FinancePlatformModels.IsCnRefundMethodRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/create-update-credit-note-config")
    Call<FinancePlatformModels.CreateSellerCreditNoteConfigResponse> createSellerCreditNoteConfig(@Path("company_id")  String companyId ,@Body FinancePlatformModels.CreateSellerCreditNoteConfigRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/delete-seller-config")
    Call<FinancePlatformModels.DeleteConfigResponse> deleteConfig(@Path("company_id")  String companyId ,@Body FinancePlatformModels.DeleteConfigRequest payload);
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/finance/v1.0/company/{company_id}/channel-display-names")
    Call<FinancePlatformModels.ChannelDisplayNameResponse> channelDisplayName(@Path("company_id")  String companyId , @Query("filter_key") String  filterKey );
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-cn-pdf-link")
    Call<FinancePlatformModels.GetPdfUrlViewResponse> getPdfUrlView(@Path("company_id")  String companyId ,@Body FinancePlatformModels.GetPdfUrlViewRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/credit-note-details")
    Call<FinancePlatformModels.CreditNoteDetailsResponse> creditNoteDetails(@Path("company_id")  String companyId ,@Body FinancePlatformModels.CreditNoteDetailsRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/customer-credit-balance")
    Call<FinancePlatformModels.GetCustomerCreditBalanceResponse> getCustomerCreditBalance(@Path("company_id")  String companyId ,@Body FinancePlatformModels.GetCustomerCreditBalanceRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-seller-cn-config")
    Call<FinancePlatformModels.GetCnConfigResponse> getCnConfig(@Path("company_id")  String companyId ,@Body FinancePlatformModels.GetCnConfigRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/generate-report-customer-cn")
    Call<FinancePlatformModels.GenerateReportCustomerCnResponse> generateReportCustomerCn(@Path("company_id")  String companyId ,@Body FinancePlatformModels.GenerateReportCustomerCnRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/download-report-customer-cn")
    Call<FinancePlatformModels.DownloadReportCustomerCnResponse> downloadReportCustomerCn(@Path("company_id")  String companyId ,@Body FinancePlatformModels.DownloadReportCustomerCnRequest payload);
    
    
    
    
    
    
    
    
    
    
    
    
    
    @GET ("/service/platform/finance/v1.0/company/{company_id}/reporting-filters")
    Call<FinancePlatformModels.GetReportingFiltersResponse> getReportingFilters(@Path("company_id")  String companyId , @Query("filter_key") String  filterKey ,  @Query("affiliate_id") String  affiliateId );
    
}