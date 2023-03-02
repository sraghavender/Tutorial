package com.raghavender;

    public class TestClass {
	private int id;
	private String firstName;
	public String lastName;
	static final String Organization = "Myorg";
	
	public int setId(int id) {
		return this.id=id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public void print(String value) {
		System.out.print(value);
		
	}
	

}
