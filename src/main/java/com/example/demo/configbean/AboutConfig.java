package com.example.demo.configbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AboutConfig {
	@Bean
	public ServiceDefinedByConfig getService() {
		return new ServiceDefinedByConfig();
	}
}
