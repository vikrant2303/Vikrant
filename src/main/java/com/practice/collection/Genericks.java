package com.practice.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Genericks {

	public static void main(String[] args) {
		List<ArrayListTest> list = new ArrayList<ArrayListTest>();
		list.add(new ArrayListTest("v", "c", 10));
		try {
			String s="9223372036854775806";
			System.out.println(Long.valueOf(s));
		} catch (NumberFormatException e) {
			System.out.println(e.toString());
		}

		// list.add(10);
		new Genericks().test(list);
	}

	private void test(List list) {
		list.add(5);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			// System.out.println(it.next());
			Object x = it.next();
			System.out.println(x);

		}

	}
}
