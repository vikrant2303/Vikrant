package com.practice.abstaract;

class testAbstract{
	testAbstract(){
		System.out.println("Super");
	}
	testAbstract(int x){
		System.out.println("Super with x :"+x);
	}
}
public class AbstractWithConstructor extends testAbstract{
	AbstractWithConstructor(int a){
		super(a);
		System.out.println("base");
	}
	
	public static void main(String[] args) {
		new AbstractWithConstructor(10);
	}

}
