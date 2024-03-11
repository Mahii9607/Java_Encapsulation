package com.Encapsulation;

import java.util.Scanner;

public class GradeCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the Exam Score");
	        int score = scanner.nextInt();
	        
	        
	        if (score >= 90) {
	            System.out.println("The grade is A.");
	        } else if (score >= 80 && score <= 89) {
	            System.out.println("The grade is B.");
	        } else if (score >= 70 && score <= 79) {
	            System.out.println("The grade is C.");
	        } else if (score >= 60 && score <= 69) {
	            System.out.println("The grade is D.");
	        } else {
	            System.out.println("The grade is F.");
	        }

	        scanner.close();
	    }
	}
