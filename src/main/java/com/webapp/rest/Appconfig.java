package com.webapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class Appconfig extends WebSecurityConfigurerAdapter {
	
	


		
	
		@Autowired
		private UserDetailsService userDetailsService;
		
		@Bean
		public AuthenticationPrincipal authProvider()
		{
			DaoAuthenticationProvider provider =new DaoAuthenticationProvider();
			provider.setUserDetailsService(userDetailsService);
			provider.setPasswordEncoder(new BCryptPasswordEncoder());
			return authProvider();
		}


}
