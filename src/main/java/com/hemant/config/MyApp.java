package com.hemant.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages="com.hemant")
@EnableAutoConfiguration
@SpringBootApplication
public class MyApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
	}
	
}
