package com.practice.Others;

import java.util.ArrayList;
import java.util.List;

class Employee implements Cloneable {

	private String name;
	private String designation;
	protected List list = new ArrayList();

	public Employee(String desiString, String name) {
		this.designation = desiString;
		this.name = name;
		list.add(name);
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected Employee clonetest() throws CloneNotSupportedException {
		// return (Employee) super.clone();

		Employee emp = new Employee("gov", "chirag");
		return emp;
	}

}

public class CloneExample {
	public static void main(String arg[]) {
		CloneExample jwz = new CloneExample();
		jwz.test();
	}

	private void test() {
		Employee obj = new Employee("programmer", "vikrant");

		// jwz1.setName("Jamie Zawinski");
		try {
			Employee objl = (Employee) obj.clonetest();
			// System.out.println(objl.getDesignation()+"::"+objl.getName());
			System.out.println(obj.list);
			objl.list.add("Akash");
			System.out.println(objl.list);
			System.out.println(obj.list);
		} catch (CloneNotSupportedException cnse) {
			System.out.println("Cloneable should be implemented. " + cnse);
		}
	}
}