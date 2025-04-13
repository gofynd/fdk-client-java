package com.sdk.application.filestorage;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface FileStorageApplicationApiList {

    @POST 
    Call<FileStorageApplicationModels.StartResponse> startUpload(@Url String url1, @Body FileStorageApplicationModels.StartRequest payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<FileStorageApplicationModels.CompleteResponse> completeUpload(@Url String url1, @Body FileStorageApplicationModels.StartResponse payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<FileStorageApplicationModels.SignUrlResponse> signUrls(@Url String url1, @Body FileStorageApplicationModels.SignUrlRequest payload, @HeaderMap Map<String, String> requestHeaders);
}