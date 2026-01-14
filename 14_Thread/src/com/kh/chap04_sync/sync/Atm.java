package com.kh.chap04_sync.sync;

import java.util.Random;

public class Atm implements Runnable {
	private Account acc;
	
	public Atm(Account acc) {
		this.acc = acc;
	}
	
	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			int money = (new Random().nextInt(3)+1)*1000; // 1~3 * 1000
			
			acc.withdraw(money);
			
			try {
				Thread.sleep(2000); // 2초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "종료");
	}
}
