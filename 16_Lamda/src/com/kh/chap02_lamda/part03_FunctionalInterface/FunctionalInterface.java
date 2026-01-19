package com.kh.chap02_lamda.part03_FunctionalInterface;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
	/*
	 * 함수형 인터페이스
	 *  - 람다식을 통해 구현되는 추상메서드를 가지고 있는 인터페이스로 내부에 오직 1개의
	 *    추상메서드만 가지고 있다.
	 *  - 람다식을 사용하기 위해서는 함수형 인터페이스가 필요하다.
	 * 
	 * 자바의 대표 함수형 인터페이스들
	 *   	인터페이스			|		추상메서드
	 *   ----------------------------------------
	 *   1. Runnable		|	run() : void
	 *   2. Supplier<R>		|	get() : R
	 *   
	 *   3. Consumer<T>		|	accept(T) : void
	 *   4. Function<T , R>	|	apply(T) : R
	 *   5. Predicate<T>	|	test(T) : boolean
	 *   ...
	 */
	public static void main(String[] args) {
		// 1. Runnable
		Runnable r = () -> {
			System.out.println("Runnable");
			for(int i=0; i<10; i++) {
				System.out.println(new Date());
			}
		};
		r.run();
		
		// 2. Supplier<R>
		//  - 공급역할의 함수.
		//  - 매개변수 x, 반환값 o
		Supplier<Long> supplier = () -> {
			return new Date().getTime();
		};
		System.out.println("supplier : "+supplier.get());
		
		// 3. Consumer<T>
		//  - 매개변수 o, 반환값 x
		Consumer<String> con = name -> {
			System.out.println(name);
		};
		con.accept("Consumer : 민경민");
		
		// 4. Function<T , R>
		//  - 매개변수 o, 반환형 o
		Function<String, Integer> function = str -> {
			return str.length();
		};
		System.out.println("function : " + function.apply("민경민"));
		
		// 5. Predicate<T>
		//  - 매개변수 o, 반환형 boolean
		Predicate<Integer> predicate = num -> {
			return num % 2 == 0;
		};
		System.out.println("predicate : "+predicate.test(100));
	}
}
