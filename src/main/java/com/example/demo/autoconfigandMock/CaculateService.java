package com.example.demo.autoconfigandMock;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example.demo"})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class CaculateService implements ICaculateService {
	@Autowired
	private IBizCaculator caculator;

	@Override
	public int add(int a, int b) {
		return this.caculator.add(a, b);
	}

	@Override
	public String getInfo(String pClass) {
		return this.caculator.getInfo(pClass);
	}
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CaculateService.class);
		ICaculateService p = applicationContext.getBean(CaculateService.class);
		System.out.println(p.add(5, 8));
	}
}