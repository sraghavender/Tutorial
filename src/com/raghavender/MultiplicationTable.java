package com.raghavender;

class MultiplicationTable {

	public static void printTable() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}

		}

	}

	public static void main(String[] args) {
		System.out.println("Print tables from 1 to 10..");
		printTable();

	}

}
