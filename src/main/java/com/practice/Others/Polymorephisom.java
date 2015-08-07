package com.practice.Others;

class Asuper {
	protected static long m1() {
		System.out.println("Super class m1");
		return 0;
	}


}

public class Polymorephisom extends Asuper{

	public static long m1() {
		System.out.println("base class m1");
		return 1;
	}

	@SuppressWarnings("finally")
	public int m2(){
		try{
			return 1;
		}
		catch(Exception e){
			return 2;
		}
		finally{
			return 3;
		}
	}
	public static void main(String[] args) {
		Polymorephisom obj=new Polymorephisom();
		obj.m1();
		System.out.println(obj.m2());
		//Polymorephisom.m1();
	}
}
