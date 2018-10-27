package com.example.demo.mock;

import org.springframework.stereotype.Service;

@Service
public class BizCaculate implements IBizCaculator {
	/* (non-Javadoc)
	 * @see com.example.mock.IBizCaculator#add(int, int)
	 */
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	/* (non-Javadoc)
	 * @see com.example.mock.IBizCaculator#getInfo(java.lang.String)
	 */
	@Override
	public String getInfo(String pClass) {
		return "";
	}
}