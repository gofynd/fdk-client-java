package com.sdk.application.documentengine;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface DocumentEngineApplicationApiList {
    
    
    @GET 
    Call<DocumentEngineApplicationModels.ResponseGetInvoiceShipment> getInvoiceByShipmentId(@Url String url1, @Query("parameters") ApplicationModels.invoiceParameter parameters );
    
    @GET 
    Call<DocumentEngineApplicationModels.ResponseGetInvoiceShipment> getCreditNoteByShipmentId(@Url String url1, @Query("parameters") ApplicationModels.creditNoteParameter parameters );
}