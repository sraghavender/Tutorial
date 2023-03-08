package com.raghavender.java.tutorial;

public enum Drinks {

	coffee(4,2.5), tea(6,6.0), cold_coffee(10,10.0), hot_chocolate(11,5.5), latte(8,7.5), capachino(9,2.5);

	final int levelOfGoodness;
	final double price;

	Drinks(int levelOfGoodness,double price) {

		this.levelOfGoodness = levelOfGoodness;
		this.price=price;
	}

}
