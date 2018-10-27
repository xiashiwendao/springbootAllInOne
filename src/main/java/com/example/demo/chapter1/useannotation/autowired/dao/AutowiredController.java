package com.example.demo.chapter1.useannotation.autowired.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 1. 控制层 2. 3. 1.控制层使用@RestController注解标注，返回json格式的字符串 4. 2.获取业务层返回的数据，输出到客户端
 * 5. 3.请求：http:localhost:8080/autowiredController 6.
 */
@RestController
public class AutowiredController {
	@Autowired
	private IService service;

	@RequestMapping("/autowiredController")
	public String get() {
		return service.get();
	}
}
