package com.practice.Others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountryForComparable implements Comparable<CountryForComparable> {
	int countryId;
	String countryName;

	public CountryForComparable(){
		
	}
	public CountryForComparable(int countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}

	public int compareTo(CountryForComparable countryForComparable) {
		return (this.countryId < countryForComparable.countryId) ? -1
				: (this.countryId > countryForComparable.countryId) ? 1 : 0;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public static void main(String[] args) {
		CountryForComparable indiaCountry = new CountryForComparable(1, "India");
		CountryForComparable chinaCountry = new CountryForComparable(4, "China");
		CountryForComparable nepalCountry = new CountryForComparable(3, "Nepal");
		CountryForComparable bhutanCountry = new CountryForComparable(2,
				"Bhutan");

		List<CountryForComparable> listOfCountries = new ArrayList<CountryForComparable>();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(chinaCountry);
		listOfCountries.add(nepalCountry);
		listOfCountries.add(bhutanCountry);

		System.out.println("Before Sort  : ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			CountryForComparable country = (CountryForComparable) listOfCountries
					.get(i);
			System.out.println("Country Id: " + country.getCountryId() + "||"
					+ "Country name: " + country.getCountryName());
		}
		Collections.sort(listOfCountries);

		System.out.println("After Sort  : ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			CountryForComparable country = (CountryForComparable) listOfCountries
					.get(i);
			System.out.println("Country Id: " + country.getCountryId() + "|| "
					+ "Country name: " + country.getCountryName());
		}
	}

}
