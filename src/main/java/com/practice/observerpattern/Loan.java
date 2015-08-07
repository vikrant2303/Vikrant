package com.practice.observerpattern;

import java.util.ArrayList;

public class Loan implements Subject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String bank;
	private float intersetRate;
	private String type;
	public Loan(String bank,float intersetRate,String type){
		this.bank=bank;
		this.intersetRate=intersetRate;
		this.type=type;
	}
	public String getBank() {
		return bank;
	}
	
	public float getIntersetRate() {
		return intersetRate;
	}
	public void setIntersetRate(float intersetRate) {
		this.intersetRate = intersetRate;
		notifyObservers();
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);

	}

	public void notifyObservers() {

		System.out.println("Interest rate has been changed");
		for(Observer observer:observers){
			observer.update(intersetRate);
		}
	}

}
