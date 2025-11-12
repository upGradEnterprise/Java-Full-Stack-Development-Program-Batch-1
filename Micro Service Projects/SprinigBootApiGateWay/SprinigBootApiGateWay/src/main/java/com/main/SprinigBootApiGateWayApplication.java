package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class SprinigBootApiGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinigBootApiGateWayApplication.class, args);
        System.out.println("Api Gateway running on port number 8080");
	}

    @Bean
    public RouteLocator getRouteLocator(RouteLocatorBuilder builder) {
    System.out.println("Request Send to API Gateway");
    //return builder.routes().build();
        return builder
                .routes().

                // Generic rules for all get, post, put and delete method

                //route(r->r.path("/account/**").and().method("GET","POST","PUT","DELETE").uri("http://localhost:8282")).
                //route(r->r.path("/gpay/**").and().method("GET","POST","PUT","DELETE").uri("http://localhost:8383")).

                        // specific method and specific path

//                        route(r->r.path("/account/findBalanceUsingAccNo/**").and().method("GET").uri("http://localhost:8282")).
//                route(r->r.path("/account/create/**").and().method("POST").uri("http://localhost:8282")).

                route(r->r.path("/account/**").and().method("GET","POST","PUT","DELETE").
                filters(f->f.addRequestParameter("msg","Welcome to API Gateway ")).
        uri("http://localhost:8282")).
                route(r->r.path("/gpay/**").and().method("GET","POST","PUT","DELETE").uri("http://localhost:8383")).

                build();
    }
}
