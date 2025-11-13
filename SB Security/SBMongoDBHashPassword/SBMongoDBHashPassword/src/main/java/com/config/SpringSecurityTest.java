package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurityTest {

    @Bean
    public SecurityFilterChain createObject(HttpSecurity http) throws Exception {
        return
                http.csrf(csrf -> csrf.disable()).
                        authorizeHttpRequests(httpRequest -> {
                    httpRequest.requestMatchers("/login/**").permitAll();
                        }
                ).build();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
