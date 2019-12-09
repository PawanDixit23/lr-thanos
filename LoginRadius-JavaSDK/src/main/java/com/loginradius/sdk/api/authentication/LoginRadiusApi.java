/* 
 * 
 * Created by LoginRadius Development Team
   Copyright 2019 LoginRadius Inc. All rights reserved.
*/

package com.loginradius.sdk.api.authentication;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.loginradius.sdk.helper.JsonDeserializer;
import com.loginradius.sdk.helper.LoginRadiusRequest;
import com.loginradius.sdk.helper.LoginRadiusValidator;
import com.loginradius.sdk.models.requestmodels.UserRegistrationModel;
import com.loginradius.sdk.models.responsemodels.AccessToken;
import com.loginradius.sdk.models.responsemodels.ExistResponse;
import com.loginradius.sdk.models.responsemodels.PostResponse;
import com.loginradius.sdk.models.responsemodels.UserProfile;
import com.loginradius.sdk.util.AsyncHandler;
import com.loginradius.sdk.util.ErrorResponse;
import com.loginradius.sdk.util.LoginRadiusSDK;


public class LoginRadiusApi {
   private static Gson gson =new Gson();

   public LoginRadiusApi(){
      if (!LoginRadiusSDK.validate()){
         throw new LoginRadiusSDK.InitializeException();
      }
   }
   
   
   // <summary>
   // This API retrieves a copy of the user data based on the Email
   // </summary>
     
		
		
   public void authenticateUser(String email,String password, String emailTemplate,
       String verificationUrl, final AsyncHandler<AccessToken> handler) {

      if (email == null) {
        throw new IllegalArgumentException(LoginRadiusValidator.getValidationMessage("email"));
      }
      
      if (password == null) {
          throw new IllegalArgumentException(LoginRadiusValidator.getValidationMessage("password"));
        }
			
      Map<String, String> queryParameters = new HashMap<String, String>();
      queryParameters.put("apiKey", LoginRadiusSDK.getApiKey());

      if (!LoginRadiusValidator.isNullOrWhiteSpace(emailTemplate)) {
        queryParameters.put("emailTemplate", emailTemplate);
      }


      if (!LoginRadiusValidator.isNullOrWhiteSpace(verificationUrl)) {
        queryParameters.put("verificationUrl", verificationUrl);
      }
      
      JsonObject bodyParameters = new JsonObject();
      bodyParameters.addProperty("email", email);
      bodyParameters.addProperty("password", password);

      String resourcePath = "/v1/login";
            
      LoginRadiusRequest.execute("POST", resourcePath, queryParameters, gson.toJson(bodyParameters), new AsyncHandler<String>() {
			
        @Override
        public void onSuccess(String response) {
          TypeToken<AccessToken> typeToken = new TypeToken<AccessToken>() {};
          AccessToken successResponse = JsonDeserializer.deserializeJson(response,typeToken);
          handler.onSuccess(successResponse);
        }

        @Override
        public void onFailure(ErrorResponse errorResponse) {
          handler.onFailure(errorResponse);
        }
      });
   }

   
   // <summary>
   // This API creates a user in the database as well as sends a verification email to the user.
   // </summary>
       
		
		
   public void userRegistrationByEmail(UserRegistrationModel authUserRegistrationModel,
      String emailTemplate, String verificationUrl, final AsyncHandler<UserProfile> handler) {

      if (authUserRegistrationModel == null) {
        throw new IllegalArgumentException(LoginRadiusValidator.getValidationMessage("authUserRegistrationModel"));
      }      

			
      Map<String, String> queryParameters = new HashMap<String, String>();
      queryParameters.put("apiKey", LoginRadiusSDK.getApiKey());

      if (!LoginRadiusValidator.isNullOrWhiteSpace(emailTemplate)) {
        queryParameters.put("emailTemplate", emailTemplate);
      }


      if (!LoginRadiusValidator.isNullOrWhiteSpace(verificationUrl)) {
        queryParameters.put("verificationUrl", verificationUrl);
      }


      String resourcePath = "/v1/register";
            
      LoginRadiusRequest.execute("POST", resourcePath, queryParameters, gson.toJson(authUserRegistrationModel), new AsyncHandler<String>() {
			
        @Override
        public void onSuccess(String response) {
          TypeToken<UserProfile> typeToken = new TypeToken<UserProfile>() {};
          UserProfile successResponse = JsonDeserializer.deserializeJson(response,typeToken);
          handler.onSuccess(successResponse);
        }

        @Override
        public void onFailure(ErrorResponse errorResponse) {
          handler.onFailure(errorResponse);
        }
      });
   }
   
   
   
   
   // <summary>
   // This API is used to check the email exists or not on your site.
   // </summary>
   	    
		
		
