package com.practice.thread;

public class OddEven {
	public static OddEven obj;

	Thread t = new Thread(new Runnable() {
		public void run() {
			synchronized (obj) {

				for (int i = 0; i < 10; i++) {
					
					try {
						t.wait(100);
						i++;
						notify();
					} catch (Exception e) {
						System.out.println(i);
					}
				}
			}
		}
	});
	Thread t1 = new Thread(new Runnable() {
		public void run() {
			synchronized (obj) {

				for (int i = 1; i < 10; i++) {
					
					try {
						t1.wait(100);
						i++;
						notify();
					} catch (Exception e) {
						System.out.println(i);
					}
				}
			}
		}
	});

	public void startmethod() {
		t.start();
		t1.start();
	}

	public static void main(String[] args) throws InterruptedException {
		obj=new OddEven();
		obj.startmethod();
	}
}
