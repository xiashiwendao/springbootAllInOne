package com.xueyou.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 */
@Configuration
@ComponentScan(basePackages = { "org.xueyou.demo", "com.xueyou.demo" })
public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(com.xueyou.demo.App.class);
		Person p = applicationContext.getBean(Person.class);
		p.showMyBody();

	}
}
