package com.Encapsulation;

public class Age {
  
	void myAge(int age) {
		if(age > 0 && age < 110) {
			System.out.println("My age = " + age);
			
		}
		else
		{
			System.out.println("Please insert valid age..!!!");
		}
	}
	
	public static void main(String[] args) {
		 
		//Age a = new Age();
	      //a.myAge(230000);
		 
		 
		 Age a1 = new Age();
		 a1.myAge(23);
	}
}
