package com.klu.mental_health_support_platform.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;

@Configurable
@EnableWebFluxSecurity
public class SecurityConfig extends WebSecurityConfiguration {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // For demo purposes, using in-memory authentication
        auth.inMemoryAuthentication()
            .withUser("admin").password("{noop}admin123").roles("ADMIN")
            .and()
            .withUser("student").password("{noop}student123").roles("STUDENT");
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/admin/**").hasRole("ADMIN")
            .antMatchers("/student/**").hasRole("STUDENT")
            .and()
            .formLogin();
    }
}
