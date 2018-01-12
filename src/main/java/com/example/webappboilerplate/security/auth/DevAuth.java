package com.example.webappboilerplate.security.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import static com.example.webappboilerplate.security.Roles.ADMIN;
import static com.example.webappboilerplate.security.Roles.USER;

@Configuration
@Profile("dev")
public class DevAuth {
    @Autowired
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("dev").password("").roles(USER, ADMIN);
    }
}
