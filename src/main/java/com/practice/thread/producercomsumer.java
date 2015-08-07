package com.practice.thread;

public class producercomsumer {
	int n;
	boolean valueSet = false;

	synchronized int get() {
		if (!valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		System.out.println("Got: " + n);
		valueSet = false;
		notify();
		return n;
	}

	synchronized void put(int n) {
		if (valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		this.n = n;
		valueSet = true;
		System.out.println("Put: " + n);
		notify();
	}
	public static void main(String args[]) {
		producercomsumer producercomsumer = new producercomsumer();
		new Producer(producercomsumer);
		new Consumer(producercomsumer);
		System.out.println("Press Control-C to stop.");
	}
}

class Producer implements Runnable {
	producercomsumer producercomsumer;

	Producer(producercomsumer producercomsumer) {
		this.producercomsumer = producercomsumer;
		new Thread(this, "Producer").start();
	}

	public void run() {
		int i = 0;
		while (true) {
			producercomsumer.put(i++);
		}
	}
}

class Consumer implements Runnable {
	producercomsumer producercomsumer;

	Consumer(producercomsumer producercomsumer) {
		this.producercomsumer = producercomsumer;
		new Thread(this, "Consumer").start();
	}

	public void run() {
		while (true) {
			producercomsumer.get();
		}
	}
}

