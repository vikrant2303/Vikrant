package com.practice.Others;

import java.lang.reflect.Method;

public class MainMethod {

	public static void main(String[] args) throws ClassNotFoundException,
			Exception, IllegalAccessException {
		Class obj=Class.forName("com.practice.abstaract.AbstractWithMain");
		Class obj1=Class.forName("com.practice.Others.TestClassWithMainMethod");
		Method[] methods = obj.getDeclaredMethods();
		for (Method method : methods) {
		    System.out.println(method.getName());
		    new Integer(10).abc();
		}
	}
}
