package com.sdk.application;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;


interface CatalogApiList {
    
    
    @GET 
    Call<ApplicationModels.ProductDetail> getProductDetailBySlug(@Url String url1);
    
    @GET 
    Call<ApplicationModels.ProductSizes> getProductSizesBySlug(@Url String url1, @Query("store_id") Integer storeId );
    
    @GET 
    Call<ApplicationModels.ProductsComparisonResponse> getProductComparisonBySlugs(@Url String url1, @Query("slug") List<String> slug );
    
    @GET 
    Call<ApplicationModels.ProductCompareResponse> getSimilarComparisonProductBySlug(@Url String url1);
    
    @GET 
    Call<ApplicationModels.ProductFrequentlyComparedSimilarResponse> getComparedFrequentlyProductBySlug(@Url String url1);
    
    @GET 
    Call<ApplicationModels.SimilarProductByTypeResponse> getProductSimilarByIdentifier(@Url String url1);
    
    @GET 
    Call<ApplicationModels.ProductVariantsResponse> getProductVariantsBySlug(@Url String url1);
    
    @GET 
    Call<ApplicationModels.ProductStockStatusResponse> getProductStockByIds(@Url String url1, @Query("item_id") String itemId , @Query("alu") String alu , @Query("sku_code") String skuCode , @Query("ean") String ean , @Query("upc") String upc );
    
    @GET 
    Call<ApplicationModels.ProductStockPolling> getProductStockForTimeByIds(@Url String url1, @Query("timestamp") String timestamp , @Query("page_size") Integer pageSize , @Query("page_id") String pageId );
    
    @GET 
    Call<ApplicationModels.ProductListingResponse> getProducts(@Url String url1, @Query("q") String q , @Query("f") String f , @Query("filters") Boolean filters , @Query("sort_on") String sortOn , @Query("page_id") String pageId , @Query("page_size") Integer pageSize , @Query("page_no") Integer pageNo , @Query("page_type") String pageType );
    
