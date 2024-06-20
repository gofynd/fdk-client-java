package com.sdk.application.user;

import lombok.Getter;
import okhttp3.Interceptor;
import retrofit2.Response;

import java.io.IOException;
import java.net.CookieStore;
import java.util.*;
import java.io.File;

import com.sdk.common.*;
import com.sdk.application.*;

@Getter
 public class UserApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private UserApplicationApiList userApplicationApiList;

    private HashMap<String,String> relativeUrls = new HashMap<String,String>();

    public UserApplicationService(ApplicationConfig applicationConfig) {
        this.applicationConfig = applicationConfig;
        this.retrofitServiceFactory = new RetrofitServiceFactory();
        this.userApplicationApiList = generateUserApplicationApiList(this.applicationConfig.getPersistentCookieStore());

        
        relativeUrls.put("loginWithFacebook","/service/application/user/authentication/v1.0/login/facebook-token".substring(1));
        relativeUrls.put("loginWithGoogle","/service/application/user/authentication/v1.0/login/google-token".substring(1));
        relativeUrls.put("loginWithGoogleAndroid","/service/application/user/authentication/v1.0/login/google-android".substring(1));
        relativeUrls.put("loginWithGoogleIOS","/service/application/user/authentication/v1.0/login/google-ios".substring(1));
        relativeUrls.put("loginWithAppleIOS","/service/application/user/authentication/v1.0/login/apple-ios".substring(1));
        relativeUrls.put("loginWithOTP","/service/application/user/authentication/v1.0/login/otp".substring(1));
        relativeUrls.put("loginWithEmailAndPassword","/service/application/user/authentication/v1.0/login/password".substring(1));
        relativeUrls.put("sendResetPasswordEmail","/service/application/user/authentication/v1.0/login/password/reset".substring(1));
        relativeUrls.put("sendResetPasswordMobile","/service/application/user/authentication/v1.0/login/password/mobile/reset".substring(1));
        relativeUrls.put("sendResetToken","/service/application/user/authentication/v1.0/login/password/reset/token".substring(1));
        relativeUrls.put("forgotPassword","/service/application/user/authentication/v1.0/login/password/reset/forgot".substring(1));
        relativeUrls.put("resetForgotPassword","/service/application/user/authentication/v1.0/login/password/forgot".substring(1));
        relativeUrls.put("loginWithToken","/service/application/user/authentication/v1.0/login/token".substring(1));
        relativeUrls.put("registerWithForm","/service/application/user/authentication/v1.0/register/form".substring(1));
        relativeUrls.put("verifyEmail","/service/application/user/authentication/v1.0/verify/email".substring(1));
        relativeUrls.put("verifyMobile","/service/application/user/authentication/v1.0/verify/mobile".substring(1));
        relativeUrls.put("hasPassword","/service/application/user/authentication/v1.0/has-password".substring(1));
        relativeUrls.put("updatePassword","/service/application/user/authentication/v1.0/password".substring(1));
        relativeUrls.put("sendOTPOnMobile","/service/application/user/authentication/v1.0/otp/mobile/send".substring(1));
        relativeUrls.put("sendForgotOTPOnMobile","/service/application/user/authentication/v1.0/otp/forgot/mobile/send".substring(1));
        relativeUrls.put("verifyMobileOTP","/service/application/user/authentication/v1.0/otp/mobile/verify".substring(1));
        relativeUrls.put("verifyMobileForgotOTP","/service/application/user/authentication/v1.0/otp/forgot/mobile/verify".substring(1));
        relativeUrls.put("sendOTPOnEmail","/service/application/user/authentication/v1.0/otp/email/send".substring(1));
        relativeUrls.put("sendForgotOTPOnEmail","/service/application/user/authentication/v1.0/otp/forgot/email/send".substring(1));
        relativeUrls.put("verifyEmailOTP","/service/application/user/authentication/v1.0/otp/email/verify".substring(1));
        relativeUrls.put("verifyEmailForgotOTP","/service/application/user/authentication/v1.0/otp/forgot/email/verify".substring(1));
        relativeUrls.put("getLoggedInUser","/service/application/user/authentication/v1.0/session".substring(1));
        relativeUrls.put("getListOfActiveSessions","/service/application/user/authentication/v1.0/sessions".substring(1));
        relativeUrls.put("getPlatformConfig","/service/application/user/platform/v1.0/config".substring(1));
        relativeUrls.put("updateProfile","/service/application/user/profile/v1.0/detail".substring(1));
        relativeUrls.put("addMobileNumber","/service/application/user/profile/v1.0/mobile".substring(1));
        relativeUrls.put("deleteMobileNumber","/service/application/user/profile/v1.0/mobile".substring(1));
        relativeUrls.put("setMobileNumberAsPrimary","/service/application/user/profile/v1.0/mobile/primary".substring(1));
        relativeUrls.put("sendVerificationLinkToMobile","/service/application/user/profile/v1.0/mobile/link/send".substring(1));
        relativeUrls.put("addEmail","/service/application/user/profile/v1.0/email".substring(1));
        relativeUrls.put("deleteEmail","/service/application/user/profile/v1.0/email".substring(1));
        relativeUrls.put("setEmailAsPrimary","/service/application/user/profile/v1.0/email/primary".substring(1));
        relativeUrls.put("sendVerificationLinkToEmail","/service/application/user/profile/v1.0/email/link/send".substring(1));
        relativeUrls.put("userExists","/service/application/user/authentication/v1.0/user-exists".substring(1));
        relativeUrls.put("deleteUser","/service/application/user/authentication/v1.0/delete".substring(1));
        relativeUrls.put("logout","/service/application/user/authentication/v1.0/logout".substring(1));
        relativeUrls.put("getUserAttributes","/service/application/user/profile/v1.0/user-attributes".substring(1));
        relativeUrls.put("updateUserAttributes","/service/application/user/profile/v1.0/user-attributes".substring(1)); 

    }

    public void update( HashMap<String,String> updatedUrlMap ){
        for(Map.Entry<String,String> entry : updatedUrlMap.entrySet()){
            relativeUrls.put(entry.getKey(),entry.getValue());
        }
    }

    private UserApplicationApiList generateUserApplicationApiList(CookieStore cookieStore) {
        List<Interceptor> interceptorList = new ArrayList<>();
        interceptorList.add(new ApplicationHeaderInterceptor(applicationConfig));
        interceptorList.add(new RequestSignerInterceptor());
        return retrofitServiceFactory.createService(applicationConfig.getDomain(),UserApplicationApiList.class, interceptorList, cookieStore);
    }

    public UserApplicationModels.AuthSuccess loginWithFacebook(String platform, UserApplicationModels.OAuthRequestSchema body) throws IOException {
        return this.loginWithFacebook(platform, body, new HashMap<>());
    }

    public UserApplicationModels.AuthSuccess loginWithFacebook(String platform, UserApplicationModels.OAuthRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("loginWithFacebook");

        Response<UserApplicationModels.AuthSuccess> response = userApplicationApiList.loginWithFacebook(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.AuthSuccess loginWithGoogle(String platform, UserApplicationModels.OAuthRequestSchema body) throws IOException {
        return this.loginWithGoogle(platform, body, new HashMap<>());
    }

    public UserApplicationModels.AuthSuccess loginWithGoogle(String platform, UserApplicationModels.OAuthRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("loginWithGoogle");

        Response<UserApplicationModels.AuthSuccess> response = userApplicationApiList.loginWithGoogle(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.AuthSuccess loginWithGoogleAndroid(String platform, UserApplicationModels.OAuthRequestSchema body) throws IOException {
        return this.loginWithGoogleAndroid(platform, body, new HashMap<>());
    }

    public UserApplicationModels.AuthSuccess loginWithGoogleAndroid(String platform, UserApplicationModels.OAuthRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("loginWithGoogleAndroid");

        Response<UserApplicationModels.AuthSuccess> response = userApplicationApiList.loginWithGoogleAndroid(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.AuthSuccess loginWithGoogleIOS(String platform, UserApplicationModels.OAuthRequestSchema body) throws IOException {
        return this.loginWithGoogleIOS(platform, body, new HashMap<>());
    }

    public UserApplicationModels.AuthSuccess loginWithGoogleIOS(String platform, UserApplicationModels.OAuthRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("loginWithGoogleIOS");

        Response<UserApplicationModels.AuthSuccess> response = userApplicationApiList.loginWithGoogleIOS(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.AuthSuccess loginWithAppleIOS(String platform, UserApplicationModels.OAuthRequestAppleSchema body) throws IOException {
        return this.loginWithAppleIOS(platform, body, new HashMap<>());
    }

    public UserApplicationModels.AuthSuccess loginWithAppleIOS(String platform, UserApplicationModels.OAuthRequestAppleSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("loginWithAppleIOS");

        Response<UserApplicationModels.AuthSuccess> response = userApplicationApiList.loginWithAppleIOS(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.SendOtpResponse loginWithOTP(String platform, UserApplicationModels.SendOtpRequestSchema body) throws IOException {
        return this.loginWithOTP(platform, body, new HashMap<>());
    }

    public UserApplicationModels.SendOtpResponse loginWithOTP(String platform, UserApplicationModels.SendOtpRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("loginWithOTP");

        Response<UserApplicationModels.SendOtpResponse> response = userApplicationApiList.loginWithOTP(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.LoginSuccess loginWithEmailAndPassword(UserApplicationModels.PasswordLoginRequestSchema body) throws IOException {
        return this.loginWithEmailAndPassword(body, new HashMap<>());
    }

    public UserApplicationModels.LoginSuccess loginWithEmailAndPassword(UserApplicationModels.PasswordLoginRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("loginWithEmailAndPassword");

        Response<UserApplicationModels.LoginSuccess> response = userApplicationApiList.loginWithEmailAndPassword(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.ResetPasswordSuccess sendResetPasswordEmail(String platform, UserApplicationModels.SendResetPasswordEmailRequestSchema body) throws IOException {
        return this.sendResetPasswordEmail(platform, body, new HashMap<>());
    }

    public UserApplicationModels.ResetPasswordSuccess sendResetPasswordEmail(String platform, UserApplicationModels.SendResetPasswordEmailRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("sendResetPasswordEmail");

        Response<UserApplicationModels.ResetPasswordSuccess> response = userApplicationApiList.sendResetPasswordEmail(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public Object sendResetPasswordMobile(String platform, UserApplicationModels.SendResetPasswordMobileRequestSchema body) throws IOException {
        return this.sendResetPasswordMobile(platform, body, new HashMap<>());
    }

    public Object sendResetPasswordMobile(String platform, UserApplicationModels.SendResetPasswordMobileRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("sendResetPasswordMobile");

        Response<Object> response = userApplicationApiList.sendResetPasswordMobile(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.ResetPasswordSuccess sendResetToken(UserApplicationModels.CodeRequestBodySchema body) throws IOException {
        return this.sendResetToken(body, new HashMap<>());
    }

    public UserApplicationModels.ResetPasswordSuccess sendResetToken(UserApplicationModels.CodeRequestBodySchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("sendResetToken");

        Response<UserApplicationModels.ResetPasswordSuccess> response = userApplicationApiList.sendResetToken(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.LoginSuccess forgotPassword(UserApplicationModels.ForgotPasswordRequestSchema body) throws IOException {
        return this.forgotPassword(body, new HashMap<>());
    }

    public UserApplicationModels.LoginSuccess forgotPassword(UserApplicationModels.ForgotPasswordRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("forgotPassword");

        Response<UserApplicationModels.LoginSuccess> response = userApplicationApiList.forgotPassword(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.ResetForgotPasswordSuccess resetForgotPassword(UserApplicationModels.ForgotPasswordRequestSchema body) throws IOException {
        return this.resetForgotPassword(body, new HashMap<>());
    }

    public UserApplicationModels.ResetForgotPasswordSuccess resetForgotPassword(UserApplicationModels.ForgotPasswordRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("resetForgotPassword");

        Response<UserApplicationModels.ResetForgotPasswordSuccess> response = userApplicationApiList.resetForgotPassword(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.LoginSuccess loginWithToken(UserApplicationModels.TokenRequestBodySchema body) throws IOException {
        return this.loginWithToken(body, new HashMap<>());
    }

    public UserApplicationModels.LoginSuccess loginWithToken(UserApplicationModels.TokenRequestBodySchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("loginWithToken");

        Response<UserApplicationModels.LoginSuccess> response = userApplicationApiList.loginWithToken(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.RegisterFormSuccess registerWithForm(String platform, UserApplicationModels.FormRegisterRequestSchema body) throws IOException {
        return this.registerWithForm(platform, body, new HashMap<>());
    }

    public UserApplicationModels.RegisterFormSuccess registerWithForm(String platform, UserApplicationModels.FormRegisterRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("registerWithForm");

        Response<UserApplicationModels.RegisterFormSuccess> response = userApplicationApiList.registerWithForm(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.VerifyEmailSuccess verifyEmail(UserApplicationModels.CodeRequestBodySchema body) throws IOException {
        return this.verifyEmail(body, new HashMap<>());
    }

    public UserApplicationModels.VerifyEmailSuccess verifyEmail(UserApplicationModels.CodeRequestBodySchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("verifyEmail");

        Response<UserApplicationModels.VerifyEmailSuccess> response = userApplicationApiList.verifyEmail(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.VerifyEmailSuccess verifyMobile(UserApplicationModels.CodeRequestBodySchema body) throws IOException {
        return this.verifyMobile(body, new HashMap<>());
    }

    public UserApplicationModels.VerifyEmailSuccess verifyMobile(UserApplicationModels.CodeRequestBodySchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("verifyMobile");

        Response<UserApplicationModels.VerifyEmailSuccess> response = userApplicationApiList.verifyMobile(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.HasPasswordSuccess hasPassword() throws IOException {
        return this.hasPassword(new HashMap<>());
    }

    public UserApplicationModels.HasPasswordSuccess hasPassword(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("hasPassword");

        Response<UserApplicationModels.HasPasswordSuccess> response = userApplicationApiList.hasPassword(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.VerifyEmailSuccess updatePassword(UserApplicationModels.UpdatePasswordRequestSchema body) throws IOException {
        return this.updatePassword(body, new HashMap<>());
    }

    public UserApplicationModels.VerifyEmailSuccess updatePassword(UserApplicationModels.UpdatePasswordRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("updatePassword");

        Response<UserApplicationModels.VerifyEmailSuccess> response = userApplicationApiList.updatePassword(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.OtpSuccess sendOTPOnMobile(String platform, UserApplicationModels.SendMobileOtpRequestSchema body) throws IOException {
        return this.sendOTPOnMobile(platform, body, new HashMap<>());
    }

    public UserApplicationModels.OtpSuccess sendOTPOnMobile(String platform, UserApplicationModels.SendMobileOtpRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("sendOTPOnMobile");

        Response<UserApplicationModels.OtpSuccess> response = userApplicationApiList.sendOTPOnMobile(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.OtpSuccess sendForgotOTPOnMobile(String platform, UserApplicationModels.SendMobileForgotOtpRequestSchema body) throws IOException {
        return this.sendForgotOTPOnMobile(platform, body, new HashMap<>());
    }

    public UserApplicationModels.OtpSuccess sendForgotOTPOnMobile(String platform, UserApplicationModels.SendMobileForgotOtpRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("sendForgotOTPOnMobile");

        Response<UserApplicationModels.OtpSuccess> response = userApplicationApiList.sendForgotOTPOnMobile(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.VerifyOtpSuccess verifyMobileOTP(String platform, UserApplicationModels.VerifyOtpRequestSchema body) throws IOException {
        return this.verifyMobileOTP(platform, body, new HashMap<>());
    }

    public UserApplicationModels.VerifyOtpSuccess verifyMobileOTP(String platform, UserApplicationModels.VerifyOtpRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("verifyMobileOTP");

        Response<UserApplicationModels.VerifyOtpSuccess> response = userApplicationApiList.verifyMobileOTP(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.VerifyForgotOtpSuccess verifyMobileForgotOTP(String platform, UserApplicationModels.VerifyMobileForgotOtpRequestSchema body) throws IOException {
        return this.verifyMobileForgotOTP(platform, body, new HashMap<>());
    }

    public UserApplicationModels.VerifyForgotOtpSuccess verifyMobileForgotOTP(String platform, UserApplicationModels.VerifyMobileForgotOtpRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("verifyMobileForgotOTP");

        Response<UserApplicationModels.VerifyForgotOtpSuccess> response = userApplicationApiList.verifyMobileForgotOTP(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.EmailOtpSuccess sendOTPOnEmail(String platform, UserApplicationModels.SendEmailOtpRequestSchema body) throws IOException {
        return this.sendOTPOnEmail(platform, body, new HashMap<>());
    }

    public UserApplicationModels.EmailOtpSuccess sendOTPOnEmail(String platform, UserApplicationModels.SendEmailOtpRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("sendOTPOnEmail");

        Response<UserApplicationModels.EmailOtpSuccess> response = userApplicationApiList.sendOTPOnEmail(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.EmailOtpSuccess sendForgotOTPOnEmail(String platform, UserApplicationModels.SendEmailForgotOtpRequestSchema body) throws IOException {
        return this.sendForgotOTPOnEmail(platform, body, new HashMap<>());
    }

    public UserApplicationModels.EmailOtpSuccess sendForgotOTPOnEmail(String platform, UserApplicationModels.SendEmailForgotOtpRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("sendForgotOTPOnEmail");

        Response<UserApplicationModels.EmailOtpSuccess> response = userApplicationApiList.sendForgotOTPOnEmail(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.VerifyOtpSuccess verifyEmailOTP(String platform, UserApplicationModels.VerifyEmailOtpRequestSchema body) throws IOException {
        return this.verifyEmailOTP(platform, body, new HashMap<>());
    }

    public UserApplicationModels.VerifyOtpSuccess verifyEmailOTP(String platform, UserApplicationModels.VerifyEmailOtpRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("verifyEmailOTP");

        Response<UserApplicationModels.VerifyOtpSuccess> response = userApplicationApiList.verifyEmailOTP(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.VerifyForgotOtpSuccess verifyEmailForgotOTP(String platform, UserApplicationModels.VerifyEmailForgotOtpRequestSchema body) throws IOException {
        return this.verifyEmailForgotOTP(platform, body, new HashMap<>());
    }

    public UserApplicationModels.VerifyForgotOtpSuccess verifyEmailForgotOTP(String platform, UserApplicationModels.VerifyEmailForgotOtpRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("verifyEmailForgotOTP");

        Response<UserApplicationModels.VerifyForgotOtpSuccess> response = userApplicationApiList.verifyEmailForgotOTP(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.UserObjectSchema getLoggedInUser() throws IOException {
        return this.getLoggedInUser(new HashMap<>());
    }

    public UserApplicationModels.UserObjectSchema getLoggedInUser(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getLoggedInUser");

        Response<UserApplicationModels.UserObjectSchema> response = userApplicationApiList.getLoggedInUser(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.SessionListSuccess getListOfActiveSessions() throws IOException {
        return this.getListOfActiveSessions(new HashMap<>());
    }

    public UserApplicationModels.SessionListSuccess getListOfActiveSessions(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getListOfActiveSessions");

        Response<UserApplicationModels.SessionListSuccess> response = userApplicationApiList.getListOfActiveSessions(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.PlatformSchema getPlatformConfig(String name) throws IOException {
        return this.getPlatformConfig(name, new HashMap<>());
    }

    public UserApplicationModels.PlatformSchema getPlatformConfig(String name, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getPlatformConfig");

        Response<UserApplicationModels.PlatformSchema> response = userApplicationApiList.getPlatformConfig(fullUrl, name, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.ProfileEditSuccess updateProfile(String platform, UserApplicationModels.EditProfileRequestSchema body) throws IOException {
        return this.updateProfile(platform, body, new HashMap<>());
    }

    public UserApplicationModels.ProfileEditSuccess updateProfile(String platform, UserApplicationModels.EditProfileRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("updateProfile");

        Response<UserApplicationModels.ProfileEditSuccess> response = userApplicationApiList.updateProfile(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.VerifyMobileOTPSuccess addMobileNumber(String platform, UserApplicationModels.EditMobileRequestSchema body) throws IOException {
        return this.addMobileNumber(platform, body, new HashMap<>());
    }

    public UserApplicationModels.VerifyMobileOTPSuccess addMobileNumber(String platform, UserApplicationModels.EditMobileRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("addMobileNumber");

        Response<UserApplicationModels.VerifyMobileOTPSuccess> response = userApplicationApiList.addMobileNumber(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.LoginSuccess deleteMobileNumber(String platform, Boolean active, Boolean primary, Boolean verified, String countryCode, String phone) throws IOException {
        return this.deleteMobileNumber(platform, active, primary, verified, countryCode, phone, new HashMap<>());
    }

    public UserApplicationModels.LoginSuccess deleteMobileNumber(String platform, Boolean active, Boolean primary, Boolean verified, String countryCode, String phone, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("deleteMobileNumber");

        Response<UserApplicationModels.LoginSuccess> response = userApplicationApiList.deleteMobileNumber(fullUrl, platform, active, primary, verified, countryCode, phone, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.LoginSuccess setMobileNumberAsPrimary(UserApplicationModels.SendVerificationLinkMobileRequestSchema body) throws IOException {
        return this.setMobileNumberAsPrimary(body, new HashMap<>());
    }

    public UserApplicationModels.LoginSuccess setMobileNumberAsPrimary(UserApplicationModels.SendVerificationLinkMobileRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("setMobileNumberAsPrimary");

        Response<UserApplicationModels.LoginSuccess> response = userApplicationApiList.setMobileNumberAsPrimary(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.SendMobileVerifyLinkSuccess sendVerificationLinkToMobile(String platform, UserApplicationModels.SendVerificationLinkMobileRequestSchema body) throws IOException {
        return this.sendVerificationLinkToMobile(platform, body, new HashMap<>());
    }

    public UserApplicationModels.SendMobileVerifyLinkSuccess sendVerificationLinkToMobile(String platform, UserApplicationModels.SendVerificationLinkMobileRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("sendVerificationLinkToMobile");

        Response<UserApplicationModels.SendMobileVerifyLinkSuccess> response = userApplicationApiList.sendVerificationLinkToMobile(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.VerifyEmailOTPSuccess addEmail(String platform, UserApplicationModels.EditEmailRequestSchema body) throws IOException {
        return this.addEmail(platform, body, new HashMap<>());
    }

    public UserApplicationModels.VerifyEmailOTPSuccess addEmail(String platform, UserApplicationModels.EditEmailRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("addEmail");

        Response<UserApplicationModels.VerifyEmailOTPSuccess> response = userApplicationApiList.addEmail(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.LoginSuccess deleteEmail(String platform, Boolean active, Boolean primary, Boolean verified, String email) throws IOException {
        return this.deleteEmail(platform, active, primary, verified, email, new HashMap<>());
    }

    public UserApplicationModels.LoginSuccess deleteEmail(String platform, Boolean active, Boolean primary, Boolean verified, String email, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("deleteEmail");

        Response<UserApplicationModels.LoginSuccess> response = userApplicationApiList.deleteEmail(fullUrl, platform, active, primary, verified, email, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.LoginSuccess setEmailAsPrimary(UserApplicationModels.EditEmailRequestSchema body) throws IOException {
        return this.setEmailAsPrimary(body, new HashMap<>());
    }

    public UserApplicationModels.LoginSuccess setEmailAsPrimary(UserApplicationModels.EditEmailRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("setEmailAsPrimary");

        Response<UserApplicationModels.LoginSuccess> response = userApplicationApiList.setEmailAsPrimary(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.SendEmailVerifyLinkSuccess sendVerificationLinkToEmail(String platform, UserApplicationModels.EditEmailRequestSchema body) throws IOException {
        return this.sendVerificationLinkToEmail(platform, body, new HashMap<>());
    }

    public UserApplicationModels.SendEmailVerifyLinkSuccess sendVerificationLinkToEmail(String platform, UserApplicationModels.EditEmailRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("sendVerificationLinkToEmail");

        Response<UserApplicationModels.SendEmailVerifyLinkSuccess> response = userApplicationApiList.sendVerificationLinkToEmail(fullUrl, platform, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.UserExistsResponse userExists(String q) throws IOException {
        return this.userExists(q, new HashMap<>());
    }

    public UserApplicationModels.UserExistsResponse userExists(String q, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("userExists");

        Response<UserApplicationModels.UserExistsResponse> response = userApplicationApiList.userExists(fullUrl, q, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.DeleteUserSuccess deleteUser(UserApplicationModels.DeleteApplicationUserRequestSchema body) throws IOException {
        return this.deleteUser(body, new HashMap<>());
    }

    public UserApplicationModels.DeleteUserSuccess deleteUser(UserApplicationModels.DeleteApplicationUserRequestSchema body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("deleteUser");

        Response<UserApplicationModels.DeleteUserSuccess> response = userApplicationApiList.deleteUser(fullUrl, body, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.LogoutSuccess logout() throws IOException {
        return this.logout(new HashMap<>());
    }

    public UserApplicationModels.LogoutSuccess logout(Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("logout");

        Response<UserApplicationModels.LogoutSuccess> response = userApplicationApiList.logout(fullUrl, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.UserAttributes getUserAttributes(String slug) throws IOException {
        return this.getUserAttributes(slug, new HashMap<>());
    }

    public UserApplicationModels.UserAttributes getUserAttributes(String slug, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("getUserAttributes");

        Response<UserApplicationModels.UserAttributes> response = userApplicationApiList.getUserAttributes(fullUrl, slug, requestHeaders).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }
    

    public UserApplicationModels.UserAttributes updateUserAttributes(UserApplicationModels.UpdateUserAttributesRequest body) throws IOException {
        return this.updateUserAttributes(body, new HashMap<>());
    }

    public UserApplicationModels.UserAttributes updateUserAttributes(UserApplicationModels.UpdateUserAttributesRequest body, Map<String, String> requestHeaders) throws IOException {
     
        String fullUrl = relativeUrls.get("updateUserAttributes");

        Response<UserApplicationModels.UserAttributes> response = userApplicationApiList.updateUserAttributes(fullUrl, body, requestHeaders).execute();
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