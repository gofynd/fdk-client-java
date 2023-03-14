package com.sdk.application.user;

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
 public class UserApplicationService { 

    private ApplicationConfig applicationConfig;

    private RetrofitServiceFactory retrofitServiceFactory;

    private UserApplicationApiList userApplicationApiList;

    private HashMap<String,String> relativeUrls  =new HashMap<String,String>();

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
            
                    relativeUrls.put("forgotPassword","/service/application/user/authentication/v1.0/login/password/reset/forgot".substring(1));
            
                    relativeUrls.put("sendResetToken","/service/application/user/authentication/v1.0/login/password/reset/token".substring(1));
            
                    relativeUrls.put("loginWithToken","/service/application/user/authentication/v1.0/login/token".substring(1));
            
                    relativeUrls.put("registerWithForm","/service/application/user/authentication/v1.0/register/form".substring(1));
            
                    relativeUrls.put("verifyEmail","/service/application/user/authentication/v1.0/verify/email".substring(1));
            
                    relativeUrls.put("verifyMobile","/service/application/user/authentication/v1.0/verify/mobile".substring(1));
            
                    relativeUrls.put("hasPassword","/service/application/user/authentication/v1.0/has-password".substring(1));
            
                    relativeUrls.put("updatePassword","/service/application/user/authentication/v1.0/password".substring(1));
            
                    relativeUrls.put("deleteUser","/service/application/user/authentication/v1.0/delete".substring(1));
            
                    relativeUrls.put("logout","/service/application/user/authentication/v1.0/logout".substring(1));
            
                    relativeUrls.put("sendOTPOnMobile","/service/application/user/authentication/v1.0/otp/mobile/send".substring(1));
            
                    relativeUrls.put("verifyMobileOTP","/service/application/user/authentication/v1.0/otp/mobile/verify".substring(1));
            
                    relativeUrls.put("sendOTPOnEmail","/service/application/user/authentication/v1.0/otp/email/send".substring(1));
            
                    relativeUrls.put("verifyEmailOTP","/service/application/user/authentication/v1.0/otp/email/verify".substring(1));
            
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

    

     
    
    
    public UserApplicationModels.AuthSuccess loginWithFacebook(String platform ,UserApplicationModels.OAuthRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("loginWithFacebook");
        

        Response<UserApplicationModels.AuthSuccess> response = userApplicationApiList.loginWithFacebook(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.AuthSuccess loginWithGoogle(String platform ,UserApplicationModels.OAuthRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("loginWithGoogle");
        

        Response<UserApplicationModels.AuthSuccess> response = userApplicationApiList.loginWithGoogle(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.AuthSuccess loginWithGoogleAndroid(String platform ,UserApplicationModels.OAuthRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("loginWithGoogleAndroid");
        

        Response<UserApplicationModels.AuthSuccess> response = userApplicationApiList.loginWithGoogleAndroid(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.AuthSuccess loginWithGoogleIOS(String platform ,UserApplicationModels.OAuthRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("loginWithGoogleIOS");
        

        Response<UserApplicationModels.AuthSuccess> response = userApplicationApiList.loginWithGoogleIOS(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.AuthSuccess loginWithAppleIOS(String platform ,UserApplicationModels.OAuthRequestAppleSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("loginWithAppleIOS");
        

        Response<UserApplicationModels.AuthSuccess> response = userApplicationApiList.loginWithAppleIOS(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.SendOtpResponse loginWithOTP(String platform ,UserApplicationModels.SendOtpRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("loginWithOTP");
        

        Response<UserApplicationModels.SendOtpResponse> response = userApplicationApiList.loginWithOTP(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.LoginSuccess loginWithEmailAndPassword(UserApplicationModels.PasswordLoginRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("loginWithEmailAndPassword");
        

        Response<UserApplicationModels.LoginSuccess> response = userApplicationApiList.loginWithEmailAndPassword(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.ResetPasswordSuccess sendResetPasswordEmail(String platform ,UserApplicationModels.SendResetPasswordEmailRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("sendResetPasswordEmail");
        

        Response<UserApplicationModels.ResetPasswordSuccess> response = userApplicationApiList.sendResetPasswordEmail(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.ResetPasswordSuccess sendResetPasswordMobile(String platform ,UserApplicationModels.SendResetPasswordMobileRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("sendResetPasswordMobile");
        

        Response<UserApplicationModels.ResetPasswordSuccess> response = userApplicationApiList.sendResetPasswordMobile(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.LoginSuccess forgotPassword(UserApplicationModels.ForgotPasswordRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("forgotPassword");
        

        Response<UserApplicationModels.LoginSuccess> response = userApplicationApiList.forgotPassword(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.ResetPasswordSuccess sendResetToken(UserApplicationModels.CodeRequestBodySchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("sendResetToken");
        

        Response<UserApplicationModels.ResetPasswordSuccess> response = userApplicationApiList.sendResetToken(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.LoginSuccess loginWithToken(UserApplicationModels.TokenRequestBodySchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("loginWithToken");
        

        Response<UserApplicationModels.LoginSuccess> response = userApplicationApiList.loginWithToken(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.RegisterFormSuccess registerWithForm(String platform ,UserApplicationModels.FormRegisterRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("registerWithForm");
        

        Response<UserApplicationModels.RegisterFormSuccess> response = userApplicationApiList.registerWithForm(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.VerifyEmailSuccess verifyEmail(UserApplicationModels.CodeRequestBodySchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyEmail");
        

        Response<UserApplicationModels.VerifyEmailSuccess> response = userApplicationApiList.verifyEmail(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.VerifyEmailSuccess verifyMobile(UserApplicationModels.CodeRequestBodySchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyMobile");
        

        Response<UserApplicationModels.VerifyEmailSuccess> response = userApplicationApiList.verifyMobile(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.HasPasswordSuccess hasPassword() throws IOException {
     
      String fullUrl = relativeUrls.get("hasPassword");
        

        Response<UserApplicationModels.HasPasswordSuccess> response = userApplicationApiList.hasPassword(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.VerifyEmailSuccess updatePassword(UserApplicationModels.UpdatePasswordRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("updatePassword");
        

        Response<UserApplicationModels.VerifyEmailSuccess> response = userApplicationApiList.updatePassword(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.DeleteUserSuccess deleteUser(UserApplicationModels.DeleteApplicationUserRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("deleteUser");
        

        Response<UserApplicationModels.DeleteUserSuccess> response = userApplicationApiList.deleteUser(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.LogoutSuccess logout() throws IOException {
     
      String fullUrl = relativeUrls.get("logout");
        

        Response<UserApplicationModels.LogoutSuccess> response = userApplicationApiList.logout(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.OtpSuccess sendOTPOnMobile(String platform ,UserApplicationModels.SendMobileOtpRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("sendOTPOnMobile");
        

        Response<UserApplicationModels.OtpSuccess> response = userApplicationApiList.sendOTPOnMobile(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.VerifyOtpSuccess verifyMobileOTP(String platform ,UserApplicationModels.VerifyOtpRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyMobileOTP");
        

        Response<UserApplicationModels.VerifyOtpSuccess> response = userApplicationApiList.verifyMobileOTP(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.EmailOtpSuccess sendOTPOnEmail(String platform ,UserApplicationModels.SendEmailOtpRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("sendOTPOnEmail");
        

        Response<UserApplicationModels.EmailOtpSuccess> response = userApplicationApiList.sendOTPOnEmail(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.VerifyOtpSuccess verifyEmailOTP(String platform ,UserApplicationModels.VerifyEmailOtpRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("verifyEmailOTP");
        

        Response<UserApplicationModels.VerifyOtpSuccess> response = userApplicationApiList.verifyEmailOTP(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.UserObjectSchema getLoggedInUser() throws IOException {
     
      String fullUrl = relativeUrls.get("getLoggedInUser");
        

        Response<UserApplicationModels.UserObjectSchema> response = userApplicationApiList.getLoggedInUser(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.SessionListSuccess getListOfActiveSessions() throws IOException {
     
      String fullUrl = relativeUrls.get("getListOfActiveSessions");
        

        Response<UserApplicationModels.SessionListSuccess> response = userApplicationApiList.getListOfActiveSessions(fullUrl ).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.PlatformSchema getPlatformConfig(String name ) throws IOException {
     
      String fullUrl = relativeUrls.get("getPlatformConfig");
        

        Response<UserApplicationModels.PlatformSchema> response = userApplicationApiList.getPlatformConfig(fullUrl  ,name).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.ProfileEditSuccess updateProfile(String platform ,UserApplicationModels.EditProfileRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("updateProfile");
        

        Response<UserApplicationModels.ProfileEditSuccess> response = userApplicationApiList.updateProfile(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.VerifyMobileOTPSuccess addMobileNumber(String platform ,UserApplicationModels.EditMobileRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("addMobileNumber");
        

        Response<UserApplicationModels.VerifyMobileOTPSuccess> response = userApplicationApiList.addMobileNumber(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.LoginSuccess deleteMobileNumber(String platform , Boolean active , Boolean primary , Boolean verified , String countryCode , String phone ) throws IOException {
     
      String fullUrl = relativeUrls.get("deleteMobileNumber");
        

        Response<UserApplicationModels.LoginSuccess> response = userApplicationApiList.deleteMobileNumber(fullUrl  ,platform, active, primary, verified, countryCode, phone).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.LoginSuccess setMobileNumberAsPrimary(UserApplicationModels.SendVerificationLinkMobileRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("setMobileNumberAsPrimary");
        

        Response<UserApplicationModels.LoginSuccess> response = userApplicationApiList.setMobileNumberAsPrimary(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.SendMobileVerifyLinkSuccess sendVerificationLinkToMobile(String platform ,UserApplicationModels.SendVerificationLinkMobileRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("sendVerificationLinkToMobile");
        

        Response<UserApplicationModels.SendMobileVerifyLinkSuccess> response = userApplicationApiList.sendVerificationLinkToMobile(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.VerifyEmailOTPSuccess addEmail(String platform ,UserApplicationModels.EditEmailRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("addEmail");
        

        Response<UserApplicationModels.VerifyEmailOTPSuccess> response = userApplicationApiList.addEmail(fullUrl  ,platform, body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.LoginSuccess deleteEmail(String platform , Boolean active , Boolean primary , Boolean verified , String email ) throws IOException {
     
      String fullUrl = relativeUrls.get("deleteEmail");
        

        Response<UserApplicationModels.LoginSuccess> response = userApplicationApiList.deleteEmail(fullUrl  ,platform, active, primary, verified, email).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.LoginSuccess setEmailAsPrimary(UserApplicationModels.EditEmailRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("setEmailAsPrimary");
        

        Response<UserApplicationModels.LoginSuccess> response = userApplicationApiList.setEmailAsPrimary(fullUrl , body).execute();
        if(!response.isSuccessful()) {
            throw new IOException(response.errorBody() != null
                    ? response.errorBody().string() : Fields.UNKNOWN_ERROR);
        }
        return response.body();
    }

    
    
    
    
    
    public UserApplicationModels.SendEmailVerifyLinkSuccess sendVerificationLinkToEmail(String platform ,UserApplicationModels.EditEmailRequestSchema body) throws IOException {
     
      String fullUrl = relativeUrls.get("sendVerificationLinkToEmail");
        

        Response<UserApplicationModels.SendEmailVerifyLinkSuccess> response = userApplicationApiList.sendVerificationLinkToEmail(fullUrl  ,platform, body).execute();
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
