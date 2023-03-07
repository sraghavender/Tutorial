package com.raghavender.java.tutorial;
import com.raghavender.Dog;

public class DogApp {
	public static void main(String[] args) {
		Dog dog = new Dog();
		boolean typeOfAnimal = dog.isColdBlooded();
		dog.setAge(9);
		dog.setColor("brown");
		dog.setBreed("Rodesianridgeback");

		dog.makeSound();
		if (typeOfAnimal) {
			System.out.println(dog.getBreed()+ " "+"is a vertribrate..."+" "+"and"+"its age and color are  "+dog.getAge()+","+dog.getColor());

		} else {

			System.out.println("Not a vertribrate...");
		}

	}
}

