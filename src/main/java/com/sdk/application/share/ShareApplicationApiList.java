package com.sdk.application.share;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface ShareApplicationApiList {
    
    
    @POST 
    Call<ShareApplicationModels.QRCodeResp> getApplicationQRCode(@Url String url1);
    
    @POST 
    Call<ShareApplicationModels.QRCodeResp> getProductQRCodeBySlug(@Url String url1);
    
    @POST 
    Call<ShareApplicationModels.QRCodeResp> getCollectionQRCodeBySlug(@Url String url1);
    
    @POST 
    Call<ShareApplicationModels.QRCodeResp> getUrlQRCode(@Url String url1, @Query("url") String url );
    
    @POST 
    Call<ShareApplicationModels.ShortLinkRes> createShortLink(@Url String url1 , @Body ShareApplicationModels.ShortLinkReq payload );
    
    @GET 
    Call<ShareApplicationModels.ShortLinkRes> getShortLinkByHash(@Url String url1);
    
    @GET 
    Call<ShareApplicationModels.ShortLinkRes> getOriginalShortLinkByHash(@Url String url1);
}