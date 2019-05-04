package com.jahadenglish.springsecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("jahad").password("english").roles("EMPLOYEE");
		auth.inMemoryAuthentication().withUser("breyonna").password("jenkins").roles("MANAGER");
		auth.inMemoryAuthentication().withUser("mason").password("basptist").roles("ADMIN");
	}	
	
}
