package com.kh.chap04_sync.sync;

// 공유자원으로 사용
// n개의 ATM(스레드)가 하나의 Account(공유자원)에서 출금메서드를 호출하는 상황을 만들 예정
public class Account {
	private int balance = 10000;
	
	public int getBalance() {
		return balance;
	}
	
//	// 출금메서드
//	public void withdraw(int money) {
//		String name = Thread.currentThread().getName();
//		System.out.println("현재 잔액 : " + balance);
//		
//		if(money <= balance) {
//			balance -= money;
//			System.out.printf
//			("[%s] %d원 출금 >>> 잔액 : %d원\n", name, money, balance);
//		}else {
//			System.out.printf
//			("[%s] %d원 출금시도하였으나 잔액이 부족합니다.\n", name, money);
//		}
//	}
	
	/*
	 * 출금메서드
	 * 
	 * 동기화 처리 방법
	 * 1. synchronized 메서드 만들기
	 *  - 메서드 전체에 대해 락을 걸고, 메서드 종료시 락이 풀린다.
	 * 
	 * 2. synchronized block 사용하기.(권장)
	 *  - 동기화가 필요한 일부 내용에만 락을 건다.
	 *  - 동기화 블럭이 끝나는 순간 락이 풀린다.
	 *  - 임계영역이 아닌 지역까지는 모든 스레드가 접근 가능하기 때문에, 메서드 전체를 임계영역으로 지정하는 것보다
	 *    효율이 좋다.
	 */
	public /* synchronized */ void withdraw(int money) {
		String name = Thread.currentThread().getName();
		
		synchronized(this) {
			System.out.println("현재 잔액 : " + balance);
			
			if(money <= balance) {
				balance -= money;
				System.out.printf
				("[%s] %d원 출금 >>> 잔액 : %d원\n", name, money, balance);
			}else {
				System.out.printf
				("[%s] %d원 출금시도하였으나 잔액이 부족합니다.\n", name, money);
			}
		}
	}
}
