package com.codegnan.fundamentals;

import java.util.Scanner;
public class CircleAreaCalculator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter the radius of a circle");
		double radius = scanner.nextDouble();
		double area = Math.PI * radius * radius;
		System.out.printf("Area of the circle:%.2f%n", area);
		scanner.close();
	}
}