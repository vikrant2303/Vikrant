package com.practice.collection;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationException {

	public static void main(String[] args) {
		List<String> array = new CopyOnWriteArrayList<String>();
		array.add("vikrant");
		array.add("vikrant");
		array.add("vikrant1");
		array.add("vikrant2");
		Iterator<String> iterator = array.iterator();
		array.add(1,"chiru");
//		 while(iterator.hasNext())
//		 System.out.println(iterator.next());
		 while (iterator.hasNext())
		 System.out.println(iterator.next());
		//Iterator<String> iterator1 = array.iterator();
		// while (iterator1.hasNext())
		// System.out.println(iterator1.next());
//		for (int i = 0; i < array.size(); i++)
//			System.out.println(iterator.next());

	}
}
