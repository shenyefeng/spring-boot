package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
//@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {
	static final Logger LOG = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}