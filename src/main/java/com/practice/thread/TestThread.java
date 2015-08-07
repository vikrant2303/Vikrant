package com.practice.thread;

public class TestThread extends Thread{

	private int k=2;
	public static void main(String[] args) throws Exception {
		
		new TestThread().makeitso();
	}
	TestThread(){
		k=5;
		start();
	}
	private void makeitso() throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		
		join();
		k=k-1;
		System.out.println(k);
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+" Inside run method");
		k=k*2;
	}
}
