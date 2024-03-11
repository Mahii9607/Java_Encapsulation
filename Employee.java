package com.Encapsulation;

public class Employee {

	String name;
	int employeeID;
	double salary;
	  
	
	public Employee(String name , int employeeID , double salary) {
		this.name = name;
		this.employeeID = employeeID;
		this.salary = salary;
	}

       //getter methods
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEmployeeID() {
		return employeeID;
	}

            //setter methods
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//Method to give raise to an employee
	public void giveRaise(double amount) {
		this.salary += amount;
		System.out.println(name +"'s salary has been increased by " + amount);
	}
	
	//display employee information
	public void displayInfo() {
		System.out.println("Employee Name: "+ name);
		System.out.println("Employee ID: "+ employeeID);
		System.out.println("salary $: "+ salary);
		
	}
	
}
