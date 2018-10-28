package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.autoconfigandMock.BizCaculate;
import com.example.demo.autoconfigandMock.CaculateService;
import com.example.demo.autoconfigandMock.IBizCaculator;
import com.example.demo.autoconfigandMock.ICaculateService;

@RunWith(SpringRunner.class)
public class TestTestConfigAndTestBean {
	@Autowired
	ICaculateService service;

	@Test
	public void test() {
		assertEquals(10, service.add(5, 5));
	}
}
