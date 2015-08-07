package com.practice.collection;

import java.util.*;

//class Another {
//	private String name;
//	private String address;
//	private String profassion;
//	public Another(String name, String address, String profassion) {
//		this.name = name;
//		this.address = address;
//		this.profassion = profassion;
//	}
//}
public class ArrayListTest implements Comparable<ArrayListTest>,Comparator<ArrayListTest>{

	private String name;
	private String address;
	private int age;

	ArrayListTest(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	ArrayListTest(){}
	public static void main(String[] args) {
		ArrayListTest obj1=new ArrayListTest("vikrant", "Meerut", 20);
		ArrayListTest obj2=new ArrayListTest("chiru", "Allahabd", 21);
		ArrayListTest obj3=new ArrayListTest("dival", "Lucknow", 22);
		List<ArrayListTest> list=new ArrayList<ArrayListTest>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		Set set=new HashSet();
		set.add(new ArrayListTest());
		Collections.sort(list);
		System.out.println("Before :"+list);
		Collections.sort(list,new ArrayListTest());
		System.out.println("After :"+list);
	
	}

	public int compareTo(ArrayListTest obj) {
		
		return this.name.compareTo(obj.name);
	}
	public String toString() {
		return name+" , "+address+" , "+age+"\n";
	}

	public int compare(ArrayListTest o1, ArrayListTest o2) {
		
		//return o1.age-o2.age;
		return o2.name.compareTo(o1.name);
	}
}
