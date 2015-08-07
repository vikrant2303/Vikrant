package com.practice.Others;

class person{
	String name="vikrant";
	person(String nm){
		name=nm;
	}
}
class abcd{
	String id="vikrant";
	abcd(String empid){
		id=empid;
	}
}
public class Employeetest {

	public static void main(String[] args) {
		abcd e=new abcd("1234");
		System.out.println(e.id);
	}
}
