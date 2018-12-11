package com.benleadbeater.database.hello.mySpringDatabaseBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GarageSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarageSpringBootApplication.class, args);
	}
}
