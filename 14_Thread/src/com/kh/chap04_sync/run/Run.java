package com.kh.chap04_sync.run;

import com.kh.chap04_sync.sync.Account;
import com.kh.chap04_sync.sync.Atm;

public class Run {
	public static void main(String[] args) {
		/*
		 * 동기화
		 *  - 멀티스레드 프로그래밍에서 스레드간에 "경쟁상태"에 있는 공유자원에 대한 "접근순서
		 *    (임계영역)"을 지정해주는 것.
		 *  - 멀티스레드 프로그래밍에서 여러스레드가 동시에 하나의 자원에 접근하는 상황을 "경쟁
		 *    상태"라고 부른다. 즉, 자원을 차지하기 위해 경쟁하는 것.
		 *  - 이를 방지하기 위해 하나의 공유자원에 접근할 때는 하나의 스레드만 접근할 수 있도록
		 *    통제해야하는데, 통제하기위해 해당 자원을 "통제영역"으로 지정하고, 통제영역을 지정하는
		 *    키워드가 동기화(synchronized)이다.
		 */
		Account acc = new Account();
		
		Thread Atm1 = new Thread(new Atm(acc), "ATM 1");
		Thread Atm2 = new Thread(new Atm(acc), "ATM 2");
		
		Atm1.start();
		Atm2.start();
	}
}