   public void checkEmailAvailability(String email, final AsyncHandler<ExistResponse> handler) {      

      if (LoginRadiusValidator.isNullOrWhiteSpace(email)) {
        throw new IllegalArgumentException(LoginRadiusValidator.getValidationMessage("email"));
      }
			
      Map<String, String> queryParameters = new HashMap<String, String>();
      queryParameters.put("apiKey", LoginRadiusSDK.getApiKey());
      
      JsonObject bodyParameters = new JsonObject();
      bodyParameters.addProperty("email", email);

      String resourcePath = "/v1/email/check";
            
      LoginRadiusRequest.execute("POST", resourcePath, queryParameters, gson.toJson(bodyParameters), new AsyncHandler<String>() {
			
        @Override
        public void onSuccess(String response) {
          TypeToken<ExistResponse> typeToken = new TypeToken<ExistResponse>() {};
          ExistResponse successResponse = JsonDeserializer.deserializeJson(response,typeToken);
          handler.onSuccess(successResponse);
        }

        @Override
        public void onFailure(ErrorResponse errorResponse) {
          handler.onFailure(errorResponse);
        }
      });
   }
   
   
   // <summary>
   // This API is used to send the reset password url to a specified account. Note: If you have the UserName workflow enabled, you may replace the 'email' parameter with 'username'
   // </summary>
  	    
		
		
   public void forgotPassword(String email, String resetPasswordUrl,
      String emailTemplate, final AsyncHandler<PostResponse> handler) {      

      if (LoginRadiusValidator.isNullOrWhiteSpace(email)) {
        throw new IllegalArgumentException(LoginRadiusValidator.getValidationMessage("email"));
      }      

      if (LoginRadiusValidator.isNullOrWhiteSpace(resetPasswordUrl)) {
        throw new IllegalArgumentException(LoginRadiusValidator.getValidationMessage("resetPasswordUrl"));
      }
			
      Map<String, String> queryParameters = new HashMap<String, String>();
      queryParameters.put("apiKey", LoginRadiusSDK.getApiKey());
      queryParameters.put("resetPasswordUrl", resetPasswordUrl);

      if (!LoginRadiusValidator.isNullOrWhiteSpace(emailTemplate)) {
        queryParameters.put("emailTemplate", emailTemplate);
      }

      JsonObject bodyParameters = new JsonObject();
      bodyParameters.addProperty("email", email);

      String resourcePath = "/v1/password/forgot";
            
      LoginRadiusRequest.execute("POST", resourcePath, queryParameters, gson.toJson(bodyParameters), new AsyncHandler<String>() {
			
        @Override
        public void onSuccess(String response) {
          TypeToken<PostResponse> typeToken = new TypeToken<PostResponse>() {};
          PostResponse successResponse = JsonDeserializer.deserializeJson(response,typeToken);
          handler.onSuccess(successResponse);
        }

        @Override
        public void onFailure(ErrorResponse errorResponse) {
          handler.onFailure(errorResponse);
        }
      });
   }
   
   
   
   // <summary>
   // This API retrieves a copy of the user data based on the access_token.
   // </summary>
       
		
		
