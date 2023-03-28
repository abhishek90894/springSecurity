package com.spring.security.spirngSecurity.config;

import com.spring.security.spirngSecurity.repository.CustomUserDetailService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@Configuration
@EnableWebSecurity
public class securityConfig extends WebSecurityConfiguration {

    private CustomUserDetailService userDetailService;

    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
      auth.userDetailsService(userDetailService);
    }
}
