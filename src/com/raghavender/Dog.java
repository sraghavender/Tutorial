package com.raghavender;

public class Dog extends Mammals {
	private	String Breed;
	private String Color;
	private int Age;
	
	public Dog() {
		super.coldBlooded= true;
	}

	public String getBreed() {
		return Breed;
	}

	public void setBreed(String breed) {
		Breed = breed;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	

	@Override
	public void makeSound() {
		System.out.println("The dog is barking..");
	}
	
	

}
