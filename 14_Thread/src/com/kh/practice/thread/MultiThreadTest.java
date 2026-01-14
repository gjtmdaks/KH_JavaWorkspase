package com.kh.practice.thread;

public class MultiThreadTest {
	public static void main(String[] args) {
		Data data = new Data();
		Thread putThread = new Thread(new Provider(data));
		Thread getThread = new Thread(new Customer(data));
		
		putThread.start();
		getThread.start();
	}
}
