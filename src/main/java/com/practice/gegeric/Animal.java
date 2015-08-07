package com.practice.gegeric;

abstract class Animal {
    public abstract void checkup();
}
class Dog extends Animal {
    public void checkup() {   // implement Dog-specific code
      System.out.println("Dog checkup");
    }
}
class Cat extends Animal {
    public void checkup() {    // implement Cat-specific code
       System.out.println("Cat checkup");
    }
}
class Bird extends Animal {
	   public void checkup() {    // implement Bird-specific code
	      System.out.println("Bird checkup");
	   }
	}
class puppy extends Dog {
	   public void checkup() {    // implement Bird-specific code
	      System.out.println("Bird checkup");
	   }
	}