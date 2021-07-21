package com.sfgproject.configs;

import com.sfgproject.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.sfgproject.services.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Bean
	public UserDetailsService userDetailsService() {
		
		return new UserDetailsServiceImpl();
	}
	
	@Bean 
	public BCryptPasswordEncoder passwordEncoder() {
		return new  BCryptPasswordEncoder();
		
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setPasswordEncoder(passwordEncoder());
		authProvider.setUserDetailsService(userDetailsService());
		
		return authProvider;
		
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		    .antMatchers("/").permitAll()
		    .antMatchers("/farmerregister").permitAll()
		    .antMatchers("/supplierregister").permitAll()
		    .antMatchers("/login").permitAll()
		    .antMatchers("/admin").hasRole("ADMIN")
		    .antMatchers("/farmer").hasRole("FARMER")
		    .antMatchers("/supplier").hasRole("SUPPLIER")
			.anyRequest().authenticated()
			.and()
			//.formLogin().permitAll()
			.formLogin()
				.loginPage("/login")
				.successHandler(successHandler)
				
			.and()
			.logout();
		http.exceptionHandling().accessDeniedHandler(accessDeniedHandler);
			
	}
	

	@Autowired private LoginSuccessHandler successHandler;
	@Autowired private CustomAccessDeniedHandler accessDeniedHandler;
}
