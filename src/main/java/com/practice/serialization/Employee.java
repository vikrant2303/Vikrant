package com.practice.serialization;

import java.io.Serializable;

import com.practice.Others.Casting;

public class Employee extends Casting implements Serializable {
	static Employee e = new Employee();
	private static final long serialVersionUID = -6470090944414208496L;
	private Casting cast;
	//private int xyz=3;
	private String name;
	private int id;
	transient private int salary;

	// private String password;
	private Employee(){
		
	}
	public static Employee getInstance(){
		return e;
	}
	@Override
	public String toString() {
		return "Employee{name=" + name + ",id=" + id + ",salary=" + salary
				+ "}";
	}

	// getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// public String getPassword() {
	// return password;
	// }
	//
	// public void setPassword(String password) {
	// this.password = password;
	// }
	public Object readResolve()  
    {  
        System.out.println("Executing readResolve");  
        return e;
    }  
}
