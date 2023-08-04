


package com.sdk.internal.filestorage;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface FileStorageInternalApiList {
    
    @GET ("/___/internal/assets/v1.0/bulk/generate-shipment")
    Call<FileStorageInternalModels.GenerateShipment200> generateBulkPdf(@Body FileStorageInternalModels.GenerateShipmentRequestBody payload);
    
}
