package com.pluralsight.conferencedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConferenceDemoApplication {

	public static void main(String[] args) {
		System.out.println("Starting application....");
		SpringApplication.run(ConferenceDemoApplication.class, args);
	}

}
