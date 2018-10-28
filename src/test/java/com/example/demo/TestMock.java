package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.when;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.autoconfigandMock.BizCaculate;
import com.example.demo.autoconfigandMock.CaculateService;
import com.example.demo.autoconfigandMock.IBizCaculator;
import com.example.demo.autoconfigandMock.ICaculateService;

@RunWith(SpringRunner.class)
public class TestMock {
	@TestConfiguration
	static class TestCaculatorConfig {
		@Bean
		public ICaculateService iCaculateService() {
			return new CaculateService();
		}

		@Bean
		public IBizCaculator iBizCaculator() {
			return new BizCaculate();
		}
	}

	// 尽管这里声明为Autowired，但是其实已经被mockito接管了
	@Autowired
	ICaculateService service;

	@MockBean
	ICaculateService mockService;

	@Test
	public void test() {
		// 这里的service是mock的service，此時的result是0
		int result = service.add(5, 5);
		assertEquals(0, result); 
	}

	@Test
	public void testMock() {
		when(mockService.add(5, 5)).thenReturn(20);
		assertEquals(20, mockService.add(5, 5));
	}
}