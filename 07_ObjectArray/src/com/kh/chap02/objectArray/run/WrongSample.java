package com.kh.chap02.objectArray.run;

import com.kh.chap02.objectArray.model.vo.Phone;

public class WrongSample {
	public static void main(String[] args) {
		Phone[] arr = new Phone[3]; // [null,null,null]
		
		// 잘못된 점
		// 1. i의 범위가 잘못되었다. <=를 <로 변경하면 해결
		// 2. arr배열에 객체가 초기화되지 않음. arr[i]=null -> null.getName()=null X, error O
		//     - 변수가 null을 가지고 있는 상태에서 주소값이 있을때만 수행가능한 어떤
		// 		 행위를 수행하는 경우 NullPointerException(NPE)가 발생한다.
		for(int i=0; i<=arr.length; i++) {
			System.out.println(arr[i].getName());
		}
	}
}
