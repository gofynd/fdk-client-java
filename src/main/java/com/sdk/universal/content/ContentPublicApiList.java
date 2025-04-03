package com.sdk.universal.content;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface ContentPublicApiList {

    @GET ("/service/public/content/credentials/{entity}")
    Call<ContentPublicModels.CredentialsSchema> getCredentialsByEntity(@Path("entity") String entity, @HeaderMap Map<String, String> requestHeaders);
}