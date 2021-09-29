package com.example.demo;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableDistributedTransaction
public class Client2Application {

    public static void main(String[] args) {
        SpringApplication.run(Client2Application.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
