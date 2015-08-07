package com.practice.thread;


public class joinexample {
	static Thread t = new Thread(new Runnable() {
		public void run() {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	});
	static Thread t1 = new Thread(new Runnable() {
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	});

	public static void main(String[] args) throws InterruptedException {

		t.start();
		t.start();// Line 15
		t.join(); // Line 16
		t1.start();
	}
}