package com.practice.Others;

public class StringComparision {

	public static void main(String[] args) {
		String name="vik";
		String name1=new String("vik");
		name1.intern();
		String name2=name1.intern();
		System.out.println(name2==name);
	}
}