   public void getProfileByAccessToken(String accessToken, String fields, final AsyncHandler<UserProfile> handler) {      

      if (LoginRadiusValidator.isNullOrWhiteSpace(accessToken)) {
        throw new IllegalArgumentException(LoginRadiusValidator.getValidationMessage("accessToken"));
      }
			
      Map<String, String> queryParameters = new HashMap<String, String>();
      queryParameters.put("access_token", accessToken);
      queryParameters.put("apiKey", LoginRadiusSDK.getApiKey());

      if (!LoginRadiusValidator.isNullOrWhiteSpace(fields)) {
        queryParameters.put("fields", fields);
      }

      String resourcePath = "/v1/profile";
            
      LoginRadiusRequest.execute("GET", resourcePath, queryParameters, null, new AsyncHandler<String>() {
			
        @Override
        public void onSuccess(String response) {
          TypeToken<UserProfile> typeToken = new TypeToken<UserProfile>() {};
          UserProfile successResponse = JsonDeserializer.deserializeJson(response,typeToken);
          handler.onSuccess(successResponse);
        }

        @Override
        public void onFailure(ErrorResponse errorResponse) {
          handler.onFailure(errorResponse);
        }
      });
   }
   
   
   // <summary>
   // This API is used to verify the email of user. Note: This API will only return the full profile if you have 'Enable auto login after email verification' set in your LoginRadius Admin Console's Email Workflow settings under 'Verification Email'.
   // </summary>
      
		
		
   public void verifyEmail(String verificationToken, final AsyncHandler<PostResponse> handler) {      

      if (LoginRadiusValidator.isNullOrWhiteSpace(verificationToken)) {
        throw new IllegalArgumentException(LoginRadiusValidator.getValidationMessage("verificationToken"));
      }
			
      Map<String, String> queryParameters = new HashMap<String, String>();
      queryParameters.put("apiKey", LoginRadiusSDK.getApiKey());
     

      JsonObject bodyParameters = new JsonObject();
      bodyParameters.addProperty("verificationToken", verificationToken);

      String resourcePath = "/v1/email/verify";
            
      LoginRadiusRequest.execute("PUT", resourcePath, queryParameters, gson.toJson(bodyParameters), new AsyncHandler<String>() {
			
        @Override
        public void onSuccess(String response) {
          TypeToken<PostResponse> typeToken = new TypeToken<PostResponse>() {};
          PostResponse successResponse = JsonDeserializer.deserializeJson(response,typeToken);
          handler.onSuccess(successResponse);
        }

        @Override
        public void onFailure(ErrorResponse errorResponse) {
          handler.onFailure(errorResponse);
        }
      });
   }
   
   
   // <summary>
   // This API resends the verification email to the user.
   // </summary>
      
		
		
   public void resendEmailVerification(String email, final AsyncHandler<PostResponse> handler) {      

      if (LoginRadiusValidator.isNullOrWhiteSpace(email)) {
        throw new IllegalArgumentException(LoginRadiusValidator.getValidationMessage("email"));
      }
			
      Map<String, String> queryParameters = new HashMap<String, String>();
      queryParameters.put("apiKey", LoginRadiusSDK.getApiKey());

      

      JsonObject bodyParameters = new JsonObject();
      bodyParameters.addProperty("email", email);

      String resourcePath = "/v1/email/resendverify";
            
      LoginRadiusRequest.execute("PUT", resourcePath, queryParameters, gson.toJson(bodyParameters), new AsyncHandler<String>() {
			
        @Override
        public void onSuccess(String response) {
          TypeToken<PostResponse> typeToken = new TypeToken<PostResponse>() {};
          PostResponse successResponse = JsonDeserializer.deserializeJson(response,typeToken);
          handler.onSuccess(successResponse);
        }

        @Override
        public void onFailure(ErrorResponse errorResponse) {
          handler.onFailure(errorResponse);
        }
      });
   }
   
   // <summary>
   // This API is used to set a new password for the specified account.
   // </summary>
   	    
		
		
