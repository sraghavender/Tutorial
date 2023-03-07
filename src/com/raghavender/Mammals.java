package com.raghavender;

public class Mammals implements Animal,AnimalType {
	
	public boolean coldBlooded= false;
	
	public boolean isColdBlooded() {
		return coldBlooded;
	}

	public void setColdBlooded(boolean coldBlooded) {
		this.coldBlooded = coldBlooded;
	}

	public void makeSound() {
		System.out.println("Make sound...");

	}

	public void sleep() {
		System.out.println("Sleeping..");

	}

	public void eat() {
		System.out.println("Eating...");
	}

}