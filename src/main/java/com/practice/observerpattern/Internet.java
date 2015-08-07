package com.practice.observerpattern;

public class Internet implements Observer {

	public void update(float interest) {
		System.out
				.println("News On internet :\n Interest rate for home has been increased New rates are :"
						+ interest);

	}

}
