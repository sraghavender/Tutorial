package com.raghavender.java.tutorial;

public class Constructors {
	public static void main(String[] args) {
		/*
		 * Dog mydog = new Dog(); System.out.println(mydog.name);
		 */
		Dog dog = new Dog();
		System.out.println(dog.age);
		Dog dogName = new Dog("Tiger");
		System.out.println(dogName.name);
		
		Dog dogAge = new Dog(4);
		System.out.println(dogAge.age);
		
		Dog dogAgeName = new Dog(4,"Tiger");
		System.out.println("The age of the dog is"+ dogAgeName.age+"and name is"+dogAgeName.name);
		
		
	}

}
