package com.graymatter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EmployeeConfiguration {
	
	@Bean
	RestTemplate getRestTemlate() {
		return new RestTemplate();
	}

}
