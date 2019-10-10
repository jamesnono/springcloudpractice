package com.example.practiceimprove;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy(proxyTargetClass=true)
@EnableDiscoveryClient
@SpringBootApplication
public class   PracticeImproveApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeImproveApplication.class, args);
    }

}
