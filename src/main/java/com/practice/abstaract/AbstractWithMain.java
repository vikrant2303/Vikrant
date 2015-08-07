package com.practice.abstaract;

public abstract class AbstractWithMain {

	public AbstractWithMain(){
		System.out.println("construct called....");
	}
	
	public  void test1(){
		System.out.println("Object method running");
	}
	public abstract void abc();
	
}

interface t{
	public void exe();
}
class test extends AbstractWithMain implements t{

	public void exe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}
	
}