package com.practice.Others;

public class LazySingleton {

	private static volatile LazySingleton instance = null;

	private LazySingleton() {

	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			synchronized (LazySingleton.class) {
				instance = new LazySingleton();
			}
		}
		return instance;
	}
	
}
