package Test.com.org;

public class ThreadTest extends Thread{

	public static void main(String[] args) {
		
//		ThreadTest obj=new ThreadTest();
//		obj.start();
		try{
		//boolean test=true;
		assert 2<2:"Throw Error" ;
		
		}
		catch(AssertionError e){
			
			System.out.println(e.getMessage());
		}
		System.out.println("Did not throw exception");
	}
	
	@Override
	public void run(){
		this.m1();
		this.m2();
		this.m3();
}

	private  void m1() {
		System.out.println("Start time for m1 is : "+System.currentTimeMillis());
		for(int i=0;i<100;i++){
			System.out.println("m1");
		}
		System.out.println("End time for m1 is : "+System.currentTimeMillis());
	}
	private  void m2() {
		System.out.println("Start time for m2 is : "+System.currentTimeMillis());
		for(int i=0;i<100;i++){
			System.out.println("m2");
		}
		System.out.println("End time for m2 is : "+System.currentTimeMillis());
	}
	private  void m3() {
		System.out.println("Start time for m3 is : "+System.currentTimeMillis());
		for(int i=0;i<100;i++){
			System.out.println("m3");
		}
		System.out.println("End time for m3 is : "+System.currentTimeMillis());
	}
}