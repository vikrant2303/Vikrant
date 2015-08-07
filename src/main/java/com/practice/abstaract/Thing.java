package com.practice.abstaract;

import java.util.ArrayList;

class Thing {  
    public int value;  

    public Thing (int x) {
        value = x;
    }

   boolean equals (Thing x) {
        if (x.value == value) return true;
        return false;
    }
   public static void main(String[] args) {
	   ArrayList<Thing> basket = new ArrayList<Thing>();  
	   Thing thing = new Thing(100);  
	   basket.add(thing);  
	   Thing another = new Thing(100);  
	   System.out.println(basket.contains(another)); 
}
}
