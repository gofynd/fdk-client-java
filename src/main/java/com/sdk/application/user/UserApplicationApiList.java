package com.sdk.application.user;

import retrofit2.http.*;
import retrofit2.Call;
import java.util.*;



interface UserApplicationApiList {
    
    
    @POST 
    Call<UserApplicationModels.AuthSuccess> loginWithFacebook(@Url String url1, @Query("platform") String platform  , @Body UserApplicationModels.OAuthRequestSchema payload );
    
    @POST 
    Call<UserApplicationModels.AuthSuccess> loginWithGoogle(@Url String url1, @Query("platform") String platform  , @Body UserApplicationModels.OAuthRequestSchema payload );
    
    @POST 
    Call<UserApplicationModels.AuthSuccess> loginWithGoogleAndroid(@Url String url1, @Query("platform") String platform  , @Body UserApplicationModels.OAuthRequestSchema payload );
    
    @POST 
    Call<UserApplicationModels.AuthSuccess> loginWithGoogleIOS(@Url String url1, @Query("platform") String platform  , @Body UserApplicationModels.OAuthRequestSchema payload );
    
    @POST 
    Call<UserApplicationModels.AuthSuccess> loginWithAppleIOS(@Url String url1, @Query("platform") String platform  , @Body UserApplicationModels.OAuthRequestAppleSchema payload );
    
    @POST 
    Call<UserApplicationModels.SendOtpResponse> loginWithOTP(@Url String url1, @Query("platform") String platform  , @Body UserApplicationModels.SendOtpRequestSchema payload );
    
    @POST 
    Call<UserApplicationModels.LoginSuccess> loginWithEmailAndPassword(@Url String url1 , @Body UserApplicationModels.PasswordLoginRequestSchema payload );
    
    @POST 
    Call<UserApplicationModels.ResetPasswordSuccess> sendResetPasswordEmail(@Url String url1, @Query("platform") String platform  , @Body UserApplicationModels.SendResetPasswordEmailRequestSchema payload );
    
    @POST 
    Call<UserApplicationModels.ResetPasswordSuccess> sendResetPasswordMobile(@Url String url1, @Query("platform") String platform  , @Body UserApplicationModels.SendResetPasswordMobileRequestSchema payload );
    
    @POST 
    Call<UserApplicationModels.LoginSuccess> forgotPassword(@Url String url1 , @Body UserApplicationModels.ForgotPasswordRequestSchema payload );
    
    @POST 
    Call<UserApplicationModels.ResetPasswordSuccess> sendResetToken(@Url String url1 , @Body UserApplicationModels.CodeRequestBodySchema payload );
    
    @POST 
    Call<UserApplicationModels.LoginSuccess> loginWithToken(@Url String url1 , @Body UserApplicationModels.TokenRequestBodySchema payload );
    
    @POST 
    Call<UserApplicationModels.RegisterFormSuccess> registerWithForm(@Url String url1, @Query("platform") String platform  , @Body UserApplicationModels.FormRegisterRequestSchema payload );
    
    @POST 
    Call<UserApplicationModels.VerifyEmailSuccess> verifyEmail(@Url String url1 , @Body UserApplicationModels.CodeRequestBodySchema payload );
    
    @POST 
    Call<UserApplicationModels.VerifyEmailSuccess> verifyMobile(@Url String url1 , @Body UserApplicationModels.CodeRequestBodySchema payload );
    
    @GET 
    Call<UserApplicationModels.HasPasswordSuccess> hasPassword(@Url String url1);
    
    @POST 
    Call<UserApplicationModels.VerifyEmailSuccess> updatePassword(@Url String url1 , @Body UserApplicationModels.UpdatePasswordRequestSchema payload );
    
    @POST 
    Call<UserApplicationModels.DeleteUserSuccess> deleteUser(@Url String url1 , @Body UserApplicationModels.DeleteApplicationUserRequestSchema payload );
    
    @GET 
    Call<UserApplicationModels.LogoutSuccess> logout(@Url String url1);
    
    @POST 
    Call<UserApplicationModels.OtpSuccess> sendOTPOnMobile(@Url String url1, @Query("platform") String platform  , @Body UserApplicationModels.SendMobileOtpRequestSchema payload );
    
    @POST 
    Call<UserApplicationModels.VerifyOtpSuccess> verifyMobileOTP(@Url String url1, @Query("platform") String platform  , @Body UserApplicationModels.VerifyOtpRequestSchema payload );
    
    @POST 
    Call<UserApplicationModels.EmailOtpSuccess> sendOTPOnEmail(@Url String url1, @Query("platform") String platform  , @Body UserApplicationModels.SendEmailOtpRequestSchema payload );
    
    @POST 
    Call<UserApplicationModels.VerifyOtpSuccess> verifyEmailOTP(@Url String url1, @Query("platform") String platform  , @Body UserApplicationModels.VerifyEmailOtpRequestSchema payload );
    
    @GET 
    Call<UserApplicationModels.UserObjectSchema> getLoggedInUser(@Url String url1);
    
    @GET 
    Call<UserApplicationModels.SessionListSuccess> getListOfActiveSessions(@Url String url1);
    
    @GET 
    Call<UserApplicationModels.PlatformSchema> getPlatformConfig(@Url String url1, @Query("name") String name );
    
    @POST 
    Call<UserApplicationModels.ProfileEditSuccess> updateProfile(@Url String url1, @Query("platform") String platform  , @Body UserApplicationModels.EditProfileRequestSchema payload );
    
    @PUT 
    Call<UserApplicationModels.VerifyMobileOTPSuccess> addMobileNumber(@Url String url1, @Query("platform") String platform  , @Body UserApplicationModels.EditMobileRequestSchema payload );
    
    @DELETE 
    Call<UserApplicationModels.LoginSuccess> deleteMobileNumber(@Url String url1, @Query("platform") String platform , @Query("active") Boolean active , @Query("primary") Boolean primary , @Query("verified") Boolean verified , @Query("country_code") String countryCode , @Query("phone") String phone );
    
    @POST 
    Call<UserApplicationModels.LoginSuccess> setMobileNumberAsPrimary(@Url String url1 , @Body UserApplicationModels.SendVerificationLinkMobileRequestSchema payload );
    
    @POST 
    Call<UserApplicationModels.SendMobileVerifyLinkSuccess> sendVerificationLinkToMobile(@Url String url1, @Query("platform") String platform  , @Body UserApplicationModels.SendVerificationLinkMobileRequestSchema payload );
    
    @PUT 
    Call<UserApplicationModels.VerifyEmailOTPSuccess> addEmail(@Url String url1, @Query("platform") String platform  , @Body UserApplicationModels.EditEmailRequestSchema payload );
    
    @DELETE 
    Call<UserApplicationModels.LoginSuccess> deleteEmail(@Url String url1, @Query("platform") String platform , @Query("active") Boolean active , @Query("primary") Boolean primary , @Query("verified") Boolean verified , @Query("email") String email );
    
    @POST 
    Call<UserApplicationModels.LoginSuccess> setEmailAsPrimary(@Url String url1 , @Body UserApplicationModels.EditEmailRequestSchema payload );
    
    @POST 
    Call<UserApplicationModels.SendEmailVerifyLinkSuccess> sendVerificationLinkToEmail(@Url String url1, @Query("platform") String platform  , @Body UserApplicationModels.EditEmailRequestSchema payload );
}