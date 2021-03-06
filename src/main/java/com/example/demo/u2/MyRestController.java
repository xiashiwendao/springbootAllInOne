package com.example.demo.u2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.autoconfigandMock.ICaculateService;;

@RestController
public class MyRestController {
	@Autowired
	private ICaculateService caculatorService;

	@RequestMapping("add")
	public int add() {
		return this.caculatorService.add(5, 5);
	}
}
