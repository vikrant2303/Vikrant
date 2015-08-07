package com.practice.thread;

public class WaitandNotify extends Thread {

	public synchronized void m1() throws InterruptedException {
		//System.out.println(Thread.currentThread().getName() + " going to wait");
//		try {
		System.out.println("notifying");
		Thread.sleep(1000);
			notifyAll();
//			System.out.println(Thread.currentThread().getName()
//					+ " has woke up");
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
	}

	public static void main(String[] args) throws InterruptedException {
		WaitandNotify obj1 = new WaitandNotify();
		// WaitandNotify obj2=new WaitandNotify();
		// obj1.m1();
		Thread t1 = new Thread(obj1, "t1");
		Thread t2 = new Thread(obj1, "t2");
		Thread t3 = new Thread(obj1, "t3");
		t1.start();
		t2.start();
		t3.start();
		for(int i=0;i<25;i++){
		obj1.m1();
		}

	}

	public synchronized void run() {
		for (int i = 1; i <= 10; ++i) {
			System.out.println(Thread.currentThread().getName()+"	"+i);
			
			try {
				wait();
				
			} catch (InterruptedException e) {
			}
		}
	}
}
