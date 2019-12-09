/* 
 * 
 * Created by LoginRadius Development Team
   Copyright 2019 LoginRadius Inc. All rights reserved.
   
 */

package com.loginradius.sdk.models.responsemodels;
import java.util.UUID;

import com.google.gson.annotations.SerializedName;

	// <summary>
	//	Response containing Definition of Complete Token data
	// </summary>
	public class AccessToken {
	
		
		@SerializedName("access_token")
        private UUID access_token;
		
		@SerializedName("expires_in")
        private String expires_in;
		


		// <summary>
		//	Uniquely generated identifier key by LoginRadius that is activated after successful authentication.
		// </summary>
		public UUID getAccess_Token() {
			return access_token;
		}
		// <summary>
		//	Uniquely generated identifier key by LoginRadius that is activated after successful authentication.
		// </summary>
		public void setAccess_Token(UUID access_token) {
			this.access_token = access_token;
		}
		// <summary>
		//	Expiration time of Access Token
		// </summary>
		public String getExpires_In() {
			return expires_in;
		}
		// <summary>
		//	Expiration time of Access Token
		// </summary>
		public void setExpires_In(String expires_in) {
			this.expires_in = expires_in;
		}
	
    }