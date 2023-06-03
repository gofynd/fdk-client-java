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
    Call<FinancePlatformModels.GetEngineResponse> getReportList(@Path("company_id")  String companyId ,@Body FinancePlatformModels.GetReportListRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-affiliate-list")
    Call<FinancePlatformModels.GetAffiliateResponse> getAffiliate(@Path("company_id")  String companyId ,@Body FinancePlatformModels.GetAffiliate payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/download-credit-debit-note")
    Call<FinancePlatformModels.DownloadCreditDebitNoteResponse> downloadCreditDebitNote(@Path("company_id")  String companyId ,@Body FinancePlatformModels.DownloadCreditDebitNoteRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/payment-process")
    Call<FinancePlatformModels.PaymentProcessResponse> paymentProcess(@Path("company_id")  String companyId ,@Body FinancePlatformModels.PaymentProcessRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/get-invoice-type")
    Call<FinancePlatformModels.GetInvoiceListResponse> getInvoiceList(@Path("company_id")  String companyId ,@Body FinancePlatformModels.GetInvoiceListRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/invoice/listing")
    Call<FinancePlatformModels.InvoiceListingResponse> invoiceListing(@Path("company_id")  String companyId ,@Body FinancePlatformModels.InvoiceListingRequest payload);
    
    
    
    
    
    
    
    @POST ("/service/platform/finance/v1.0/company/{company_id}/invoice/pdf-view")
    Call<FinancePlatformModels.InvoicePdfResponse> invoicePDF(@Path("company_id")  String companyId ,@Body FinancePlatformModels.InvoicePdfRequest payload);
    
}