   public void resetPasswordByResetToken(String resetToken,String password,String resetPasswordEmailTemplate, final AsyncHandler<PostResponse> handler) {

      if (resetToken == null) {
        throw new IllegalArgumentException(LoginRadiusValidator.getValidationMessage("resetToken"));
      }
      
      if (password == null) {
          throw new IllegalArgumentException(LoginRadiusValidator.getValidationMessage("password"));
      }
			
      Map<String, String> queryParameters = new HashMap<String, String>();
      queryParameters.put("apiKey", LoginRadiusSDK.getApiKey());
      if (!LoginRadiusValidator.isNullOrWhiteSpace(resetPasswordEmailTemplate)) {
          queryParameters.put("resetPasswordEmailTemplate", resetPasswordEmailTemplate);
        }
      
      JsonObject bodyParameters = new JsonObject();
      bodyParameters.addProperty("resetToken", resetToken);
      bodyParameters.addProperty("password", password);

      String resourcePath = "/v1/password/reset";
            
      LoginRadiusRequest.execute("PUT", resourcePath, queryParameters, gson.toJson(bodyParameters), new AsyncHandler<String>() {
			
        @Override
        public void onSuccess(String response) {
          TypeToken<PostResponse> typeToken = new TypeToken<PostResponse>() {};
          PostResponse successResponse = JsonDeserializer.deserializeJson(response,typeToken);
          handler.onSuccess(successResponse);
        }

        @Override
        public void onFailure(ErrorResponse errorResponse) {
          handler.onFailure(errorResponse);
        }
      });
   }
   
   
    // <summary>
   // This API is used to change the accounts password based on the previous password
   // </summary>
       
		
		
   public void changePassword(String accessToken, String newPassword,
      String oldPassword, final AsyncHandler<PostResponse> handler) {      

      if (LoginRadiusValidator.isNullOrWhiteSpace(accessToken)) {
        throw new IllegalArgumentException(LoginRadiusValidator.getValidationMessage("accessToken"));
      }      

      if (LoginRadiusValidator.isNullOrWhiteSpace(newPassword)) {
        throw new IllegalArgumentException(LoginRadiusValidator.getValidationMessage("newPassword"));
      }      

      if (LoginRadiusValidator.isNullOrWhiteSpace(oldPassword)) {
        throw new IllegalArgumentException(LoginRadiusValidator.getValidationMessage("oldPassword"));
      }
			
      Map<String, String> queryParameters = new HashMap<String, String>();
      queryParameters.put("access_token", accessToken);
      queryParameters.put("apiKey", LoginRadiusSDK.getApiKey());

      JsonObject bodyParameters = new JsonObject();
      bodyParameters.addProperty("newPassword", newPassword);
      bodyParameters.addProperty("oldPassword", oldPassword);

      String resourcePath = "/v1/password/change";
            
      LoginRadiusRequest.execute("PUT", resourcePath, queryParameters, gson.toJson(bodyParameters), new AsyncHandler<String>() {
			
        @Override
        public void onSuccess(String response) {
          TypeToken<PostResponse> typeToken = new TypeToken<PostResponse>() {};
          PostResponse successResponse = JsonDeserializer.deserializeJson(response,typeToken);
          handler.onSuccess(successResponse);
        }

        @Override
        public void onFailure(ErrorResponse errorResponse) {
          handler.onFailure(errorResponse);
        }
      });
   }
   
   
   
   // <summary>
   // This API is used to update the user's profile by passing the access_token.
   // </summary>
   

	public void updateProfileByAccessToken(String accessToken, JsonObject payload,
			final AsyncHandler<UserProfile> handler) {

		if (LoginRadiusValidator.isNullOrWhiteSpace(accessToken)) {
			throw new IllegalArgumentException(LoginRadiusValidator.getValidationMessage("accessToken"));
		}

		if (payload == null) {
			throw new IllegalArgumentException(LoginRadiusValidator.getValidationMessage("payload"));
		}

		Map<String, String> queryParameters = new HashMap<String, String>();
		queryParameters.put("access_token", accessToken);
		queryParameters.put("apiKey", LoginRadiusSDK.getApiKey());


		String resourcePath = "/v1/profile";

		LoginRadiusRequest.execute("PUT", resourcePath, queryParameters, gson.toJson(payload),
				new AsyncHandler<String>() {

					@Override
					public void onSuccess(String response) {
						TypeToken<UserProfile> typeToken = new TypeToken<UserProfile>() {
						};
						UserProfile successResponse = JsonDeserializer.deserializeJson(response,typeToken);
						handler.onSuccess(successResponse);
					}

					@Override
					public void onFailure(ErrorResponse errorResponse) {
						handler.onFailure(errorResponse);
					}
				});
	}
   
}
