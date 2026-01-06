package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.*;

public class PhoneController {
	private String[] result = new String[2];

	public String[] method() {
		Phone[] sArr = new Phone[2];
		sArr[0] = new GalaxyNote9();
		sArr[1] = new V40();

		for (int i = 0; i < result.length; i++) {
			// 1안 downcasting
			result[i] = ((SmartPhone)sArr[i]).printInformation();
			
			// 2안 instanceof
			if(sArr[i] instanceof GalaxyNote9) {
				result[i] = ((GalaxyNote9)sArr[i]).printInformation();
			}else if(sArr[i] instanceof V40) {
				result[i] = ((V40)sArr[i]).printInformation();
			}
		}

		return result;
	}
}
