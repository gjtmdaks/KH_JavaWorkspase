package com.kh.chap03_stream_part02_methods;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMethods {
	public static void main(String[] args) {
		/*
		 * 스트림의 중간연산 및 최종연산 메서드들
		 * 
		 * 중간연산 메서드
		 * 1) distinct : 중복값 제거
		 * 2) filter : 내부요소 필터링
		 * 3) map : 데이터 변환
		 * 4) peek : 중간 확인 메서드
		 * 5) sort : 정렬 메서드
		 * ...
		 * 
		 * 최종연산 메서드
		 * 1) Iterating계열 : forEach
		 * 2) Collectiong 계열 : collect(Collectior.메서드)
		 *    -> 스트림 내부 요소를 내가 원하는 계열의 컬렉션으로 반환
		 * 3) Calculating 계열 : min, max, sum, average 등
		 *    -> 산술연산 관련된 최동 처리 메서드들(기본자료형스트림에만 존재)
		 * 4) Matching : anyMatch, alllMatch, noneMatch...
		 *    -> 스트림 내부 요소에서 특정 조건을 만족하는 요소를 선책하기 위해 사용
		 * 5) Reduction 계열 : reduce메서드를 통해 요소 내부의 값을 다양한
		 *    방법으로 연산 후 결과값을 반환하는 메서드.
		 *    Calculating계열에서 제공하지 않는 연산기능을 수행할 때 사용한다.
		 */
		
		// 중간처리 메서드(distinct, filter, forEach)
		// 1) distinct, filter, forEach
		List<Integer> list = Arrays.asList(5,1,2,3,2,4,3,2,1,2,4,5);
		
		Stream<Integer> stream = list.stream();
		
		stream
			.distinct()
			.filter(i -> i%2==1)
			.forEach(System.out::println);
		
		String[] names = {"강감찬","강원래","홍길동","강형욱","초난강"};
		Arrays
			.stream(names)
			.filter(name -> name.startsWith("강"))
			.forEach(System.out::println);
		
		// 2) map : 현재 스트림요소를 다른 요소로 바꾸는 메서드
		List<Integer> list2 = Arrays.asList(1,2,3,4,5); // [1,2,3,4,5]
		
		list2.stream() // Stream<Integer>
			.map((i) -> i+"!") // Stream<String> -> 값, 자료형 모두 변환
			.forEach(System.out::println);
		
		// 3) mapTo(Int/Double/Long) : Stream을 기본자료형스트림으로 변경해주는 메서드
		Arrays.stream(names)
			.mapToInt(name -> name.length()) // IntStream
			.forEach(System.out::println);
		
		// 4) Collect계열 메서드
		// 4-1) Collectors.toList() : 스트림의 데이터를 List로 변환하는 메서드
		List<Integer> newList = list2.stream()
			.map(i -> i*100)
			.collect(Collectors.toList());
		System.out.println(newList);
		
		// 4-2) Collectors.toSet() : 스트림의 데이터를 Set으로 변환
		List<Integer> list4 = Arrays.asList(1,1,2,2,3,3,4,4,5,5,6);
		Set set = list4.stream()
			.collect(Collectors.toSet());
		System.out.println(set);
		
		// 4-3) Collectors.toMap(Function, Function) : 스트림의 결과를 Map으로
		Map<Integer, String> result2 = 
				list4.stream()
					.distinct()
					.collect(Collectors.toMap(i -> i, i -> "#" + i + "#"));
		System.out.println(result2);
		
		// 5) Calculating 계열
		//    - 산술연산 시 사용하는 메서드들로 기본자료형 스트림에 존재
		// 5-1) sum()
		int sum = IntStream.rangeClosed(1, 100).sum();
		System.out.println(sum);
		
		// 5-2) average()
		double avg = DoubleStream
						.iterate(1, i -> i+1)
						.limit(100)
						.average() // 반환형이 Optional
						.getAsDouble();
		System.out.println(avg);
		
		// 5-3) SummaryStatistics : 스트림 요소의 통계값을 가진 객체를 반환해주는 메서드
		//    통계갑 -> 총 개수, 합, 평균, 최소, 최대
		IntSummaryStatistics summaty = 
				IntStream.of(32,50,80,77,100,28,12)
				.summaryStatistics();
		System.out.println(summaty);
		
		// 6) Reduction 계열
		//   reduce(초기값, 초기값을 처리하는 람다식)
		int result3 = Arrays
			.asList(1,2,3,4,5,6,7,8,9,10)
			.stream()
			// 첫번째 매개변수 : 초기값을 저장하는 변수
			// 두번째 매개변수 : 스트림 내부 요소
			.reduce(0, (sum2, n) -> {
				System.out.println("sum2 : "+sum2);
				System.out.println("n = "+n);
				return sum2 + n;
			});
		System.out.println(result3);
		
		int result4 = Arrays
					.asList(1,2,30,4,15,67,7,8,9,10)
					.stream()
					.reduce(0, (max, n) ->{
						return max < n ? n : max;
					});
		System.out.println(result4);
		
		
		class Member{
			String name;
			int age;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public Member(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}
			@Override
			public String toString() {
				return "Member [name=" + name + ", age=" + age + "]";
			}
			
		}
		
		List<Member> arr = Arrays.asList(
				new Member("홍길동", 35),
				new Member("신사임당", 40),
				new Member("세종", 45),
				new Member("홍난파", 80),				
				new Member("전달력", 69)
		);
		// Member객체배열에서 최고령자 구하기.
		Member maxAgePerson = 
				arr.stream()
					// 초기값 생략시, 스트림의 첫번째 요소가 초기값으로 설정
					.reduce((m1, m2)->{
						return m1.age < m2.age ? m2 : m1;
					}).get();
					// 초기값을 생햑하는 경우, 반환형이 Optional
		System.out.println(maxAgePerson);
		
		// Member객체배열 arr에서 모든 회원의 나이의 합 구하기.
		int ageSum = 
				arr.stream()
					.map(m -> m.age)
					.reduce(0, (sum3, age)->{
						return sum3+age;
					});
		System.out.println(ageSum);
		
		// 7) Match 계열
		// 7-1) anyMatch
		//       - 스트림의 요소들 중 하나라도 true가 나오면 true
		boolean bool = 
				Arrays
					.asList("1","b2","c","d4","5")
					.stream()
					.anyMatch(str -> str.startsWith("b"));
		System.out.println(bool);
		
		// 7-2) noneMatch : 스트림의 요소 모두가 false면 true를 반환
		bool = Arrays
					.asList("홍길동","123","가나다")
					.stream()
					.noneMatch(s -> s.length()>4);
		System.out.println(bool);
		
		// 7-3) allMatch : 스트림의 모든 요소가 true인 경우 true
		bool = Arrays
					.asList("홍길동","123","가나다")
					.stream()
					.allMatch(s -> s.length()<=3);
		System.out.println(bool);
		
		// 7-4) findFirst : 스트림 요소중 조건을 만족하는 첫번째 요소를 찾은 후 반환
		String str = Arrays
						.asList("홍길동","111","11111","1가나다")
						.stream()
						.filter(s -> s.startsWith("1"))
						.findFirst()
						.get();
		System.out.println(str);
		
		// 7-5) findAny : 스트림 요소가 하나라도 존재한다면 해당 요소를 즉시 반환
		str = Arrays
				.asList("홍길동2","123","11111")
				.stream()
				.filter(s -> s.length()<=4)
				.findAny()
				.get();
		System.out.println(str);
	}
}
