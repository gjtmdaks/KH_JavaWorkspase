package com.kh.chap06.method.run;

import com.kh.chap06.method.model.vo.MethodTest1;
import com.kh.chap06.method.model.vo.MethodTest2;
import com.kh.chap06.method.model.vo.OverloadTest;

public class Run {
	public static void main(String[] args) {
		MethodTest1 mt1 = new MethodTest1();
		mt1.method1(); // 일반 메서드 호출방법
		
		// static메서드 호출방법(객체생성 없이 호출)
		MethodTest2.method(0);
	}
}
