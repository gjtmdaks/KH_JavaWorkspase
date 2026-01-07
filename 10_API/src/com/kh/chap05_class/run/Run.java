package com.kh.chap05_class.run;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.kh.chap05_class.model.vo.Book;

public class Run {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		/*
		 * Class
		 *  - 자바의 모든 클래스와 인터페이스는 컴파일 완료된 후 class파일로 생성된다.
		 *  - Class클래스는 이 class자체의 정보를 가져올때 사용한다.
		 */
		Run r = new Run();
		r.test1();
	}
	
	public void test1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// Class클래스 객체 가져오는 방법
		// 1) Object클래스의 getClass()메서드 이용
		Book b = new Book(); // Book 우리가 만든 클래스
		Class c1 = b.getClass(); // Book클래스의 설계정보(.class파일 참조)
		
		// 2) .Class 사용
		Class c2 = Book.class;
		
		// 3) Class.forName("풀클래스명") 사용
		Class c3 = Class.forName("com.kh.chap05_class.model.vo.Book");
		
		// new키워드 없이 객체 생성하기.
		Book b1 = (Book) c3.newInstance();
		
		// 생성자 정보 가져오기
		Constructor[] cons = c3.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		// 필드정보 가져오기
		Field[] fields = c3.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
		/*
		 * Class클래스를 활용한 대표적인 프로그래밍 : reflection프로그래밍
		 * Class클래스를 이용하여 클래스의 정보를 가져오고, 생성자나 메서드를 활용하여 객체를 생성하고,
		 * 메소드를 호출하는 방식의  프로그래밍
		 * 
		 * 보통 프로그램이 실행중일때, 객체의 타입을 직접 알 수 없는 경우 Class를 통해 객체를 생성하고,
		 * 객체내부의 메타데이터를 수집하기위해 사용한다.
		 * 
		 * 이를 통해 프레임워크에서는 어노테이션을 이용한 자동화구조를 설계하였다.
		 */
	}
}
