package com.practice.thread;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentThread implements Runnable {

	private List<String> list = new ArrayList<String>();

	public static void main(String[] args) throws InterruptedException {
		ConcurrentThread onj = new ConcurrentThread();
		onj.list.add("Vikrant");
		onj.list.add("chirag");
		Thread t1 = new Thread(onj, "Thread1");
		//Thread t2 = new Thread(onj, "Thread2");
		t1.start();
		//t2.start();
		Thread.sleep(10);
		onj.list.remove(0);
		onj.list.remove(1);

	}

	public void run() {
		synchronized (this) {
			
			while(true){
				System.out.println(list.get(0).toString());
				System.out.println(list.get(1).toString());
			}
		}
	}
}
