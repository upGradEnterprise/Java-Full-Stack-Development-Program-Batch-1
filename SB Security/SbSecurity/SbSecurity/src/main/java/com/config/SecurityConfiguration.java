package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
        // 1st way
        //UserDetails user1  =  User.withDefaultPasswordEncoder().username("admin").password("admin@123").roles("ADMIN").build();
        //UserDetails user2  =  User.withDefaultPasswordEncoder().username("ravi").password("ravi@123").roles("USER").build();


        // without encoder password pre fix password witn noop

        // 2nd way
//        UserDetails user1  =  User.withUsername("raj").password("{noop}raj@123").roles("USER").build();
//        UserDetails user2  =  User.withUsername("ravi").password("{noop}ravi@123").roles("USER").build();

        // 3rd way

        String user1Name = "admin";
        String user1Pwd = passwordEncoder().encode("admin@123");

        String  user2Name = "raj";
        String user2Pwd = passwordEncoder().encode("raj@123");

        System.out.println("user1Name: " + user1Name+", actual password is : admin@123, hashing password "+user1Pwd);
        System.out.println("user2Name: " + user2Name+", actual password is : raj@123, hashing password "+user2Pwd);

        UserDetails user1  =  User.withUsername(user1Name).password(user1Pwd).roles("USER").build();
        UserDetails user2  =  User.withUsername(user2Name).password(user2Pwd).roles("USER").build();

        users.add(user1);
        users.add(user2);
        return new InMemoryUserDetailsManager(users);
    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        System.out.println("BCryptPasswordEncoder");
        return new BCryptPasswordEncoder();
    }

}