    @GET 
    Call<ApplicationModels.BrandListingResponse> getBrands(@Url String url1, @Query("department") String department , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET 
    Call<ApplicationModels.BrandDetailResponse> getBrandDetailBySlug(@Url String url1);
    
    @GET 
    Call<ApplicationModels.CategoryListingResponse> getCategories(@Url String url1, @Query("department") String department );
    
    @GET 
    Call<ApplicationModels.CategoryMetaResponse> getCategoryDetailBySlug(@Url String url1);
    
    @GET 
    Call<ApplicationModels.HomeListingResponse> getHomeProducts(@Url String url1, @Query("sort_on") String sortOn , @Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @GET 
    Call<ApplicationModels.DepartmentResponse> getDepartments(@Url String url1);
    
    @GET 
    Call<ApplicationModels.AutoCompleteResponse> getSearchResults(@Url String url1, @Query("q") String q );
    
    @GET 
    Call<ApplicationModels.GetCollectionListingResponse> getCollections(@Url String url1, @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("tag") List<String> tag );
    
    @GET 
    Call<ApplicationModels.ProductListingResponse> getCollectionItemsBySlug(@Url String url1, @Query("f") String f , @Query("filters") Boolean filters , @Query("sort_on") String sortOn , @Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @GET 
    Call<ApplicationModels.CollectionDetailResponse> getCollectionDetailBySlug(@Url String url1);
    
    @GET 
    Call<ApplicationModels.GetFollowListingResponse> getFollowedListing(@Url String url1, @Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @DELETE 
    Call<ApplicationModels.FollowPostResponse> unfollowById(@Url String url1);
    
    @POST 
    Call<ApplicationModels.FollowPostResponse> followById(@Url String url1);
    
    @GET 
    Call<ApplicationModels.FollowerCountResponse> getFollowerCountById(@Url String url1);
    
    @GET 
    Call<ApplicationModels.FollowIdsResponse> getFollowIds(@Url String url1, @Query("collection_type") String collectionType );
    
    @GET 
    Call<ApplicationModels.StoreListingResponse> getStores(@Url String url1, @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("q") String q , @Query("city") String city , @Query("range") Integer range , @Query("latitude") Double latitude , @Query("longitude") Double longitude );
    
    @GET 
    Call<ApplicationModels.ApplicationStoreListing> getInStockLocations(@Url String url1, @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("q") String q , @Query("city") String city , @Query("range") Integer range , @Query("latitude") Double latitude , @Query("longitude") Double longitude );
    
    @GET 
    Call<ApplicationModels.StoreDetails> getLocationDetailsById(@Url String url1);
    
    @GET 
    Call<ApplicationModels.ProductBundle> getProductBundlesBySlug(@Url String url1, @Query("slug") String slug , @Query("id") String id );
    
    @GET 
    Call<ApplicationModels.ProductSizePriceResponseV2> getProductPriceBySlug(@Url String url1, @Query("store_id") Integer storeId , @Query("pincode") String pincode , @Query("moq") Integer moq );
    
    @GET 
    Call<ApplicationModels.ProductSizeSellersResponseV2> getProductSellersBySlug(@Url String url1, @Query("pincode") String pincode , @Query("strategy") String strategy , @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
}

interface CartApiList {
    
    
    @GET 
    Call<ApplicationModels.CartDetailResponse> getCart(@Url String url1, @Query("id") String id , @Query("i") Boolean i , @Query("b") Boolean b , @Query("assign_card_id") Integer assignCardId , @Query("area_code") String areaCode );
    
    @HEAD 
    Call<Object> getCartLastModified(@Url String url1, @Query("id") String id );
    
    @POST 
    Call<ApplicationModels.AddCartDetailResponse> addItems(@Url String url1, @Query("i") Boolean i , @Query("b") Boolean b , @Query("area_code") String areaCode  , @Body ApplicationModels.AddCartRequest payload );
    
    @PUT 
    Call<ApplicationModels.UpdateCartDetailResponse> updateCart(@Url String url1, @Query("id") String id , @Query("i") Boolean i , @Query("b") Boolean b , @Query("area_code") String areaCode  , @Body ApplicationModels.UpdateCartRequest payload );
    
    @GET 
    Call<ApplicationModels.CartItemCountResponse> getItemCount(@Url String url1, @Query("id") String id );
    
    @GET 
    Call<ApplicationModels.GetCouponResponse> getCoupons(@Url String url1, @Query("id") String id );
    
    @POST 
    Call<ApplicationModels.CartDetailResponse> applyCoupon(@Url String url1, @Query("i") Boolean i , @Query("b") Boolean b , @Query("p") Boolean p , @Query("id") String id  , @Body ApplicationModels.ApplyCouponRequest payload );
    
    @DELETE 
    Call<ApplicationModels.CartDetailResponse> removeCoupon(@Url String url1, @Query("id") String id );
    
    @GET 
    Call<ApplicationModels.BulkPriceResponse> getBulkDiscountOffers(@Url String url1, @Query("item_id") Integer itemId , @Query("article_id") String articleId , @Query("uid") Integer uid , @Query("slug") String slug );
    
    @POST 
    Call<ApplicationModels.CartDetailResponse> applyRewardPoints(@Url String url1, @Query("id") String id , @Query("i") Boolean i , @Query("b") Boolean b  , @Body ApplicationModels.RewardPointRequest payload );
    
    @GET 
    Call<ApplicationModels.GetAddressesResponse> getAddresses(@Url String url1, @Query("cart_id") String cartId , @Query("mobile_no") String mobileNo , @Query("checkout_mode") String checkoutMode , @Query("tags") String tags , @Query("is_default") Boolean isDefault );
    
    @POST 
    Call<ApplicationModels.SaveAddressResponse> addAddress(@Url String url1 , @Body ApplicationModels.Address payload );
    
    @GET 
    Call<ApplicationModels.Address> getAddressById(@Url String url1, @Query("cart_id") String cartId , @Query("mobile_no") String mobileNo , @Query("checkout_mode") String checkoutMode , @Query("tags") String tags , @Query("is_default") Boolean isDefault );
    
    @PUT 
    Call<ApplicationModels.UpdateAddressResponse> updateAddress(@Url String url1 , @Body ApplicationModels.Address payload );
    
    @DELETE 
    Call<ApplicationModels.DeleteAddressResponse> removeAddress(@Url String url1);
    
    @POST 
    Call<ApplicationModels.CartDetailResponse> selectAddress(@Url String url1, @Query("cart_id") String cartId , @Query("i") Boolean i , @Query("b") Boolean b  , @Body ApplicationModels.SelectCartAddressRequest payload );
    
    @PUT 
    Call<ApplicationModels.CartDetailResponse> selectPaymentMode(@Url String url1, @Query("id") String id  , @Body ApplicationModels.UpdateCartPaymentRequest payload );
    
    @GET 
    Call<ApplicationModels.PaymentCouponValidate> validateCouponForPayment(@Url String url1, @Query("id") String id , @Query("address_id") String addressId , @Query("payment_mode") String paymentMode , @Query("payment_identifier") String paymentIdentifier , @Query("aggregator_name") String aggregatorName , @Query("merchant_code") String merchantCode );
    
    @GET 
    Call<ApplicationModels.CartShipmentsResponse> getShipments(@Url String url1, @Query("p") Boolean p , @Query("id") String id , @Query("address_id") String addressId , @Query("area_code") String areaCode );
    
    @POST 
    Call<ApplicationModels.CartCheckoutResponse> checkoutCart(@Url String url1 , @Body ApplicationModels.CartCheckoutDetailRequest payload );
    
    @PUT 
    Call<ApplicationModels.CartMetaResponse> updateCartMeta(@Url String url1, @Query("id") String id  , @Body ApplicationModels.CartMetaRequest payload );
    
    @POST 
    Call<ApplicationModels.GetShareCartLinkResponse> getCartShareLink(@Url String url1 , @Body ApplicationModels.GetShareCartLinkRequest payload );
    
    @GET 
    Call<ApplicationModels.SharedCartResponse> getCartSharedItems(@Url String url1);
    
    @POST 
    Call<ApplicationModels.SharedCartResponse> updateCartWithSharedItems(@Url String url1);
    
    @GET 
    Call<ApplicationModels.PromotionOffersResponse> getPromotionOffers(@Url String url1, @Query("slug") String slug , @Query("page_size") Integer pageSize , @Query("promotion_group") String promotionGroup );
    
    @GET 
    Call<ApplicationModels.LadderPriceOffers> getLadderOffers(@Url String url1, @Query("slug") String slug , @Query("store_id") String storeId , @Query("promotion_id") String promotionId , @Query("page_size") Integer pageSize );
}

interface CommonApiList {
    
    
    @GET 
    Call<ApplicationModels.ApplicationResponse> searchApplication(@Url String url1,@Header("authorization")String authorization , @Query("query") String query );
    
    @GET 
    Call<ApplicationModels.Locations> getLocations(@Url String url1, @Query("location_type") String locationType , @Query("id") String id );
}

interface LeadApiList {
    
    
    @GET 
    Call<ApplicationModels.Ticket> getTicket(@Url String url1);
    
    @POST 
    Call<ApplicationModels.TicketHistory> createHistory(@Url String url1 , @Body ApplicationModels.TicketHistoryPayload payload );
    
    @POST 
    Call<ApplicationModels.Ticket> createTicket(@Url String url1 , @Body ApplicationModels.AddTicketPayload payload );
    
    @GET 
    Call<ApplicationModels.CustomForm> getCustomForm(@Url String url1);
    
    @POST 
    Call<ApplicationModels.SubmitCustomFormResponse> submitCustomForm(@Url String url1 , @Body ApplicationModels.CustomFormSubmissionPayload payload );
    
    @GET 
    Call<ApplicationModels.GetParticipantsInsideVideoRoomResponse> getParticipantsInsideVideoRoom(@Url String url1);
    
    @GET 
    Call<ApplicationModels.GetTokenForVideoRoomResponse> getTokenForVideoRoom(@Url String url1);
}

interface ThemeApiList {
    
    
    @GET 
    Call<ApplicationModels.AllAvailablePageSchema> getAllPages(@Url String url1);
    
    @GET 
    Call<ApplicationModels.AvailablePageSchema> getPage(@Url String url1);
    
    @GET 
    Call<ApplicationModels.ThemesSchema> getAppliedTheme(@Url String url1);
    
    @GET 
    Call<ApplicationModels.ThemesSchema> getThemeForPreview(@Url String url1);
}

interface UserApiList {
    
    
    @POST 
    Call<ApplicationModels.AuthSuccess> loginWithFacebook(@Url String url1, @Query("platform") String platform  , @Body ApplicationModels.OAuthRequestSchema payload );
    
    @POST 
    Call<ApplicationModels.AuthSuccess> loginWithGoogle(@Url String url1, @Query("platform") String platform  , @Body ApplicationModels.OAuthRequestSchema payload );
    
    @POST 
    Call<ApplicationModels.AuthSuccess> loginWithGoogleAndroid(@Url String url1, @Query("platform") String platform  , @Body ApplicationModels.OAuthRequestSchema payload );
    
    @POST 
    Call<ApplicationModels.AuthSuccess> loginWithGoogleIOS(@Url String url1, @Query("platform") String platform  , @Body ApplicationModels.OAuthRequestSchema payload );
    
    @POST 
    Call<ApplicationModels.AuthSuccess> loginWithAppleIOS(@Url String url1, @Query("platform") String platform  , @Body ApplicationModels.OAuthRequestAppleSchema payload );
    
    @POST 
    Call<ApplicationModels.SendOtpResponse> loginWithOTP(@Url String url1, @Query("platform") String platform  , @Body ApplicationModels.SendOtpRequestSchema payload );
    
    @POST 
    Call<ApplicationModels.LoginSuccess> loginWithEmailAndPassword(@Url String url1 , @Body ApplicationModels.PasswordLoginRequestSchema payload );
    
    @POST 
    Call<ApplicationModels.ResetPasswordSuccess> sendResetPasswordEmail(@Url String url1, @Query("platform") String platform  , @Body ApplicationModels.SendResetPasswordEmailRequestSchema payload );
    
    @POST 
    Call<ApplicationModels.ResetPasswordSuccess> sendResetPasswordMobile(@Url String url1, @Query("platform") String platform  , @Body ApplicationModels.SendResetPasswordMobileRequestSchema payload );
    
    @POST 
    Call<ApplicationModels.LoginSuccess> forgotPassword(@Url String url1 , @Body ApplicationModels.ForgotPasswordRequestSchema payload );
    
    @POST 
    Call<ApplicationModels.ResetPasswordSuccess> sendResetToken(@Url String url1 , @Body ApplicationModels.CodeRequestBodySchema payload );
    
    @POST 
    Call<ApplicationModels.LoginSuccess> loginWithToken(@Url String url1 , @Body ApplicationModels.TokenRequestBodySchema payload );
    
    @POST 
    Call<ApplicationModels.RegisterFormSuccess> registerWithForm(@Url String url1, @Query("platform") String platform  , @Body ApplicationModels.FormRegisterRequestSchema payload );
    
    @POST 
    Call<ApplicationModels.VerifyEmailSuccess> verifyEmail(@Url String url1 , @Body ApplicationModels.CodeRequestBodySchema payload );
    
    @POST 
    Call<ApplicationModels.VerifyEmailSuccess> verifyMobile(@Url String url1 , @Body ApplicationModels.CodeRequestBodySchema payload );
    
    @GET 
    Call<ApplicationModels.HasPasswordSuccess> hasPassword(@Url String url1);
    
    @POST 
    Call<ApplicationModels.VerifyEmailSuccess> updatePassword(@Url String url1 , @Body ApplicationModels.UpdatePasswordRequestSchema payload );
    
    @GET 
    Call<ApplicationModels.LogoutSuccess> logout(@Url String url1);
    
    @POST 
    Call<ApplicationModels.OtpSuccess> sendOTPOnMobile(@Url String url1, @Query("platform") String platform  , @Body ApplicationModels.SendMobileOtpRequestSchema payload );
    
    @POST 
    Call<ApplicationModels.VerifyOtpSuccess> verifyMobileOTP(@Url String url1, @Query("platform") String platform  , @Body ApplicationModels.VerifyOtpRequestSchema payload );
    
    @POST 
    Call<ApplicationModels.EmailOtpSuccess> sendOTPOnEmail(@Url String url1, @Query("platform") String platform  , @Body ApplicationModels.SendEmailOtpRequestSchema payload );
    
    @POST 
    Call<ApplicationModels.VerifyOtpSuccess> verifyEmailOTP(@Url String url1, @Query("platform") String platform  , @Body ApplicationModels.VerifyEmailOtpRequestSchema payload );
    
    @GET 
    Call<ApplicationModels.UserObjectSchema> getLoggedInUser(@Url String url1);
    
    @GET 
    Call<ApplicationModels.SessionListSuccess> getListOfActiveSessions(@Url String url1);
    
    @GET 
    Call<ApplicationModels.PlatformSchema> getPlatformConfig(@Url String url1, @Query("name") String name );
    
    @POST 
    Call<ApplicationModels.ProfileEditSuccess> updateProfile(@Url String url1, @Query("platform") String platform  , @Body ApplicationModels.EditProfileRequestSchema payload );
    
    @PUT 
    Call<ApplicationModels.VerifyMobileOTPSuccess> addMobileNumber(@Url String url1, @Query("platform") String platform  , @Body ApplicationModels.EditMobileRequestSchema payload );
    
    @DELETE 
    Call<ApplicationModels.LoginSuccess> deleteMobileNumber(@Url String url1, @Query("platform") String platform , @Query("active") Boolean active , @Query("primary") Boolean primary , @Query("verified") Boolean verified , @Query("country_code") String countryCode , @Query("phone") String phone );
    
    @POST 
    Call<ApplicationModels.LoginSuccess> setMobileNumberAsPrimary(@Url String url1 , @Body ApplicationModels.SendVerificationLinkMobileRequestSchema payload );
    
    @POST 
    Call<ApplicationModels.SendMobileVerifyLinkSuccess> sendVerificationLinkToMobile(@Url String url1, @Query("platform") String platform  , @Body ApplicationModels.SendVerificationLinkMobileRequestSchema payload );
    
    @PUT 
    Call<ApplicationModels.VerifyEmailOTPSuccess> addEmail(@Url String url1, @Query("platform") String platform  , @Body ApplicationModels.EditEmailRequestSchema payload );
    
    @DELETE 
    Call<ApplicationModels.LoginSuccess> deleteEmail(@Url String url1, @Query("platform") String platform , @Query("active") Boolean active , @Query("primary") Boolean primary , @Query("verified") Boolean verified , @Query("email") String email );
    
    @POST 
    Call<ApplicationModels.LoginSuccess> setEmailAsPrimary(@Url String url1 , @Body ApplicationModels.EditEmailRequestSchema payload );
    
    @POST 
    Call<ApplicationModels.SendEmailVerifyLinkSuccess> sendVerificationLinkToEmail(@Url String url1, @Query("platform") String platform  , @Body ApplicationModels.EditEmailRequestSchema payload );
}

interface ContentApiList {
    
    
    @GET 
    Call<ApplicationModels.AnnouncementsResponseSchema> getAnnouncements(@Url String url1);
    
    @GET 
    Call<ApplicationModels.BlogSchema> getBlog(@Url String url1, @Query("root_id") String rootId );
    
    @GET 
    Call<ApplicationModels.BlogGetResponse> getBlogs(@Url String url1, @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET 
    Call<ApplicationModels.DataLoadersSchema> getDataLoaders(@Url String url1);
    
    @GET 
    Call<ApplicationModels.FaqResponseSchema> getFaqs(@Url String url1);
    
    @GET 
    Call<ApplicationModels.GetFaqCategoriesSchema> getFaqCategories(@Url String url1);
    
    @GET 
    Call<ApplicationModels.FaqSchema> getFaqBySlug(@Url String url1);
    
    @GET 
    Call<ApplicationModels.GetFaqCategoryBySlugSchema> getFaqCategoryBySlug(@Url String url1);
    
    @GET 
    Call<ApplicationModels.GetFaqSchema> getFaqsByCategorySlug(@Url String url1);
    
    @GET 
    Call<ApplicationModels.LandingPageSchema> getLandingPage(@Url String url1);
    
    @GET 
    Call<ApplicationModels.ApplicationLegal> getLegalInformation(@Url String url1);
    
    @GET 
    Call<ApplicationModels.NavigationGetResponse> getNavigations(@Url String url1, @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET 
    Call<ApplicationModels.SeoComponent> getSEOConfiguration(@Url String url1);
    
    @GET 
    Call<ApplicationModels.SlideshowGetResponse> getSlideshows(@Url String url1, @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
    
    @GET 
    Call<ApplicationModels.SlideshowSchema> getSlideshow(@Url String url1);
    
    @GET 
    Call<ApplicationModels.Support> getSupportInformation(@Url String url1);
    
    @GET 
    Call<ApplicationModels.TagsSchema> getTags(@Url String url1);
    
    @GET 
    Call<ApplicationModels.PageSchema> getPage(@Url String url1, @Query("root_id") String rootId );
    
    @GET 
    Call<ApplicationModels.PageGetResponse> getPages(@Url String url1, @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize );
}

interface CommunicationApiList {
    
    
    @GET 
    Call<ApplicationModels.CommunicationConsent> getCommunicationConsent(@Url String url1);
    
    @POST 
    Call<ApplicationModels.CommunicationConsentRes> upsertCommunicationConsent(@Url String url1 , @Body ApplicationModels.CommunicationConsentReq payload );
    
    @POST 
    Call<ApplicationModels.PushtokenRes> upsertAppPushtoken(@Url String url1 , @Body ApplicationModels.PushtokenReq payload );
}

interface ShareApiList {
    
    
    @POST 
    Call<ApplicationModels.QRCodeResp> getApplicationQRCode(@Url String url1);
    
    @POST 
    Call<ApplicationModels.QRCodeResp> getProductQRCodeBySlug(@Url String url1);
    
    @POST 
    Call<ApplicationModels.QRCodeResp> getCollectionQRCodeBySlug(@Url String url1);
    
    @POST 
    Call<ApplicationModels.QRCodeResp> getUrlQRCode(@Url String url1, @Query("url") String url );
    
    @POST 
    Call<ApplicationModels.ShortLinkRes> createShortLink(@Url String url1 , @Body ApplicationModels.ShortLinkReq payload );
    
    @GET 
    Call<ApplicationModels.ShortLinkRes> getShortLinkByHash(@Url String url1);
    
    @GET 
    Call<ApplicationModels.ShortLinkRes> getOriginalShortLinkByHash(@Url String url1);
}

interface FileStorageApiList {
    
    
    @POST 
    Call<ApplicationModels.StartResponse> startUpload(@Url String url1 , @Body ApplicationModels.StartRequest payload );
    
    @POST 
    Call<ApplicationModels.CompleteResponse> completeUpload(@Url String url1 , @Body ApplicationModels.StartResponse payload );
    
    @POST 
    Call<ApplicationModels.SignUrlResponse> signUrls(@Url String url1 , @Body ApplicationModels.SignUrlRequest payload );
}

interface ConfigurationApiList {
    
    
    @GET 
    Call<ApplicationModels.Application> getApplication(@Url String url1);
    
    @GET 
    Call<ApplicationModels.ApplicationAboutResponse> getOwnerInfo(@Url String url1);
    
    @GET 
    Call<ApplicationModels.ApplicationDetail> getBasicDetails(@Url String url1);
    
    @GET 
    Call<ApplicationModels.AppTokenResponse> getIntegrationTokens(@Url String url1);
    
    @GET 
    Call<ApplicationModels.OrderingStores> getOrderingStores(@Url String url1, @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("q") String q );
    
    @GET 
    Call<ApplicationModels.OrderingStore> getStoreDetailById(@Url String url1);
    
    @GET 
    Call<ApplicationModels.AppFeatureResponse> getFeatures(@Url String url1);
    
    @GET 
    Call<ApplicationModels.ApplicationInformation> getContactInfo(@Url String url1);
    
    @GET 
    Call<ApplicationModels.CurrenciesResponse> getCurrencies(@Url String url1);
    
    @GET 
    Call<ApplicationModels.Currency> getCurrencyById(@Url String url1);
    
    @GET 
    Call<ApplicationModels.AppCurrencyResponse> getAppCurrencies(@Url String url1);
    
    @GET 
    Call<ApplicationModels.LanguageResponse> getLanguages(@Url String url1);
    
    @POST 
    Call<ApplicationModels.SuccessMessageResponse> getOrderingStoreCookie(@Url String url1 , @Body ApplicationModels.OrderingStoreSelectRequest payload );
    
    @DELETE 
    Call<ApplicationModels.SuccessMessageResponse> removeOrderingStoreCookie(@Url String url1);
    
    @GET 
    Call<ApplicationModels.AppStaffListResponse> getAppStaffList(@Url String url1, @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("order_incent") Boolean orderIncent , @Query("ordering_store") Integer orderingStore , @Query("user") String user );
    
    @GET 
    Call<ApplicationModels.AppStaffResponse> getAppStaffs(@Url String url1, @Query("order_incent") Boolean orderIncent , @Query("ordering_store") Integer orderingStore , @Query("user") String user );
}

interface PaymentApiList {
    
    
    @GET 
    Call<ApplicationModels.AggregatorsConfigDetailResponse> getAggregatorsConfig(@Url String url1,@Header("x-api-token")String xApiToken , @Query("refresh") Boolean refresh );
    
    @POST 
    Call<ApplicationModels.AttachCardsResponse> attachCardToCustomer(@Url String url1 , @Body ApplicationModels.AttachCardRequest payload );
    
    @GET 
    Call<ApplicationModels.ActiveCardPaymentGatewayResponse> getActiveCardAggregator(@Url String url1, @Query("refresh") Boolean refresh );
    
    @GET 
    Call<ApplicationModels.ListCardsResponse> getActiveUserCards(@Url String url1, @Query("force_refresh") Boolean forceRefresh );
    
    @POST 
    Call<ApplicationModels.DeleteCardsResponse> deleteUserCard(@Url String url1 , @Body ApplicationModels.DeletehCardRequest payload );
    
    @POST 
    Call<ApplicationModels.ValidateCustomerResponse> verifyCustomerForPayment(@Url String url1 , @Body ApplicationModels.ValidateCustomerRequest payload );
    
    @POST 
    Call<ApplicationModels.ChargeCustomerResponse> verifyAndChargePayment(@Url String url1 , @Body ApplicationModels.ChargeCustomerRequest payload );
    
    @POST 
    Call<ApplicationModels.PaymentInitializationResponse> initialisePayment(@Url String url1 , @Body ApplicationModels.PaymentInitializationRequest payload );
    
    @POST 
    Call<ApplicationModels.PaymentStatusUpdateResponse> checkAndUpdatePaymentStatus(@Url String url1 , @Body ApplicationModels.PaymentStatusUpdateRequest payload );
    
    @GET 
    Call<ApplicationModels.PaymentModeRouteResponse> getPaymentModeRoutes(@Url String url1, @Query("amount") Integer amount , @Query("cart_id") String cartId , @Query("pincode") String pincode , @Query("checkout_mode") String checkoutMode , @Query("refresh") Boolean refresh , @Query("card_reference") String cardReference , @Query("user_details") String userDetails );
    
    @GET 
    Call<ApplicationModels.PaymentModeRouteResponse> getPosPaymentModeRoutes(@Url String url1, @Query("amount") Integer amount , @Query("cart_id") String cartId , @Query("pincode") String pincode , @Query("checkout_mode") String checkoutMode , @Query("refresh") Boolean refresh , @Query("card_reference") String cardReference , @Query("order_type") String orderType , @Query("user_details") String userDetails );
    
    @GET 
    Call<ApplicationModels.RupifiBannerResponse> getRupifiBannerDetails(@Url String url1);
    
    @GET 
    Call<ApplicationModels.EpaylaterBannerResponse> getEpaylaterBannerDetails(@Url String url1);
    
    @POST 
    Call<ApplicationModels.ResendOrCancelPaymentResponse> resendOrCancelPayment(@Url String url1 , @Body ApplicationModels.ResendOrCancelPaymentRequest payload );
    
    @GET 
    Call<ApplicationModels.TransferModeResponse> getActiveRefundTransferModes(@Url String url1);
    
    @PUT 
    Call<ApplicationModels.UpdateRefundTransferModeResponse> enableOrDisableRefundTransferMode(@Url String url1 , @Body ApplicationModels.UpdateRefundTransferModeRequest payload );
    
    @GET 
    Call<ApplicationModels.OrderBeneficiaryResponse> getUserBeneficiariesDetail(@Url String url1, @Query("order_id") String orderId );
    
    @GET 
    Call<ApplicationModels.IfscCodeResponse> verifyIfscCode(@Url String url1, @Query("ifsc_code") String ifscCode );
    
    @GET 
    Call<ApplicationModels.OrderBeneficiaryResponse> getOrderBeneficiariesDetail(@Url String url1, @Query("order_id") String orderId );
    
    @POST 
    Call<ApplicationModels.AddBeneficiaryViaOtpVerificationResponse> verifyOtpAndAddBeneficiaryForBank(@Url String url1 , @Body ApplicationModels.AddBeneficiaryViaOtpVerificationRequest payload );
    
    @POST 
    Call<ApplicationModels.RefundAccountResponse> addBeneficiaryDetails(@Url String url1 , @Body ApplicationModels.AddBeneficiaryDetailsRequest payload );
    
    @POST 
    Call<ApplicationModels.RefundAccountResponse> addRefundBankAccountUsingOTP(@Url String url1 , @Body ApplicationModels.AddBeneficiaryDetailsOTPRequest payload );
    
    @POST 
    Call<ApplicationModels.WalletOtpResponse> verifyOtpAndAddBeneficiaryForWallet(@Url String url1 , @Body ApplicationModels.WalletOtpRequest payload );
    
    @POST 
    Call<ApplicationModels.SetDefaultBeneficiaryResponse> updateDefaultBeneficiary(@Url String url1 , @Body ApplicationModels.SetDefaultBeneficiaryRequest payload );
    
    @GET 
    Call<ApplicationModels.CustomerCreditSummaryResponse> customerCreditSummary(@Url String url1, @Query("aggregator") String aggregator );
    
    @GET 
    Call<ApplicationModels.RedirectToAggregatorResponse> redirectToAggregator(@Url String url1, @Query("source") String source , @Query("aggregator") String aggregator );
    
    @GET 
    Call<ApplicationModels.CheckCreditResponse> checkCredit(@Url String url1, @Query("aggregator") String aggregator );
    
    @POST 
    Call<ApplicationModels.CustomerOnboardingResponse> customerOnboard(@Url String url1 , @Body ApplicationModels.CustomerOnboardingRequest payload );
    
    @GET 
    Call<ApplicationModels.OutstandingOrderDetailsResponse> outstandingOrderDetails(@Url String url1, @Query("aggregator") String aggregator );
    
    @GET 
    Call<ApplicationModels.PaidOrderDetailsResponse> paidOrderDetails(@Url String url1, @Query("aggregator") String aggregator );
}

interface OrderApiList {
    
    
    @GET 
    Call<ApplicationModels.OrderList> getOrders(@Url String url1, @Query("page_no") Integer pageNo , @Query("page_size") Integer pageSize , @Query("from_date") String fromDate , @Query("to_date") String toDate , @Query("status") Integer status , @Query("custom_meta") String customMeta );
    
    @GET 
    Call<ApplicationModels.OrderById> getOrderById(@Url String url1);
    
    @GET 
    Call<ApplicationModels.ShipmentById> getShipmentById(@Url String url1);
    
    @GET 
    Call<ApplicationModels.ShipmentReasons> getShipmentReasons(@Url String url1);
    
    @GET 
    Call<ApplicationModels.ShipmentBagReasons> getShipmentBagReasons(@Url String url1);
    
    @PUT 
    Call<ApplicationModels.ShipmentStatusUpdate> updateShipmentStatus(@Url String url1 , @Body ApplicationModels.ShipmentStatusUpdateBody payload );
    
    @GET 
    Call<ApplicationModels.ShipmentTrack> trackShipment(@Url String url1);
    
    @GET 
    Call<ApplicationModels.PosOrderById> getPosOrderById(@Url String url1);
    
    @GET 
    Call<ApplicationModels.CustomerDetailsByShipmentId> getCustomerDetailsByShipmentId(@Url String url1);
    
    @POST 
    Call<ApplicationModels.sendOTPApplicationResponse> sendOtpToShipmentCustomer(@Url String url1);
    
    @POST 
    Call<ApplicationModels.ResponseVerifyOTPShipment> verifyOtpShipmentCustomer(@Url String url1 , @Body ApplicationModels.ReqBodyVerifyOTPShipment payload );
    
    @GET 
    Call<ApplicationModels.ResponseGetInvoiceShipment> getInvoiceByShipmentId(@Url String url1);
    
    @GET 
    Call<ApplicationModels.ResponseGetCreditNoteShipment> getCreditNoteByShipmentId(@Url String url1);
}

interface RewardsApiList {
    
    
    @POST 
    Call<ApplicationModels.CatalogueOrderResponse> getPointsOnProduct(@Url String url1 , @Body ApplicationModels.CatalogueOrderRequest payload );
    
    @GET 
    Call<ApplicationModels.Offer> getOfferByName(@Url String url1);
    
    @POST 
    Call<ApplicationModels.OrderDiscountResponse> getOrderDiscount(@Url String url1 , @Body ApplicationModels.OrderDiscountRequest payload );
    
    @GET 
    Call<ApplicationModels.PointsResponse> getUserPoints(@Url String url1);
    
    @GET 
    Call<ApplicationModels.PointsHistoryResponse> getUserPointsHistory(@Url String url1, @Query("page_id") String pageId , @Query("page_size") Integer pageSize );
    
    @GET 
    Call<ApplicationModels.ReferralDetailsResponse> getUserReferralDetails(@Url String url1);
    
    @POST 
    Call<ApplicationModels.RedeemReferralCodeResponse> redeemReferralCode(@Url String url1 , @Body ApplicationModels.RedeemReferralCodeRequest payload );
}

interface PosCartApiList {
    
    
    @GET 
    Call<ApplicationModels.CartDetailResponse> getCart(@Url String url1, @Query("id") String id , @Query("i") Boolean i , @Query("b") Boolean b , @Query("assign_card_id") Integer assignCardId , @Query("area_code") String areaCode );
    
    @HEAD 
    Call<Object> getCartLastModified(@Url String url1, @Query("id") String id );
    
    @POST 
    Call<ApplicationModels.AddCartDetailResponse> addItems(@Url String url1, @Query("i") Boolean i , @Query("b") Boolean b , @Query("area_code") String areaCode  , @Body ApplicationModels.AddCartRequest payload );
    
    @PUT 
    Call<ApplicationModels.UpdateCartDetailResponse> updateCart(@Url String url1, @Query("id") String id , @Query("i") Boolean i , @Query("b") Boolean b , @Query("area_code") String areaCode  , @Body ApplicationModels.UpdateCartRequest payload );
    
    @GET 
    Call<ApplicationModels.CartItemCountResponse> getItemCount(@Url String url1, @Query("id") String id );
    
    @GET 
    Call<ApplicationModels.GetCouponResponse> getCoupons(@Url String url1, @Query("id") String id );
    
    @POST 
    Call<ApplicationModels.CartDetailResponse> applyCoupon(@Url String url1, @Query("i") Boolean i , @Query("b") Boolean b , @Query("p") Boolean p , @Query("id") String id  , @Body ApplicationModels.ApplyCouponRequest payload );
    
    @DELETE 
    Call<ApplicationModels.CartDetailResponse> removeCoupon(@Url String url1, @Query("id") String id );
    
    @GET 
    Call<ApplicationModels.BulkPriceResponse> getBulkDiscountOffers(@Url String url1, @Query("item_id") Integer itemId , @Query("article_id") String articleId , @Query("uid") Integer uid , @Query("slug") String slug );
    
    @POST 
    Call<ApplicationModels.CartDetailResponse> applyRewardPoints(@Url String url1, @Query("id") String id , @Query("i") Boolean i , @Query("b") Boolean b  , @Body ApplicationModels.RewardPointRequest payload );
    
    @GET 
    Call<ApplicationModels.GetAddressesResponse> getAddresses(@Url String url1, @Query("cart_id") String cartId , @Query("mobile_no") String mobileNo , @Query("checkout_mode") String checkoutMode , @Query("tags") String tags , @Query("is_default") Boolean isDefault );
    
    @POST 
    Call<ApplicationModels.SaveAddressResponse> addAddress(@Url String url1 , @Body ApplicationModels.Address payload );
    
    @GET 
    Call<ApplicationModels.Address> getAddressById(@Url String url1, @Query("cart_id") String cartId , @Query("mobile_no") String mobileNo , @Query("checkout_mode") String checkoutMode , @Query("tags") String tags , @Query("is_default") Boolean isDefault );
    
    @PUT 
    Call<ApplicationModels.UpdateAddressResponse> updateAddress(@Url String url1 , @Body ApplicationModels.Address payload );
    
    @DELETE 
    Call<ApplicationModels.DeleteAddressResponse> removeAddress(@Url String url1);
    
    @POST 
    Call<ApplicationModels.CartDetailResponse> selectAddress(@Url String url1, @Query("cart_id") String cartId , @Query("i") Boolean i , @Query("b") Boolean b  , @Body ApplicationModels.SelectCartAddressRequest payload );
    
    @PUT 
    Call<ApplicationModels.CartDetailResponse> selectPaymentMode(@Url String url1, @Query("id") String id  , @Body ApplicationModels.UpdateCartPaymentRequest payload );
    
    @GET 
    Call<ApplicationModels.PaymentCouponValidate> validateCouponForPayment(@Url String url1, @Query("id") String id , @Query("address_id") String addressId , @Query("payment_mode") String paymentMode , @Query("payment_identifier") String paymentIdentifier , @Query("aggregator_name") String aggregatorName , @Query("merchant_code") String merchantCode );
    
    @GET 
    Call<ApplicationModels.CartShipmentsResponse> getShipments(@Url String url1, @Query("pick_at_store_uid") Integer pickAtStoreUid , @Query("ordering_store_id") Integer orderingStoreId , @Query("p") Boolean p , @Query("id") String id , @Query("address_id") String addressId , @Query("area_code") String areaCode , @Query("order_type") String orderType );
    
    @PUT 
    Call<ApplicationModels.CartShipmentsResponse> updateShipments(@Url String url1, @Query("i") Boolean i , @Query("p") Boolean p , @Query("id") String id , @Query("address_id") String addressId , @Query("order_type") String orderType  , @Body ApplicationModels.UpdateCartShipmentRequest payload );
    
    @POST 
    Call<ApplicationModels.CartCheckoutResponse> checkoutCart(@Url String url1, @Query("id") String id  , @Body ApplicationModels.CartPosCheckoutDetailRequest payload );
    
    @PUT 
    Call<ApplicationModels.CartMetaResponse> updateCartMeta(@Url String url1, @Query("id") String id  , @Body ApplicationModels.CartMetaRequest payload );
    
    @GET 
    Call<ApplicationModels.CartDeliveryModesResponse> getAvailableDeliveryModes(@Url String url1, @Query("area_code") String areaCode , @Query("id") String id );
    
    @GET 
    Call<ApplicationModels.StoreDetailsResponse> getStoreAddressByUid(@Url String url1, @Query("store_uid") Integer storeUid );
    
    @POST 
    Call<ApplicationModels.GetShareCartLinkResponse> getCartShareLink(@Url String url1 , @Body ApplicationModels.GetShareCartLinkRequest payload );
    
    @GET 
    Call<ApplicationModels.SharedCartResponse> getCartSharedItems(@Url String url1);
    
    @POST 
    Call<ApplicationModels.SharedCartResponse> updateCartWithSharedItems(@Url String url1);
}

interface LogisticApiList {
    
    
    @POST 
    Call<ApplicationModels.GetTatProductResponse> getTatProduct(@Url String url1 , @Body ApplicationModels.GetTatProductReqBody payload );
    
    @POST 
    Call<ApplicationModels.GetPincodeZonesResponse> getPincodeZones(@Url String url1 , @Body ApplicationModels.GetPincodeZonesReqBody payload );
    
    @GET 
    Call<ApplicationModels.GetPincodeCityResponse> getPincodeCity(@Url String url1);
}

