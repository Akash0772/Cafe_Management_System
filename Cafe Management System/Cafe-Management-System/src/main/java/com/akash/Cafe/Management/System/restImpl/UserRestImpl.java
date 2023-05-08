package com.akash.Cafe.Management.System.restImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.RestController;

import com.akash.Cafe.Management.System.constents.CafeConstants;
import com.akash.Cafe.Management.System.rest.UserRest;
import com.akash.Cafe.Management.System.service.UserService;
import com.akash.Cafe.Management.System.utils.CafeUtils;

@RestController
public class UserRestImpl implements UserRest {

	@Autowired
	UserService userService;
	
	@Override
	public ResponseEntity<String> signUp(Map<String, String> requestMap) {
		// TODO Auto-generated method stub
		try {
			return userService.signUp(requestMap);
		} catch(Exception ex){
			ex.printStackTrace();
		}
		return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
