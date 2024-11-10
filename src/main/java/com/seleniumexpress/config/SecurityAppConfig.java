package com.seleniumexpress.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity(debug = true)
public class SecurityAppConfig {

	@Bean
	public InMemoryUserDetailsManager setUpUser(){
		ArrayList<GrantedAuthority> authoritiesList=new ArrayList<>();
		authoritiesList.add(new SimpleGrantedAuthority("admin"));
		authoritiesList.add(new SimpleGrantedAuthority("user"));
		
		UserDetails abhilashUser=new User("venkat","venkat",authoritiesList);
		
		InMemoryUserDetailsManager inMemoryUserDetailsManager=new InMemoryUserDetailsManager();
		inMemoryUserDetailsManager.createUser(abhilashUser);
		
		return inMemoryUserDetailsManager;
	}
	
	@Bean
	 PasswordEncoder passwordEncoder(){
		
		 return NoOpPasswordEncoder.getInstance();
	}
	
}
