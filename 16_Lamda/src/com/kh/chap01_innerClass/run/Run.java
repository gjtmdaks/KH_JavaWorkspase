package com.kh.chap01_innerClass.run;

import com.kh.chap01_innerClass.part01_instance.OuterClass;
import com.kh.chap01_innerClass.part02_static.model.vo.Member;
import com.kh.chap01_innerClass.part03_local.OuterClass3;
//import com.kh.chap01_innerClass.part01_instance.OuterClass.InnerClass;

public class Run {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.method();
		
		//InnerClass ic = oc.new InnerClass();
		
		// 빌더클래스를 활용한 객체 생성
		Member m = new Member.Builder()
					.age(30)
					.name("민경민")
					.id("alsrudals")
					.build();
		/*
		 * 빌더클래스 이용시 장점
		 *  - 불필요한 생성자들이 없다.
		 *  - 필드의 순서에 상관없이 객체 생성 가능
		 *  - 명시적인 메서드명으로 가독성이 확보된다.
		 *  - VO클래스에 setter메서드가 존재하지 않음으로써 불변성 유지가 가능
		 *  - 올바른 값이 초기화 되었는지 검증이 가능
		 */
		
		OuterClass3 oc3 = new OuterClass3();
		Runnable r = oc3.getRunnable(0);
		r.run();
	}
}
