package com.kh.practice.lambda;

public class LamdaPractice2 {
	public static void main(String[] args) {
		Calculator<Integer> adder = (x,y) -> x*y;
		Calculator<Integer> findMax = Math::max;
		Calculator<String> combiner = (x,y) -> x+"-"+y;
		
		System.out.println(adder.operate(10, 20));
		System.out.println(findMax.operate(10, 20));
		System.out.println(combiner.operate("hello", "world"));
	}
	
	@FunctionalInterface
	interface Calculator<V>{
		V operate(V v1, V v2);
	}
}
