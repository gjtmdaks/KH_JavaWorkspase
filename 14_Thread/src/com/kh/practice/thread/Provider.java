package com.kh.practice.thread;

import java.util.Random;

public class Provider implements Runnable {
	private Data data;
	
	public Provider(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				int random = new Random().nextInt(100)+1;
				data.setValue(random);
				
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
