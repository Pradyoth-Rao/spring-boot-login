package com.SampleLogin.simplelogin;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Resource
	private UserDetailsService userDetailService;
	

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	
    	http
		.authorizeRequests()
			.antMatchers("/", "/home").permitAll()
			.anyRequest().authenticated()
			.and()
		.formLogin()
			.loginPage("/login")
			.permitAll().defaultSuccessUrl("https://www.google.com", true)
			.and()
		.logout()
			.permitAll();
    }
    	
    	
    @Autowired
    @Override
    protected void configure(AuthenticationManagerBuilder builder) throws Exception {
//    	builder.authenticationProvider(authenticationProvider)
    	builder.userDetailsService(userDetailService);
    }
        //.csrf().disable()
       // .authorizeRequests()
        //.anyRequest().authenticated()
       // .and()
        //.formLogin()
       // .loginPage("/login").permitAll()
        //.loginProcessingUrl("/perform_login")
       // .defaultSuccessUrl("/home.html", true);
        //.failureUrl("/login.html?error=true")
//        .failureHandler(authenticationFailureHandler())
//        .and()
//        .logout()
//        .logoutUrl("/perform_logout")
//        .deleteCookies("JSESSIONID")
//        .logoutSuccessHandler(logoutSuccessHandler());
        // TODO Auto-generated method stub

//        http
//            .csrf()
//                .disable()
//            .authorizeRequests()
//                .anyRequest().authenticated()
//                .and()
//            .formLogin()
//                .loginPage("/login")
//                .permitAll();
    
    
  
}
