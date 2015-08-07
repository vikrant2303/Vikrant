package com.practice.Others;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 * 
 */
public class Integer extends Thread {
	int age;
	Integer(int age){
		this.age=age;
				
	}

	public static void main(String[] args) throws Exception {

//		String a = "ab";
//		String b = "c";
//		String c = a.concat(b);
//		String d = "abc";
//		System.out.println(c.hashCode());
//		System.out.println(d.hashCode());
//		System.out.println(c==d);
//		for (int i = 0; i < 1000; i++) {
//			System.out.print("\n 1");
//			Thread obj = new Thread(new App());
//			obj.start();
//			
//			System.out.print("3");
//			
//		}
		Set obj1=new HashSet();
		Integer obj2=new Integer(15);
		Integer obj3=new Integer(15);
		obj1.add(obj2);
		obj1.add(obj3);
		System.out.println(obj1.size());
		for (Object object : obj1) {
			Integer app=(Integer)object;
			System.out.println(app.age);
		}
		Integer xyz=new Integer(10);
		xyz.start();
	
	}

	public void run() {
		System.out.print("2");
	}

	 void abc(){
		
	}
}
