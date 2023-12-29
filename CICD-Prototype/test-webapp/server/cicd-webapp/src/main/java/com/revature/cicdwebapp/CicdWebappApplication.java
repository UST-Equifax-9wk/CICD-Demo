package com.revature.cicdwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.revature.cicdwebapp.controller"})
public class CicdWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdWebappApplication.class, args);
	}

}
