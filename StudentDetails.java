package com.codegnan.fundamentals;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String name = scanner.nextLine();
		System.out.println("Enter the Roll Number:");
		int rollnumber = scanner.nextInt();
		System.out.println("Enter the Age:");
		int age = scanner.nextInt();
		System.out.println("Enter the Grade:");
		String grade = scanner.nextLine();
		System.out.println("\n--- Student Details ---");
		System.out.println("Name:" + name);
		System.out.println("Roll Number:" + rollnumber);
		System.out.println("Age:" + age);
		System.out.println("Grade:" + grade);
		scanner.close();
		
		
		
		
	}

}
