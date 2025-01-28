package com.sdk.application.user;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;

interface UserApplicationApiList {

    @GET 
    Call<UserApplicationModels.UserAttributes> getUserAttributes(@Url String url1, @Query("slug") String slug, @HeaderMap Map<String, String> requestHeaders);

    @PATCH 
    Call<UserApplicationModels.UserAttributes> updateUserAttributes(@Url String url1, @Body UserApplicationModels.UpdateAttributesRequestPayload payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.AuthSuccess> loginWithFacebook(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.OAuthRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.AuthSuccess> loginWithGoogle(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.OAuthRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.AuthSuccess> loginWithGoogleAndroid(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.OAuthRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.AuthSuccess> loginWithGoogleIOS(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.OAuthRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.AuthSuccess> loginWithAppleIOS(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.OAuthRequestAppleSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.SendOtpResponse> loginWithOTP(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.SendOtpRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.LoginSuccess> loginWithEmailAndPassword(@Url String url1, @Body UserApplicationModels.PasswordLoginRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.ResetPasswordSuccess> sendResetPasswordEmail(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.SendResetPasswordEmailRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.ResetPasswordSuccess> sendResetToken(@Url String url1, @Body UserApplicationModels.CodeRequestBodySchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.LoginSuccess> forgotPassword(@Url String url1, @Body UserApplicationModels.ForgotPasswordRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.ResetForgotPasswordSuccess> resetForgotPassword(@Url String url1, @Body UserApplicationModels.ForgotPasswordRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.LoginSuccess> loginWithToken(@Url String url1, @Body UserApplicationModels.TokenRequestBodySchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.RegisterFormSuccess> registerWithForm(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.FormRegisterRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.VerifyEmailSuccess> verifyEmail(@Url String url1, @Body UserApplicationModels.CodeRequestBodySchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.VerifyEmailSuccess> verifyMobile(@Url String url1, @Body UserApplicationModels.CodeRequestBodySchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<UserApplicationModels.HasPasswordSuccess> hasPassword(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.VerifyEmailSuccess> updatePassword(@Url String url1, @Body UserApplicationModels.UpdatePasswordRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.OtpSuccess> sendOTPOnMobile(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.SendMobileOtpRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.OtpSuccess> sendForgotOTPOnMobile(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.SendMobileForgotOtpRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.VerifyOtpSuccess> verifyMobileOTP(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.VerifyOtpRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.VerifyForgotOtpSuccess> verifyMobileForgotOTP(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.VerifyMobileForgotOtpRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.EmailOtpSuccess> sendOTPOnEmail(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.SendEmailOtpRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.EmailOtpSuccess> sendForgotOTPOnEmail(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.SendEmailForgotOtpRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.VerifyOtpSuccess> verifyEmailOTP(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.VerifyEmailOtpRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.VerifyForgotOtpSuccess> verifyEmailForgotOTP(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.VerifyEmailForgotOtpRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<UserApplicationModels.UserObjectSchema> getLoggedInUser(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<UserApplicationModels.SessionListSuccess> getListOfActiveSessions(@Url String url1, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<UserApplicationModels.PlatformSchema> getPlatformConfig(@Url String url1, @Query("name") String name, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.ProfileEditSuccess> updateProfile(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.EditProfileRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<UserApplicationModels.VerifyMobileOTPSuccess> addMobileNumber(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.EditMobileRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE 
    Call<UserApplicationModels.LoginSuccess> deleteMobileNumber(@Url String url1, @Query("platform") String platform, @Query("active") Boolean active, @Query("primary") Boolean primary, @Query("verified") Boolean verified, @Query("country_code") String countryCode, @Query("phone") String phone, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.LoginSuccess> setMobileNumberAsPrimary(@Url String url1, @Body UserApplicationModels.SendVerificationLinkMobileRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.SendMobileVerifyLinkSuccess> sendVerificationLinkToMobile(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.SendVerificationLinkMobileRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @PUT 
    Call<UserApplicationModels.VerifyEmailOTPSuccess> addEmail(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.EditEmailRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @DELETE 
    Call<UserApplicationModels.LoginSuccess> deleteEmail(@Url String url1, @Query("platform") String platform, @Query("active") Boolean active, @Query("primary") Boolean primary, @Query("verified") Boolean verified, @Query("email") String email, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.LoginSuccess> setEmailAsPrimary(@Url String url1, @Body UserApplicationModels.EditEmailRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.SendEmailVerifyLinkSuccess> sendVerificationLinkToEmail(@Url String url1, @Query("platform") String platform, @Body UserApplicationModels.EditEmailRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<UserApplicationModels.UserExistsResponse> userExists(@Url String url1, @Query("q") String q, @HeaderMap Map<String, String> requestHeaders);

    @POST 
    Call<UserApplicationModels.DeleteUserSuccess> deleteUser(@Url String url1, @Body UserApplicationModels.DeleteApplicationUserRequestSchema payload, @HeaderMap Map<String, String> requestHeaders);

    @GET 
    Call<UserApplicationModels.LogoutSuccess> logout(@Url String url1, @HeaderMap Map<String, String> requestHeaders);
}