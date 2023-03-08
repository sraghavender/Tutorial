package com.raghavender.java.tutorial;

public class EnumTutorial {
	public static void main(String[] args) {
		DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;
		
		if(day==DaysOfTheWeek.THURSDAY) {
			System.out.println("ya is almost friday!");
		}
		
		for(DaysOfTheWeek myDay : DaysOfTheWeek.values())
			System.out.println(myDay);
		
		
		System.out.println(Drinks.capachino.levelOfGoodness+" "+ Drinks.capachino.price);

	}
	}
	
