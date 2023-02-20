package com.sdk.application.lead;

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
 public class LeadApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private LeadApplicationApiList leadApplicationApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

    public LeadApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.leadApplicationApiList = generateLeadApplicationApiList(this.applicationConfig.getPersistentCookieStore());

           
                    relativeUrls.put("getTicket","/service/application/lead/v1.0/ticket/{id}".substring(1));
            
                    relativeUrls.put("createHistory","/service/application/lead/v1.0/ticket/{id}/history".substring(1));
            
                    relativeUrls.put("createTicket","/service/application/lead/v1.0/ticket/".substring(1));
            
                    relativeUrls.put("getCustomForm","/service/application/lead/v1.0/form/{slug}".substring(1));
            
                    relativeUrls.put("submitCustomForm","/service/application/lead/v1.0/form/{slug}/submit".substring(1));
            
                    relativeUrls.put("getParticipantsInsideVideoRoom","/service/application/lead/v1.0/video/room/{unique_name}/participants".substring(1));
            
                    relativeUrls.put("getTokenForVideoRoom","/service/application/lead/v1.0/video/room/{unique_name}/token".substring(1));
             

    }

     public void update( HashMap<String,String> updatedUrlMap ){
            for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
                relativeUrls.put(entry.getKey(),entry.getValue());
            }
    }

    private LeadApplicationApiList generateLeadApplicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),LeadApplicationApiList.class, interceptorList, cookieStore);
    }

    

     
    
    public LeadApplicationModels.Ticket getTicket(String id ) throws IOException {
     
      String fullUrl = relativeUrls.get("getTicket");
        
        fullUrl = fullUrl.replace("{" + "id" +"}",id.toString());
        

        Response<LeadApplicationModels.Ticket> response = leadApplicationApiList.getTicket(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public LeadApplicationModels.TicketHistory createHistory(String id ,LeadApplicationModels.TicketHistoryPayload body) throws IOException {
     
      String fullUrl = relativeUrls.get("createHistory");
        
        fullUrl = fullUrl.replace("{" + "id" +"}",id.toString());
        

        Response<LeadApplicationModels.TicketHistory> response = leadApplicationApiList.createHistory(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public LeadApplicationModels.Ticket createTicket(LeadApplicationModels.AddTicketPayload body) throws IOException {
     
      String fullUrl = relativeUrls.get("createTicket");
        

        Response<LeadApplicationModels.Ticket> response = leadApplicationApiList.createTicket(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public LeadApplicationModels.CustomForm getCustomForm(String slug ) throws IOException {
     
      String fullUrl = relativeUrls.get("getCustomForm");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<LeadApplicationModels.CustomForm> response = leadApplicationApiList.getCustomForm(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public LeadApplicationModels.SubmitCustomFormResponse submitCustomForm(String slug ,LeadApplicationModels.CustomFormSubmissionPayload body) throws IOException {
     
      String fullUrl = relativeUrls.get("submitCustomForm");
        
        fullUrl = fullUrl.replace("{" + "slug" +"}",slug.toString());
        

        Response<LeadApplicationModels.SubmitCustomFormResponse> response = leadApplicationApiList.submitCustomForm(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public LeadApplicationModels.GetParticipantsInsideVideoRoomResponse getParticipantsInsideVideoRoom(String uniqueName ) throws IOException {
     
      String fullUrl = relativeUrls.get("getParticipantsInsideVideoRoom");
        
        fullUrl = fullUrl.replace("{" + "unique_name" +"}",uniqueName.toString());
        

        Response<LeadApplicationModels.GetParticipantsInsideVideoRoomResponse> response = leadApplicationApiList.getParticipantsInsideVideoRoom(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    public LeadApplicationModels.GetTokenForVideoRoomResponse getTokenForVideoRoom(String uniqueName ) throws IOException {
     
      String fullUrl = relativeUrls.get("getTokenForVideoRoom");
        
        fullUrl = fullUrl.replace("{" + "unique_name" +"}",uniqueName.toString());
        

        Response<LeadApplicationModels.GetTokenForVideoRoomResponse> response = leadApplicationApiList.getTokenForVideoRoom(fullUrl ).execute();
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
