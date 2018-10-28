package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.mock.ServiceDefinedByConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=ServiceDefinedByConfig.class)
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class TestGetServiceDefinedByConfig {

	@Autowired
	public ServiceDefinedByConfig service;

	@Test
	public void test() {
		assertEquals("ServiceDefindByConfig", service.getName());
	}

}
