package com.practice.Others;

public class PassByValue {
	int x;
	int y;
	PassByValue(int a,int b){
		this.x=a;
		this.y=b;
	}
	public void tricky(PassByValue arg1, PassByValue arg2)
	{
	  arg1.x = 100;
	  arg1.y = 100;
	  PassByValue temp = arg1;
	  System.out.println("temp.x="+temp.x);
	  System.out.println("temp.y="+temp.y);
	  arg1 = arg2;
	  System.out.println("arg1.x="+arg1.x);
	  System.out.println("arg1.y="+arg1.y);
	  arg2 = temp;
	  System.out.println("arg2.x="+arg2.x);
	  System.out.println("arg2.y="+arg2.y);
	}
	public static void main(String [] args)
	{
		PassByValue pnt1 = new PassByValue(0,0);
		PassByValue pnt2 = new PassByValue(0,0);

	  System.out.println("X: " + pnt1.x + " Y: " +pnt1.y); 
	  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
	  System.out.println(" ");
	  pnt1.tricky(pnt1,pnt2);
	  System.out.println("X: " + pnt1.x + " Y:" + pnt1.y); 
	  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);  
	}
}
