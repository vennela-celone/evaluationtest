package com.example.tripmanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@ComponentScan(basePackages="com.example.tripmanagementservice")
public class TripmanagementserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripmanagementserviceApplication.class, args);
	}

}
