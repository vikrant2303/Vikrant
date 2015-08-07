package com.practice.Others;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException implements Cloneable {

	List<String> list = new ArrayList<String>();

	public void test() {
		for (int i = 0; i < 10; i++) {
			list.add("a" + i);
		}
		Iterator it = list.iterator();
		//while (it.hasNext()) {
//			String x=(String)it.next();
//			System.out.println(x);
//			it.next();
//			it.remove();
			//list.remove(it.next());
//			if (x.equals("a5")) {
//				System.out.println("yes :"+x);
//				it.remove();				
//			}
		//}
//		System.out.println("size :"+list.size());
	}

	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	public void iteration(Iterator it){
		while (it.hasNext()) {
			 this.list.remove(it.next());
		 }
		System.out.println("Size :"+list.size());
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		ConcurrentModificationException obj = new ConcurrentModificationException();
		obj.test();
		 ConcurrentModificationException obj1 = new
		 ConcurrentModificationException();
		 obj1=(ConcurrentModificationException)obj.clone();
		 Iterator it = obj1.list.iterator();
		 obj1.iteration(it);
	}
}
