package com.kh.chap01_constant.run;

import java.util.Calendar;

import com.kh.chap01_constant.model.vo.Car;
import com.kh.chap01_constant.model.vo.Color;

public class Run {
	public static void main(String[] args) {
		/*
		 * 상수(Constant)
		 *  - 값이 변하지 않는 변수
		 *  - 저장하고 있는 값에 대해서 가독성과 전달력을 높이기 위해 사용한다.
		 *  - public static final키워드를 사용하여 static영역에 데이터를 저장하고 재사용한다.
		 *  - 일반적으로 상수값은 변수명을 통해 의미를 부여하고, 실제 값은 정수값을 저장하는 경우가 많다.
		 *    ex) Calender.YEAR = 1;
		 */
		Car car1 = new Car();
		
		car1.setCarColor(0); // 검은색
		car1.setCarColor(Car.BLACK);
		
		// 상수의 단점
		//  - 들어가는 값에 대한 검증기능이 없다.
		car1.setCarColor(Calendar.YEAR);
		
		// 그 외 상수의 단점
		/*
		 * - 비슷한 상수값을 하나의 변수로 관리할 수 없음
		 * EX) 다양한 어플리케이션에서 사용되는 상수값이 있을때, 이를 하나의 변수로 관리하고 싶은 경우
		 *     JAVA에서는 boolean으로 관리하는 값을, Oracle에서는 true라는 문자열로 관리한다고 할때
		 *     두 값은 하나의 묶음으로 처리해야한다.
		 * - 상수마다 고유의 메서드를 사용할 수 없다.
		 * 
		 * 상수의 단점을 보완한 코딩방식
		 *  - 값 자체에 의미를 부여, 검증기능을 추가하고,
		 *    고유한 메서드를 추가하고, 비슷한 값들을 하나로 모아서 관리
		 *  - 상수를 객체로 보관
		 */
		Car car2 = new Car();
		//car2.setColor(Calendar.YEAR); 검증기능
		car2.setColor(Color.BLACK);
	}
}
