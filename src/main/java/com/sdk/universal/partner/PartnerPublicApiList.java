package com.sdk.universal.partner;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface PartnerPublicApiList {
    
    @GET ("/service/panel/partners/v1.0/extensions/{slug}")
    Call<PartnerPublicModels.ExtensionUsingSlug> getPanelExtensionDetails(@Path("slug") String slug );
    
}