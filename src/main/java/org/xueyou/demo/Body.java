package org.xueyou.demo;

import org.springframework.stereotype.Component;

@Component
public class Body {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id;

}