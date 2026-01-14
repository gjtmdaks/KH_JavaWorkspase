package com.kh.chap03_control.run;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Run r = new Run();
		r.test2();
	}
	
	public void test1() {
		/*
		 * 스레드 컨트롤 메서드
		 *  - 작업중인(Runnable) 스레드를 일시정지(TimeWating)상태로 변경하는 메서드
		 *  1) Thread.sleep(ms)
		 *   - 지정된 시간동안 스레드를 일시정지상태로 변환하는 메서드
		 *   - 지정된 시간이 지나면, 다시 실행대기(Runnable)상태로 변경된다.
		 *  
		 *  2) wait()
		 *   - 동기화된 블럭안에서만 사용되며, 지정된 시간이 지나거나 다른 스레드가 호출하기
		 *     전까지 대기시키는 메서드.
		 *  
		 *  3) join(ms)
		 *   - 지정된 시간동안 다른 스레드를 실행시키고, 현재 스레드는 대기시키는 메서드.
		 *   - 지정된 시간이 지나거나, 다른 스레드의 작업이 종료되면 다시 Runnable상태로 변경
		 *  
		 *  4) IO Block
		 *   - 입출력메서드에 의해 일시정지된 상태로, 입출력 완료시 다시 Runnable상태로 변경
		 */
		
		// 0.05초 일시정지하는 스레드
		Thread a = new Thread(()->{
			for(int i=0; i<100; i++) {
				System.out.print("-");
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		// 0.03초간 일시정지하는 스레드
		Thread b = new Thread(()->{
			for(int i=0; i<100; i++) {
				System.out.print("|");
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		a.start();
		b.start();
	}
	
	public void test2() {
		/*
		 * 스레드 컨트롤 메서드
		 *  - 일시정지(TimeWaiting)상태인 스레드를 다시 Runnable상태로 변경하는 메서드
		 *  1) notify() / notifyAll()
		 *   - 동기화된 블럭안에서만 사용하며, 대기중인 스레드를 깨우는(Runnable) 메서드
		 *  2) interrupt()
		 *   - sleep이나, join에 의해 일시정지된 메서드를 깨우는 역할의 메서드로,
		 *     InterruptedException을 강제로 발생시킨다.
		 */
		Thread cnt = new Thread(()->{
			for(int i=100; i>0; i--) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					break;
				}
			}
		});
		cnt.start();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("종료하시려면 exit를 입력해주세요.");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				cnt.interrupt();
				break;
			}
		}
	}
}
