package com.sprint.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.sprint.entities.Role;



@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	// AUTOWIRED WITH USER DETAILS SERVICE
	@Autowired
	UserDetailsService userDetailsService;

	// CONFIGURING AUTHENTICATION MANAGER BUILDER
	@Override
	public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
		authenticationManagerBuilder.inMemoryAuthentication().withUser("swapna").password("$2a$10$6CW1agMzVzBhxDzK0PcxrO/cQcmN9h8ZriVEPy.6DJbVeyATG5mWe").roles("ADMIN").and()
		.withUser("kamran").password("$2a$10$v/DDPcVo6OauPesFbJMk2.tr7nYySU8nZUYHieJSDtslbdBvQDkcS").roles("USER");
		//userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

	// CONFIGURING HTTP SECURITY
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable().authorizeRequests().antMatchers(HttpMethod.DELETE).hasRole(Role.ADMIN)
				.antMatchers(HttpMethod.POST).hasRole(Role.ADMIN)
				.antMatchers("/customer/**", "/order/**", "/planters/**", "/plant/**", "/seed/**")
				.hasAnyRole(Role.ADMIN, Role.USER).and().authorizeRequests().anyRequest().permitAll().and()
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().httpBasic();

	}

	// BCRYPT PASSWORD ENCODER
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}

