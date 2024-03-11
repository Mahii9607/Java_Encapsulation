package com.Encapsulation;

public class Company {

	public static void main(String[] args) {
		
		//creating employees
		Employee employee1 = new Employee("Mahesh", 1001, 60000);
	
        Employee employee2 = new Employee("Rupesh", 1002, 90000);
	 
        
        //Display employee information
	System.out.println("Employee 1 Information:");
	employee1.displayInfo();
	System.out.println();
	
	System.out.println("Employee 2 Information:");
	employee2.displayInfo();
	System.out.println();
	
	
	//giving raise to employee1
	employee1.giveRaise(8000);
	System.out.println();
	
	//giving raise to employee2
	employee2.giveRaise(15000);
	System.out.println();
	
	//Display updated information for employee1
	System.out.println("Employee 1 Information After Raise:");
	employee1.displayInfo();
	System.out.println();
	
	//Display updated information for employee2
	System.out.println("Employee 2 Information After Raise:");
	employee2.displayInfo();
	}
	
	
	
}



