package com.graymatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Day32Application {

	public static void main(String[] args) {
		SpringApplication.run(Day32Application.class, args);
	}

}
