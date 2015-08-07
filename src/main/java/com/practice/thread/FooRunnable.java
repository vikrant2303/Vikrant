package com.practice.thread;

public class FooRunnable implements Runnable{

	static Thread two;
	public void  run()  {
		//synchronized (this) {
			
		for(int i = 1;i<=20;++i) {
	         System.out.print( "  "+Thread.currentThread().getName());
	         try {
	        	 two.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//	         if(i % 10 == 0)  System.out.println("Hahaha   "+Thread.currentThread().getName());
//	         try { wait(1000); }
//	         catch(InterruptedException e) {}
//	     }

		}
	   }

	public static void main (String [] args) throws InterruptedException {
	     FooRunnable r = new FooRunnable();
	     Thread one = new Thread(r);
	        two = new Thread(r);
	        Thread three = new Thread(r);

	        one.setName("Fred");
	        one.setPriority(10);
	        two.setName("Lucy");
	        two.setPriority(5);
	        three.setName("Ricky");
	      //  one.start();
	        two.start();
	       
//	        three.start();
	       // three.start();
	   }

}
