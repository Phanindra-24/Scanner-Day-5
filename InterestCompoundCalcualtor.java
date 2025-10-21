package com.codegnan.fundamentals;

import java.util.Scanner;

public class InterestCompoundCalcualtor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Principal amount:");
		double principal = scanner.nextDouble();
		System.out.println("Enter the Annual Rate of Interest(%):");
		double rate = scanner.nextDouble();
		System.out.println("Enter the time(in months):");
		int months = scanner.nextInt();
		double timeInYears = months / 12.0;
		double simpleInterest = (principal * rate * timeInYears)/100;
		double totalWithSimpleInterest = principal + simpleInterest;
		double amountWithCompoundInterest = principal * Math.pow((1 + rate/ 100), timeInYears);
		double compoundInterest = amountWithCompoundInterest - principal;
		System.out.println("\n------ Results ------");
        System.out.printf("Time in Years: %.2f years\n", timeInYears);
        System.out.printf("\nSimple Interest: %.2f\n", simpleInterest);
        System.out.printf("Total Amount (with Simple Interest): %.2f\n", totalWithSimpleInterest);
        System.out.printf("\nCompound Interest: %.2f\n", compoundInterest);
        System.out.printf("Total Amount (with Compound Interest): %.2f\n", amountWithCompoundInterest);
        scanner.close();
        
		
		
		


	}

}
