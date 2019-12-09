package com.loginradius.sdk.util;



public class ErrorResponse {

	private String Description;

	private String Message;

	private Integer ErrorCode;
	
	
	public String getDescription() {
		return Description;
	}
	
	public String setMessage(String message) {
		return message = Message;
	}
	
	public String getMessage() {
		return Message;
	}
	
	public void setDescription(String des) {
		 des = Description;
	}
	
	
	public Integer getErrorCode() {
		return ErrorCode;
	}
	
	public void setErrorCode(Integer des) {
		des = ErrorCode;
	}

	

}
