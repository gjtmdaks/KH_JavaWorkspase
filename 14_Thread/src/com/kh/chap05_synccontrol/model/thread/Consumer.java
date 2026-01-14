package com.kh.chap05_synccontrol.model.thread;

// 소비자
public class Consumer implements Runnable {
	private Data data;
	
	public Consumer(Data data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			data.getData();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
