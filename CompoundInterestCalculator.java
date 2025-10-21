package com.codegnan.fundamentals;

import java.util.Scanner;

public class CompoundInterestCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Principal amount:");
		double principal = scanner.nextDouble();
		System.out.println("Enter Rate of Interest(%):");
		double rate = scanner.nextDouble();
		System.out.println("Enter time(in years):");
		double time = scanner.nextDouble();
		double amount = principal * Math.pow((1+rate/100),time);
		double compoundInterest = amount - principal;
		System.out.println("\n------result-----");
		System.out.printf("Compound Interest :%.2f\n", compoundInterest);
		System.out.printf("Total Amount :%.2f\n", amount);
		scanner.close();
		
		
		

	}

}
