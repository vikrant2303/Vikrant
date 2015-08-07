package com.practice.Others;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)

public class DateFormatValidatorTest {
	private String arg;

	private static DateFormatValidator dateFormatValidator;

	private Boolean expectedValidation;

	public DateFormatValidatorTest(String str, Boolean expectedValidation) {
		this.arg = str;
		this.expectedValidation = expectedValidation;
	}
	@BeforeClass
	public static void initialize() {

		dateFormatValidator = new DateFormatValidator();

	}

	@Parameters
	public static Collection<Object[]> data() {

		Object[][] data = new Object[][] {
				{ "11/11/11", false }, 
				{ "2013/23/12", false }, 
				{ "1-10-2013", false }, 
				{ "1-JAN-2013", false },
				{ "5/1/2013", false },
				{ "2014/2/28", false },
				{ "2014/02/29 00:00:00", false },
				{ "2014/2/29 30:20:30", false },
				{ "2014/2/29 10:70:30", false },
				{ "2014/2/12 10:20:60", false },
				{ "2014/2/29 10:20:30", false },
				{ "2014/2/31 00:59:59", false },
				{ "2014/2/12 00:59:59", true },
				{ "2014/2/28 00:59:59", true },
				{ "2014/2/28 00:00:00", true },
				{ "2014/2/28 1:59:59", true },
				{"9999/99/00 00:00:00", false},
				{"2008/08/23 24:00:00",true},
				{ "2014/04/31 00:59:59", false }};
		return Arrays.asList(data);

	}

	@Test
	
	public void test() {

		Boolean resulst = dateFormatValidator.validate(this.arg);

		String validornot = (resulst) ? "valid" : "invalid";

		System.out.println("Date Format " + arg + " is " + validornot);

		assertEquals( this.expectedValidation, resulst);

	}

}
