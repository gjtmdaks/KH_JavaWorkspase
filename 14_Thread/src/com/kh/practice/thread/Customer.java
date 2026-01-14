package com.kh.practice.thread;

public class Customer implements Runnable {
	private Data data;
	
	public Customer(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		int count = 0;
		while(count<10) {
			try {
				data.getValue();
				count++;
				
				Thread.sleep(100);
			} catch (EmptyException e) {
				System.out.println(e.getMessage());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
