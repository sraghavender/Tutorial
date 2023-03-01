
package com.raghavender;

public class TestClassMain {
	
   public static void main(String args[]) {
	   
	   TestClass test= new TestClass();
	   
	   test.setId(123);
	   test.setFirstName("Raghavender");
	   test.lastName="Suravaram";
	   
	   System.out.println(test.getId()+" "+test.getFirstName()+" "+test.lastName);
   }
		

}
