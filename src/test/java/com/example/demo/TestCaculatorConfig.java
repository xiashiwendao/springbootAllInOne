package com.example.demo;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import com.example.demo.autoconfigandMock.BizCaculate;
import com.example.demo.autoconfigandMock.CaculateService;
import com.example.demo.autoconfigandMock.IBizCaculator;
import com.example.demo.autoconfigandMock.ICaculateService;

@TestConfiguration
public class TestCaculatorConfig {
	@Bean
	public ICaculateService iCaculateService() {
		return new CaculateService();
	}

	@Bean
	public IBizCaculator iBizCaculator() {
		return new BizCaculate();
	}
}
