package com.kh.chap02_scheduling.run;

public class Run {
	public static void main(String[] args) {
		/*
		 * 스레드 스케쥴링
		 *  - 스레드의 작업 순서를 조절하는 방법
		 * 
		 * Round Robin 스케쥴링(순환할당방식)
		 *  - 각 스레드에게 시간할당량을 정하여 정해진 시간만큼만 스레드를 실행시키는 방식이고,
		 *    시간할당량은 모든 스레드에게 동일하게 주어진다.
		 *  - 만약, 스레드간에 우선순위가 부여된 경우, 우선순위가 높은 스레드가 더 많은 작업시간을
		 *    할당받는다.(우선순위 기반 스케쥴링)
		 *  - 스레드간의 우선순위가 동일한 경우 동일한 시간할당량이 주어진다.
		 *  - Round Robin은 OS가 정하는 스레드 스케쥴링방식으로, 소스코드로 제어가 불가능하다.
		 * 
		 * 우선순위 기반 스케쥴링
		 *  - 스레드마다 우선순위를 부여하는 방식
		 *  - 우선순위가 높은 스레드가 더 많은 작업시간을 할당받는다.
		 *  - 소스코드로 스레드의 우선순위를 부여할 수 있다.
		 */
		
		Thread t1 = new Thread(()->{
			// 현재 스레드의 이름
			System.out.println(Thread.currentThread().getName());
			for(int i=0; i<20; i++) {
				System.out.println("Car Driving...");
//				
//				try {
//					// 스레드를 일시정지 시키는 메서드(ms)
//					Thread.sleep(100); // 0.1초
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		});
		t1.setName("Car");
		
		Thread t2 = new Thread(()->{
			// 현재 스레드의 이름
			System.out.println(Thread.currentThread().getName());
			for(int i=0; i<20; i++) {
				System.out.println("Plane flying...");
//				
//				try {
//					// 스레드를 일시정지 시키는 메서드(ms)
//					Thread.sleep(100); // 0.1초
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		});
		t2.setName("Plane");
		
		Thread t3 = new Thread(()->{
			System.out.println(Thread.currentThread().getName());
			for(int i=0; i<20; i++) {
				System.out.println("Tank shooting...");
//				
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		});
		t3.setName("Tank");
		
		/*
		 * 우선순위 설정
		 *  - 각 스레드는 기본적으로 5의 우선순위를 가지고 있음
		 *  - 1~10사이의 정수값을 대입하여 우선순위를 변경할 수 있다.
		 */
		t1.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
//		t1.start();
//		t2.start();
//		t3.start();
		
		/*
		 * 데몬스레드
		 *  - 특정 스레드에 종속적인 스레드를 데몬스레드라고 부른다.
		 *  - 백그라운드 작업용 스레드
		 *  - 메인스레드 종료시, 데몬스레드도 함께 종료된다.
		 */
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true); // 모든 스레드를 데몬스레드로 설정해야, 설정완료.
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("메인 스레드 종료");
	}
}
