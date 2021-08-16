/*
 * package com.spring.crud.config;
 * 
 * import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import
 * org.springframework.security.config.annotation.web.builders.WebSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter;
 * 
 * public class JavaConfig extends WebSecurityConfigurerAdapter {
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception { http
 * .authorizeRequests() .antMatchers("/student/**").permitAll() .anyRequest()
 * .authenticated() .and() .httpBasic();
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 */