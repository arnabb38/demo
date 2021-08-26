package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProjectApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoProjectApplication.class);

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		log.info("Starting Demo Project Application at: " + startTime);

		SpringApplication.run(DemoProjectApplication.class, args);

		long endTime = System.currentTimeMillis();

		log.info("Application Started at: " + endTime);

		long duration = (endTime - startTime) / 1000;

		log.info("Time taken to start application: " + duration + " seconds");

	}

}