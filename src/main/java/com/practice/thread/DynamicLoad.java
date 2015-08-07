package com.practice.thread;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Properties;

public class DynamicLoad implements Runnable {
	static Properties properties = null;
	static File file = new File(
			"D:/Extras/test.txt");
	static long timestamp;
	static Date date = null;
	static SimpleDateFormat sdf = null;
	

	public void reflectmethod(String abc,int a) {
		System.out.println("Your method has been load the string u passed is :"
				+ abc);
	}

	public void run() {
		Date datenew;
		SimpleDateFormat sdfnew = null;
		while (true) {
			try {
				datenew = new Date(file.lastModified());
				sdfnew = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
				if (sdf.format(date).toString()
						.equals(sdfnew.format(datenew).toString())) {
					// System.out.println(sdfnew.format(datenew).toString());
					Thread.sleep(2000);
				} else {
					Thread.sleep(2000);
					properties.load(new FileInputStream(file));
					System.out.println("New Name="
							+ properties.getProperty("name"));
					System.out.println("New city="
							+ properties.getProperty("city"));
					date = datenew;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	static {
		properties = new Properties();
		try {
			properties.load(new FileInputStream(file));
			timestamp = file.lastModified();
			sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			date = new Date(timestamp);
			// System.out.println(sdf.format(date).toString());
			System.out.println("name=" + properties.getProperty("name"));
			System.out.println("city=" + properties.getProperty("city"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		DynamicLoad obj = new DynamicLoad();
		Thread thread = new Thread(obj);
		thread.run();
	}

}

