package com.example.Cricbuzz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity  
public class ApplicationSecurityConfig {
	@Bean
	protected InMemoryUserDetailsManager configAuthentication() {
		List<UserDetails> list=new ArrayList<>();
		UserDetails admin= new User("names", GrantedAuthority);
		list.add(admin);
		return new InMemoryUserDetailsManager(list);
	}
	@Bean
	protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		//declares which Page(URL) will have What access type
		http.authorizeHttpRequests()
		.requestMatchers("/home").permitAll()
		
		return http.build();
	}
}
