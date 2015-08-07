package com.practice.observerpattern;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;

import com.practice.serialization.Employee;

public class Test {

	private int age=24;
	private String name="Foo";
	private long mobileNo=1234567890;
	private Employee employee=null;
	private enum ABC{
		HOURS,WEEK
	}
	public static void main(String[] args) {

		try {
			List list=new ArrayList();
			Test test1=new Test();
			test1.name="vik";
			test1.age=30;
			list.add(test1);
			System.out.println("list :"+list.toString());
			String x="HOURS";
			ABC obj=ABC.valueOf(x);
			System.out.println(obj);
			final Class<?> clazz=Class.forName(Test.class.getName());
			final BeanInfo beanInfo=Introspector.getBeanInfo(clazz);
		    final PropertyDescriptor[] props=beanInfo.getPropertyDescriptors();
		    for (    final PropertyDescriptor prop : props) {
		    	System.out.println(prop.getDisplayName());
		    	System.out.println(prop.getName());
		    	System.out.println(prop.getPropertyType());
		    	System.out.println(prop.getReadMethod());
		    	System.out.println(prop.getWriteMethod());
		    	System.out.println("====================================================");
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



