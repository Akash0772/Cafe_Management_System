package com.akash.Cafe.Management.System.serviceImpl;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.akash.Cafe.Management.System.constents.CafeConstants;
import com.akash.Cafe.Management.System.service.UserService;
import com.akash.Cafe.Management.System.utils.CafeUtils;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

	@Override
	public ResponseEntity<String> signUp(Map<String, String> requestMap) {
		// TODO Auto-generated method stub
		Log.info("Inside signup {}", requestMap);
		if(validateSignUpMap(requestMap)) {
			
		}else {
			return CafeUtils.getResponseEntity(CafeConstants.INVALID_DATA, HttpStatus.BAD_REQUEST);
		}
		return null;
	}
	
	private boolean validateSignUpMap(Map<String, String> requestMap) {
		if (requestMap.containsKey("name") && requestMap.containsKey("contactNumber")
		&& requestMap.containsKey("email") && requestMap.containsKey("password")) {
			return true;
		}
		return false;
	}
}
