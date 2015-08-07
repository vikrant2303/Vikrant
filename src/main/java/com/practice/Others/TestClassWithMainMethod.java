package com.practice.Others;

class parentclass{
	private String name;
	parentclass(){
		System.out.println("inside parent constructor");
	}
	parentclass(String xyz){
		this.name=xyz;
		System.out.println("inside parent peramiterized constructor :"+name);
	}
}
public class TestClassWithMainMethod extends parentclass{

	private static int x=0;
	private String name;
	TestClassWithMainMethod(){
		super("vikrant");
		System.out.println("inside child construct");
	}
//
//	TestClassWithMainMethod(String abc){
//		super();
//		name=abc;
//		System.out.println("inside child parametarized constructor value for name is :"+name);
//	}
	
	public static void main(String[] args) {
		TestClassWithMainMethod obj=new TestClassWithMainMethod();
		//TestClassWithMainMethod obj1=new TestClassWithMainMethod("vikrant");
//		TestClassWithMainMethod.m1();
//		System.out.println("came back from m1");
		
	}

	private static void m1() {
		System.out.println("Inside m1");
		if(x>1){
			return;
		}
		System.out.println("esle condition");
		
	}
}
