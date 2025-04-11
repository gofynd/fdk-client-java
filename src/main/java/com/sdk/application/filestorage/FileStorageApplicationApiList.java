package com.sdk.application.filestorage;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface FileStorageApplicationApiList {

    @POST 
    Call<FileStorageApplicationModels.FileUpload> startUpload(@Url String url1, @Body FileStorageApplicationModels.FileUploadStart payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<FileStorageApplicationModels.FileUploadComplete> completeUpload(@Url String url1, @Body FileStorageApplicationModels.FileUpload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<FileStorageApplicationModels.SignUrlResult> signUrls(@Url String url1, @Body FileStorageApplicationModels.SignUrl payload, @HeaderMap Map<String, String> requestHeaders);
}