package com.sdk.application.documentengine;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;
import java.io.File;

import com.sdk.common.*;
import com.sdk.application.ApplicationConfig;







@Getter
 public class DocumentEngineApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private DocumentEngineApplicationApiList documentengineApplicationApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    public DocumentEngineApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.documentengineApplicationApiList = generateDocumentengineApplicationApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getInvoiceByShipmentId","/service/application/document/v1.0/orders/shipments/{shipment_id}/invoice".substring(1));
            
                    relativeUrls.put("getCreditNoteByShipmentId","/service/application/document/v1.0/orders/shipments/{shipment_id}/credit-note".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private DocumentEngineApplicationApiList generateDocumentengineApplicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),DocumentEngineApplicationApiList.class, interceptorList, cookieStore);
    }

    

     
    
    
    public DocumentEngineApplicationModels.ResponseGetInvoiceShipment getInvoiceByShipmentId(String shipmentId , DocumentEngineApplicationModels.invoiceParameter parameters ) throws IOException {
     
      String fullUrl = relativeUrls.get("getInvoiceByShipmentId");
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<DocumentEngineApplicationModels.ResponseGetInvoiceShipment> response = documentengineApplicationApiList.getInvoiceByShipmentId(fullUrl  ,parameters).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public DocumentEngineApplicationModels.ResponseGetInvoiceShipment getCreditNoteByShipmentId(String shipmentId , DocumentEngineApplicationModels.creditNoteParameter parameters ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCreditNoteByShipmentId");
        
        fullUrl = fullUrl.replace("{" + "shipment_id" +"}",shipmentId.toString());
        

        Response<DocumentEngineApplicationModels.ResponseGetInvoiceShipment> response = documentengineApplicationApiList.getCreditNoteByShipmentId(fullUrl  ,parameters).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
      

    private interface Fields {
        String UNKNOWN_ERROR = "Unknown error";
    }
}
