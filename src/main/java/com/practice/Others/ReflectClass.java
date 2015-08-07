package com.practice.Others;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Hashtable;

class abc{
	
}
public class ReflectClass {

	public static void main(String args[]) {
		Constructor cn[];
		Class cc[];
		Method mm[];
		Field ff[];
		Class c = null;
		Class supClass;
		String x, y, s1, s2, s3;
		Hashtable classRef = new Hashtable();
		if (args.length == 0) {
			System.out
					.println("Please specify a class name on the command line.");
			System.exit(1);
		}
		try {
			c = Class.forName(args[0]);
		} catch (ClassNotFoundException ee) {
			System.out.println("Couldn't find class '" + args[0] + "'");
			System.exit(1);
		}
	}
}
