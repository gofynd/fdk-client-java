


package com.sdk.administrator.communication;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface CommunicationAdministratorApiList {
    
    @POST ("/service/___/administrator/communication/v1.0/platform/send-comms/send-instant")
    Call<CommunicationAdministratorModels.EngineResponse> sendSellerCommunicationSynchronously(@Body CommunicationAdministratorModels.EngineRequest payload);
    
    @POST ("/service/___/administrator/communication/v1.0/platform/send-comms/send-async")
    Call<CommunicationAdministratorModels.EngineResponse> sendSellerCommunicationAsynchronously(@Body CommunicationAdministratorModels.EngineRequest payload);
    
}
