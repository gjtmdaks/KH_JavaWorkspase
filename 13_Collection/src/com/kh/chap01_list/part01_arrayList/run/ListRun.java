package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class ListRun {
	/*
	 * 컬렉션(Collection)
	 *  - 자료구조가 내장되어있는 클래스로, 자바에서 제공하는 자료구조를 담당하는 프레임워크
	 * 
	 * 자료구조
	 *  - 방대한 데이터들을 효율적으로 다룰 때 필요한 개념
	 * 
	 * 프레임워크
	 *  - 효율적인 기능들이 정의되어있는 틀
	 * 
	 * 데이터들이 새롭게 추가되거나 삭제가 되거나, 수정이 되는 기능들을 이미 정의해놓은 틀이다.
	 * 
	 * 배열과 컬렉션(List)의 차이점
	 *  - 배열의 단점
	 *  1. 같은 자료형의 데이터만 저장가능
	 *  2. 배열의 크기를 수정할 수 없다.
	 *  3. 배열내부의 값들을 조작하기 불편하다.
	 * 
	 *  - 컬렉션의 장점
	 *  1. 여러 자료형의 값을 저장할 수 있다.(제네릭 설정을 통해 한가지 유형의 데이터만 저장도 가능)
	 *  2. 중간에 값을 추가하거나, 삭제하는 등 배열내부의 값들을 조작하기 위한 편리한 메서드가 정의되어 있다.
	 *  3. 크기에 대한 제약이 없다.(배열깊은복사를 알아서 해준다.)
	 * 
	 * 
	 * 컬렉션의 3가지 분류
	 * List계열
	 *  - 담고자 하는 값만을 저장
	 *  - 값 저장시 순서를 유지한다.(index 존재)
	 *  - 중복값을 담아도 상관없다.
	 *  - ArrayList, Vector, LinkedList 등이 존재
	 * 
	 * Set계열
	 *  - 담고자하는 값만 저장
	 *  - 값 저장시 순서를 유지하지 않는다.(index 없다)
	 *  - 중복값을 허용하지 않는다.
	 *  - HashSet, TreeSet
	 * 
	 * Map계열
	 *  - 담고자 하는 값(value)과 그 값을 저장하는 키(key)를 함께 저장
	 *  - 값 저장시 순서를 유지하지 않는다.(index 없다)
	 *  - key값의 중복은 허용하지 않으나, value의 중복은 허용
	 *  - HashMap, Hashtable, TreeMap, Properties
	 */
	
	public static void main(String[] args) {
		// List list = new ArrayList(); // 크기 10배열 생성
		
		/*
		 * 제네릭 ( <E> )
		 *  - 별도의 제네릭설정없이 컬렉션객체 생성시 제네릭은 Object로 설정된다.(기본값)
		 *  - 제네릭을 설정하면 설정한 타입의 값들만을 컬렉션에 담을 수 있다.
		 * 
		 * 제네릭을 설정하는 이유
		 * 1. 명시한 타입의 객체만 저장가능하도록 하여 "타입의 안정성"을 확보하기 위해서
		 * 2. 컬렉션에 저장된 객체를 꺼내서 사용할때 직접 형변환하는 작업을 없애기 위해서
		 */
		
		// 컬렉션에는 Music타입의 객체만 저장 가능.
		// 객체생성시에는 제네릭 생략가능.
		ArrayList<Music> list = new ArrayList</*Music*/>(3);
		
		// [null,null,null]?
		System.out.println(list); // [] size기준 내용 출력
		
		// 1. add(E e) : 리스트의 끝(초기화된 위치 기준)에 전달된 e를 추가시켜주는 메서드
		list.add(new Music("Tears","소찬휘"));
		list.add(new Music("와","이정현"));
		list.add(new Music("멍","김현정"));
		System.out.println(list);
		
		// 2. add(int index, E e)
		//    - 리스트에 전달되는 index값 위치에 e를 추가하는 메서드
		list.add(0, new Music("바다의 왕자","박명수"));
		// 중간에 값 추가시 알아서 기존값들을 뒤로 한칸식 땡겨주는 깊은복사가 내부적으로 발생한다.
		
		System.out.println(list);
		
		// 3. set(int index, E e)
		//    - 리스트에 해당 인덱스의 값을 전달되는 e로 변경시켜주는 메서드
		list.set(0, new Music("순정","코요테"));
		System.out.println(list);
		
		// 4. remove(int index)
		//    - 리스트에 인덱스 위치의 값을 삭제시키는 메서드
		list.remove(1); // 1번 인덱스값 삭제
		System.out.println(list);
		
		// 5. size()
		//    - 리스트에 초기화된 데이터 수를 반환하는 메서드
		System.out.println("리스트에 담긴 데이터 수 : "+list.size());
		
		// 6. get(int index) : E
		//    - 리스트에서 index위치의 값을 반환해주는 메서드
		Music m = list.get(0);
		System.out.println(m);
		
		// 만약 제네릭 설정을 안했다면?
		Music m2 = (Music) list.get(0); // 강제형변환 필요
		
		ArrayList<Integer> Iarr = new ArrayList<>(3);
		Iarr.add(1);
		Iarr.add(9);
		Iarr.add(900);
		System.out.println(Iarr);
		
		// 7. contains(E e) : boolean
		//    - 배열 내부에 해당 값이 존재하면 true
		System.out.println(Iarr.contains(9));
		
		// 8. indexOf(E e) : int
		//    - 매개인자 요소가 몇번 인덱스에 있는지 그 값을 반환(없다면 -1)
		System.out.println(Iarr.indexOf(900));
		System.out.println(Iarr.indexOf(9000));
		
		
		// List를 활용한 반복문
		System.out.println("========================================");
		
		// 1. basic Loop문
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("========================================");
		
		// 2. 향상된 반복문
		for(Music mus : list) {
			System.out.println(mus);
		}
		
		System.out.println("========================================");
		
		// 3. Iterator 반복자
		//    - 컬렉션 내부 인자를 Iterator에 담아서 관리하는 방식
		Iterator<Music> iter = list.iterator();
		while(iter.hasNext()) {
			Music m3 = iter.next(); // 이터레이터에 저장된 값을 꺼내는 함수
			System.out.println(m3);
			// iter.remove(); // list내부의 값을 삭제하는 메서드.
		}
		System.out.println(list);
		
		System.out.println("========================================");
		
		// 9. subList(int index1, int index2)
		//    - index1에서부터 index2까지 데이터를 추출한 새로운 subList를 반환하는 메서드
		List<Music> list2 = list.subList(0, 2);
		System.out.println(list2);
		
		System.out.println("========================================");

		// 10. addAll(Collection c)
		//     - 리스트에 컬렉션에 있는 데이터를 모두 추가해주는 메서드.
		list.addAll(list2);
		System.out.println(list.size());
		
		// 11. isEmpty()
		//     - 리스트가 비어있는지 체크하는 메서드(size 기준)
		System.out.println("리스트가 비어있습니까? : "+list.isEmpty());
		System.out.println(list);
		
		// 12. clear()
		//     - 리스트에 저장한 모든 값을 비워주는 메서드
		list.clear();
		System.out.println("리스트가 비어있습니까? : "+list.isEmpty());
		System.out.println(list);
	}
}
