package com.example.demoyml.config;

import com.example.demoyml.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
   @Bean
    public TestService testService(){
       System.out.println("Add a component to IOC");
       return new TestService();
   }
}
