package com.practice.Others;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormatValidator {

	private Pattern pattern;

	private Matcher matcher;

	private static final String DATE_VALIDATION_PATTERN ="^((19|20)\\d\\d)/(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])(\\s)([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$";
															
	public DateFormatValidator() {

		pattern = Pattern.compile(DATE_VALIDATION_PATTERN);

	}

	public boolean validate(final String date) {

		matcher = pattern.matcher(date);
		if (matcher.matches()) {
			matcher.reset();
			if (matcher.find()) {
				int yy = 0;
				String mm = matcher.group(3);
				String dd = matcher.group(4);
				if (dd.equals("31")
						&& (mm.equals("4") || mm.equals("6") || mm.equals("9")
								|| mm.equals("11") || mm.equals("04")
								|| mm.equals("06") || mm.equals("09"))) {
					return false;
				} else if (mm.equals("2") || mm.equals("02")) {
					if (yy % 4 == 0) {
						if (dd.equals("30") || dd.equals("31")) {
							return false;
						} else {
							return true;
						}
					} else {
						if (dd.equals("29") || dd.equals("30")
								|| dd.equals("31")) {
							return false;
						} else {
							return true;
						}
					}
				} else {
					return true;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
