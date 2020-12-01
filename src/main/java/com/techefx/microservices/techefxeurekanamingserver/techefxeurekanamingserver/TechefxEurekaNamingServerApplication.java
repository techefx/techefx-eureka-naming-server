package com.techefx.microservices.techefxeurekanamingserver.techefxeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TechefxEurekaNamingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechefxEurekaNamingServerApplication.class, args);
    }

}
