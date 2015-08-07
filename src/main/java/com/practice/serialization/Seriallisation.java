package com.practice.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Seriallisation {
	File filename = new File(
			"D:/personal/personal/Projects/Others/src/main/java/com/practice/serialization/SerialisationFile.txt");

	public static void main(String[] args) {
		Employee e =Employee.getInstance();
		e.setId(1);
		e.setName("Test");
		e.setSalary(100);
		Seriallisation obj = new Seriallisation();
		obj.serialize(e);
		e.setName("Gill");
		Employee employee=obj.deserialise();
		System.out.println(employee.getName());
	}

	public void serialize(Employee e) {
		
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {

			fos = new FileOutputStream(filename);
			out = new ObjectOutputStream(fos);
			out.writeObject(e);
			out.close();
			System.out.println("Done");
		}

		catch (Exception exp) {
			exp.printStackTrace();
		}
	}

	public Employee deserialise() {
		Employee obj=null;
		try {
			FileInputStream  fis = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(fis);
			obj=(Employee)in.readObject();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
}
