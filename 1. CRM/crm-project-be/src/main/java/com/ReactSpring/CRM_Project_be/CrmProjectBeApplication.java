package com.ReactSpring.CRM_Project_be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.ReactSpring.CRM_Project_be.repository")
@EntityScan("com.ReactSpring.CRM_Project_be.model")
public class CrmProjectBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmProjectBeApplication.class, args);
	}

}
