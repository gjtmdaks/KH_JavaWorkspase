package com.kh.operator;

import java.util.Scanner;

public class F_Triple {
	/*
	 * 삼항연산자
	 *  -3개의 항목을 가지고 연산하는 연산자
	 *  [표현법]
	 *  조건식 ? 조건이 true인 경우 결과값 : 조건이 false인 경우 결과값
	 */

	Scanner sc = new Scanner(System.in);

	public void method1() {
		System.out.print("숫자를 하나 입력하세요.");
		int num = sc.nextInt();
		
		// num의 값이 양수인지 아닌지 판단.
		boolean result = num > 0 ? true : false;
		
		System.out.println(result ? "양수입니다" : "음수입니다");
	}
	
	public void method2() {
		int num = 0;
		
		// num의 값이 양수, 음수, 0 중 무엇인지 판다
		String result = num > 0 ? "양수" : (num < 0 ? "음수" : "0");
		
		System.out.println(result);
	}
	
	public void quiz() {
        int a = 5; // a5
        int b = 10; // b10
        
        int c = (++a) + b; // a6 + b10 = c16
        int d = c / a; // c16 / a6 = d2
        int e = c % a; // c16 % a6 = e4
        
        int f = e++; // f4(e5)
        int g = (--b) +(d--); // b9 + 2(d1) = g11
        int h = 2; // h2
        
        // a=6, b=9, c=16, d=1, e5, f=4, g=11, h=2
        
        int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
        // 6(a7) + b9 / (c15 / f4) * (11(g10) - d1) % (e6 + h2)
        // = 6+9/3*10%8 = 6+3*10%8 =6+30%8 = 6+6 = i12
        
        System.out.println("a : "+a); // 7
        System.out.println("b : "+b); // 9
        System.out.println("c : "+c); // 15
        System.out.println("d : "+d); // 1
        System.out.println("e : "+e); // 6
        System.out.println("f : "+f); // 4
        System.out.println("g : "+g); // 10
        System.out.println("h : "+h); // 2
        System.out.println("i : "+i); // 12
    }
}
