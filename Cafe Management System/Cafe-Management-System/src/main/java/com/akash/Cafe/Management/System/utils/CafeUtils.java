package com.akash.Cafe.Management.System.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;

public class CafeUtils {
	
	private CafeUtils() {
		
	}
	
	public static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus){
		return new ResponseEntity<String>(body: "{\"message\":\"" + responseMessage + "\"}", httpStatus);
	}
}
