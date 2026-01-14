package com.kh.chap05_synccontrol.model.thread;

// 공급자
public class Provider implements Runnable {
	private Data data;
	
	public Provider(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			data.setData();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
