package com.practice.Others;

import java.util.Date;

final class Immutable {
	private final String name;
	private final int age;
	private final Date date;

	public Immutable(String name, int age, Date date) {

		this.name = name;
		this.age = age;
		this.date = date;
	}

//	public static Immutable getInstance() {
//		return new Immutable(name, age, date);
//	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Date getDate() throws CloneNotSupportedException {
		//return (Date) date.clone();
		// return new Date(date.getTime());
		// return (Date) super.clone();
		 return date;
	}

	public String toString() {
		return "name :" + name + "\n" + "age :" + age + "\n" + "date :" + date;
	}
}

public class ImmutableClassTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Immutable immutable = new Immutable("vikrant", 30, new Date());
		System.out.println(immutable.getDate());
		immutable.getDate().setDate(10);
		System.out.println(immutable.getDate());
//		Date abc=immutable.getDate();
//		abc.setTime(10);
//		System.out.println(immutable.getDate());
//		System.out.println(abc.getTime());
	}
}