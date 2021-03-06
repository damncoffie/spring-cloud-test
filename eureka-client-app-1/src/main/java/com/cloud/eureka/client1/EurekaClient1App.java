package com.cloud.eureka.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClient1App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient1App.class, args);
    }
}
