package com.njgcommerce.runnerz;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.info("Application started successfully!");
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			Run run = new Run(1, "Trail Run", LocalDateTime.now(), LocalDateTime.now().plusMinutes(25), 3, Location.OUTDOOR);
			log.info("Run: " + run);
		};
	}

}
