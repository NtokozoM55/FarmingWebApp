package com.sfgproject.configs;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.sfgproject.services.TheUserDetails;

@Component
public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws ServletException, IOException {

		TheUserDetails userDetails = (TheUserDetails) authentication.getPrincipal();
		
		String redirectURL = request.getContextPath();
		
		if (userDetails.hasRole("ADMIN")) {
			redirectURL += "/admin/adminhome";
		}else if(userDetails.hasRole("FARMER")) {
			redirectURL += "/farmer/farmerhome";
		}else if(userDetails.hasRole("SUPPLIER")) {
			redirectURL += "/supplier/supplierhome";
		}
		
		response.sendRedirect(redirectURL);
	}
	
	

}
