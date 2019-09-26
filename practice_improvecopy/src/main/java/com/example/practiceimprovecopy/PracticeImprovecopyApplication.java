package com.example.practiceimprovecopy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PracticeImprovecopyApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeImprovecopyApplication.class, args);
    }

}
