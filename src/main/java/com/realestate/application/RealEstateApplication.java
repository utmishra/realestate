package com.realestate.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.realestate")
@EnableAutoConfiguration
public class RealEstateApplication extends SpringBootServletInitializer {
        public static void main(String[] args) {
            SpringApplication.run(RealEstateApplication.class, args);
        }
}
