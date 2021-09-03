package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProjectApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoProjectApplication.class);

	public static void main(String[] args) {

		log.info("Starting Demo Project Application");

		SpringApplication.run(DemoProjectApplication.class, args);

		log.info("Demo Application Stopped!");

	}

}