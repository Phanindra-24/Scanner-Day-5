package com.codegnan.fundamentals;

import java.util.Scanner;

public class InterestCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Principal amount:");
		double principal = scanner.nextDouble();
		System.out.println("Enter the Rate of Interest");
		double rate = scanner.nextDouble();
		System.out.println("Enter time(inyears):"); 
		double time = scanner.nextDouble();
		double simpleInterest = (principal * rate * time)/100;
		double totalAmount = principal + simpleInterest;
		System.out.println("\n--- Results ---");
		System.out.printf("Simple Interest:%.2f\n",simpleInterest);
		System.out.printf("Total Amount:%.2f\n",totalAmount);
		scanner.close();
		
		
	}

}
