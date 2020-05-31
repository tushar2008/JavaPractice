package com.prac.test;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Sum of two numbers is = "+sum(a,b));

	}

	private static int sum(int a, int b) {
		int sum = 0;
		
		sum = a+b;
		
		return sum;
	}

}
