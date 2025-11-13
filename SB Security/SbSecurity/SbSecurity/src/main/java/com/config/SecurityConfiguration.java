package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public UserDetailsService userDetailsService() {
        System.out.println("userDetailsService");
        List<UserDetails> users = new ArrayList<>();

//        UserDetails user1  =  User.withUsername("raj").password("raj@123").roles("USER").build();
//        UserDetails user2  =  User.withUsername("ravi").password("ravi@123").roles("USER").build();

        // default encoder password
        //UserDetails user1  =  User.withDefaultPasswordEncoder().username("admin").password("admin@123").roles("ADMIN").build();
        //UserDetails user2  =  User.withDefaultPasswordEncoder().username("ravi").password("ravi@123").roles("USER").build();


        // without encoder password pre fix password witn noop

        UserDetails user1  =  User.withUsername("raj").password("{noop}raj@123").roles("USER").build();
        UserDetails user2  =  User.withUsername("ravi").password("{noop}ravi@123").roles("USER").build();

        users.add(user1);
        users.add(user2);
        return new InMemoryUserDetailsManager(users);
    }
}
