package com.sb.jwt.springbootJwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sb.jwt.springbootJwt.Util.JWTUtility;
import com.sb.jwt.springbootJwt.model.JwtRequest;
import com.sb.jwt.springbootJwt.model.JwtResponse;
import com.sb.jwt.springbootJwt.service.UserService;

@RestController
public class SpringJwtApi {
	
	@Autowired
	public AuthenticationManager authenticationManager;
	
	@Autowired
	public JWTUtility jwtUtility;

	
	@Autowired
	public UserService userService;
	
	@GetMapping(value="/hello")
	public String sayHello() {
		return "Hello, Welcome to the world";
	}
	
	@PostMapping("/authenticate")
	public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception {
		
		try {
			
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(
							jwtRequest.getUserName(),
							jwtRequest.getPassWord()));
			
		}
		catch(BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS",e);
		}
		
		JwtResponse jwtResponse = new JwtResponse();
	    String token = jwtUtility.generateToken(userService.loadUserByUsername(jwtRequest.getUserName()));
		jwtResponse.setToken(token);
	    
		return jwtResponse;
		
		
		
	}
}



