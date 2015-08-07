package Test.com.org.written.programes;

public class EvenOddNumbers implements Runnable {

	int x = 0;

	public static void main(String[] args) {
		EvenOddNumbers obj = new EvenOddNumbers();
		Thread t1 = new Thread(obj, "T1");
		Thread t2 = new Thread(obj, "T2");
		t1.start();
		t2.start();
		
		
	}

	public synchronized void run() {

		try {
			for(int i=0;i<10;i++) {
				System.out
						.println(Thread.currentThread().getName() + " : " + x);
				x++;
				notify();
				wait();
				//run();
			}
//			} else {
//				notify();
//				System.out.println("done");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
