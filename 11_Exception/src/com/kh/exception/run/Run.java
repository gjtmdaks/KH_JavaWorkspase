package com.kh.exception.run;

import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.B_CheckedException;
import com.kh.exception.controller.C_CustomException;

public class Run {
	public static void main(String[] args) throws C_CustomException {
		/*
		 * 에러(오류) 종류
		 *  - 시스템 에러
		 *     - 컴퓨터상의 오작동으로 인해 발생하는 에러
		 *     - 소스코드로 수정이 불가능.
		 *  
		 *  - 컴파일 에러
		 *     - 소스코드상의 문법적인 문제로 발생하는 에러
		 *     - 컴파일러가 빨간줄로 오류를 알려줌
		 *     - 소스코드 수정으로 문제를 해결할 수 있다.
		 *     
		 *  - 런타임 에러
		 *     - 소스코드상으로는 문제가 없는데, 프로그램 실행중에만 발생하는 에러
		 *     - 사용자가 잘못된 방식으로 사용하거나, 개발자가 충분히 예측을 하지 못한
		 *       경우 발생하는 오류
		 *     - 소스코드 수정으로 에러를 해결할 수 있다.
		 *  
		 *  - 논리  에러
		 *     - 소스코드상의 문법적인 문제도 없고, 실행시 에러도 없지만, 프로그램의
		 *       의도와 다른 결과를 반환하는 에러
		 * 
		 * 예외처리
		 *  - 위와같은 예외들이 발생했을 경우를 대비하여 처리하는 방법을 사전에 정의해두는
		 *    것을 "예외처리"라고 한다.
		 *  - 예외처리를 하지 않으면 프로그램 실행중 예외(오류)가 발생하는 경우 프로그램
		 *    이 작동 중지 한다.
		 */
		A_UncheckedException au = new A_UncheckedException();
		//au.method3();
		
		B_CheckedException bc = new B_CheckedException();
		//bc.method1();
		
		// 에러 강제 발생
		// throw new 에러클래스 생성자(에러메세지);
		throw new C_CustomException("에러 발생");
	}
}
