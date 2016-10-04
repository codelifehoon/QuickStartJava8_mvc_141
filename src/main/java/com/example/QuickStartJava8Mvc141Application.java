package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class QuickStartJava8Mvc141Application {

	public static void main(String[] args) {
		SpringApplication.run(QuickStartJava8Mvc141Application.class, args);
		 System.out.println(" QuickStartJava8Mvc141Application Spring Boot Started.");
	}
}
