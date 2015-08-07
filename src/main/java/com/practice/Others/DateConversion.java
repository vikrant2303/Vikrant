package com.practice.Others;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversion {

	public static void main(String[] args) throws ParseException {
		String date="21/03/2014 10:45:20";
		SimpleDateFormat adf=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Date obj=adf.parse(date);
		System.out.println(obj);
		System.out.println(adf.format(obj));
		
	}
	
}
