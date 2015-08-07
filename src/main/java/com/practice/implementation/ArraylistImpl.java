package com.practice.implementation;

import java.util.Arrays;

public class ArraylistImpl {

	private Object[] arrayleist;
	private int actSize = 0;

	public ArraylistImpl() {
		arrayleist = new Object[10];
	}

	public Object get(int index) {
		if (index < actSize) {
			return arrayleist[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public void add(Object obj) {
		if (arrayleist.length - actSize <= 5) {
		
			increasesize();
		} else {
			arrayleist[actSize++] = obj;
		}
	}

	private void increasesize() {

		arrayleist = Arrays.copyOf(arrayleist, arrayleist.length * 2);
	}

	public Object delete(int index) {

		if (index < actSize) {
			Object obj = arrayleist[index];
			arrayleist[index] = null;
			int tmp = index;
			while (tmp < actSize) {
				arrayleist[tmp] = arrayleist[tmp + 1];
				arrayleist[tmp + 1] = null;
				tmp++;
			}
			actSize--;
			return obj;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public int size() {
		return actSize;
	}

	public static void main(String a[]) {
		ArraylistImpl mal = new ArraylistImpl();
		mal.add(new Integer(2));
		mal.add(new Integer(5));
		mal.add(new Integer(1));
		mal.add(new Integer(23));
		mal.add(new Integer(14));
		for (int i = 0; i < mal.size(); i++) {
			System.out.print(mal.get(i) + " ");
		}
		mal.add(new Integer(29));
		System.out.println("Element at Index 5:" + mal.get(5));
		System.out.println("List size: " + mal.size());
		System.out.println("Removing element at index 2: " + mal.delete(2));
		for (int i = 0; i < mal.size(); i++) {
			System.out.print(mal.get(i) + " ");
		}
	}
}
