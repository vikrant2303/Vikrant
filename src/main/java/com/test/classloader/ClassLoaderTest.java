package com.test.classloader;

import java.util.HashSet;
import java.util.Set;


public class ClassLoaderTest {
	ClassLoaderTest(){
		System.out.println("Class loaded");
	}
	public static void main(String args[]) {
		

		try {
			// printing ClassLoader of this class
			System.out.println("ClassLoaderTest.getClass().getClassLoader() : "
					+ ClassLoaderTest.class.getClassLoader());
			// trying to explicitly load this class again using Extension class
			// loader
			Class.forName("com.test.classloader.ClassLoaderTest",true,ClassLoaderTest.class.getClassLoader());
			ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();

		    
		        Class aClass = classLoader.loadClass("com.test.classloader.ClassLoaderTest");
		        System.out.println("aClass.getName() = " + aClass.getName());
		        System.out.println(aClass.hashCode());
		       Set set=new HashSet();
		       set.add(new ClassLoaderTest());
		}
		     catch (ClassNotFoundException e) {
		        e.printStackTrace();
		    }

		 
	}

}
