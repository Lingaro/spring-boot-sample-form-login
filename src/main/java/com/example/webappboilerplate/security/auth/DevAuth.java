package com.example.webappboilerplate.security.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static com.example.webappboilerplate.security.Roles.ADMIN;
import static com.example.webappboilerplate.security.Roles.USER;

@Configuration
//@Profile("dev")
public class DevAuth {
    @Autowired
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        auth
                .inMemoryAuthentication()
                .passwordEncoder(passwordEncoder)
                .withUser("dev").password(passwordEncoder.encode("dev")).roles(USER, ADMIN);
    }
}
