package com.raghavender.java.tutorial;

public class Lambdas {
	public static void main(String[] args) {
	    Cat myCat = new Cat(); // creating a cat object
	 	myCat.print("Hello"); // print method of the object
	    PrintThing(myCat); //passing interface object as a parameter
	    /*  This is Lambdas expression. The below statement is equal to
	     *  print method in cat object implementing  interface Printable. 
	     */
		Printable LambdasPrintable = (s) -> System.out.println("Meow");  
		PrintThing(LambdasPrintable); 
		PrintThing(
			(s) -> System.out.println("Meow"+"from Lambdas expression"));
		
		
	}
	

 static void PrintThing(Printable thing) {
	  String s ="Hello world";                          //passing interface name to the method. 
	 thing.print(s); }
 }

	


	
