package com.practice.Others;



interface A{
	void test();
}
interface B{
	 void test();
}
//abstract class C{
//	abstract void  testabstract();
//	private  final void test(){
//		System.out.println("Abstract");
//	}
//	  void  testabstract1(){
//		 test();
//	 }
//}
public class TestInterface implements A,B {
         
	

	public static void main(String[] args) {
		TestInterface obj=new TestInterface();
		//obj.testabstract1();
		
		
	
	}

	public void test() {
		System.out.println("done");
		
	}
	
	

//	@Override
//	void testabstract() {
//		// TODO Auto-generated method stub
//		
//	}
}
