package com.kh.chap05_synccontrol.model.thread;

// 공유자원
public class Data {
	private int item; // 생산 및 소비되는 아이템
	// 1 == 생산, 0 == 소비
	
	private boolean empty = true;
	// item의 상태를 저장하고, 스레드의 흐름을 제어하기 위한 변수
	
	// 아이템 소비 메서드
	public void getData() {
		// 만약 item이 생산되기 전이라면, item을 소비하지 않도록 "대기"상태로 전환
		synchronized(this) {
			if(empty) {
				try {
					wait(); // ms 미지정 시 다른 스레드가 깨우기 전가지 대기상태로 전환
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			// 아이템소비
			item = 0;
			empty = true;
			System.out.println("소비자가 아이템을 소비하였습니다.");
			
			notify(); // 생산자가 대기중인 경우 깨우는 메서드
		}
	}
	
	// 아이템 공급 메서드
	public void setData() {
		// 만약 item이 소비되기 전이라면, item을 소비할 때까지 "대기"
		synchronized (this) {
			if(empty == false) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			// 아이템생산
			item = 1;
			empty = false;
			System.out.println("생산자가 아이템을 생산했습니다.");
			
			notify(); // 소비자가 대기중인 경우 깨우는 메서드
		}
	}
}
