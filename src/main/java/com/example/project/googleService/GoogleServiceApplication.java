package com.example.project.googleService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoogleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleServiceApplication.class, args);
	}

	@RequestMapping(value = "/firstApp")

	public String firstApp(){
		return "My google service is working fine" ;
	}
}

