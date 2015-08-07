package com.practice.observerpattern;

public class Newspaper implements Observer{

	public void update(float interest) {
		System.out
		.println("News in Newpapers :\n Interest rate for home has been increased New rates are :"
				+ interest);

		
	}

	
}
