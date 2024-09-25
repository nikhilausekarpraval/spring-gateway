package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//            .route("spring-application", r -> r.path("/spring-gateway")
//                .and().method("GET")
//                .uri("http://localhost:8080/employee/get")) 
//            .route("mydotnetcoreapp", r -> r.path("/core-gateway")
//            	.and().method("GET")
//                .uri("http://localhost:9091/employee/")) 
//            .route("spring-application",r -> r.path("/spring-gateway")
//                    .and().method("POST")
//                    .uri("http://localhost:8080/employee/register"))
//            .route("mydotnetcoreapp",r -> r.path("/core-gateway")
//                    .and().method("POST")
//                    .uri("http://localhost:9091/employee/"))
//            .route("spring-application",r -> r.path("/spring-gateway")
//                    .and().method("PUT")
//                    .uri("http://localhost:8080/employee/update"))
//            .route("mydotnetcoreapp",r -> r.path("/core-gateway")
//                    .and().method("PUT")
//                    .uri("http://localhost:9091/employee/"))
//            .build();
//
//    }
}
