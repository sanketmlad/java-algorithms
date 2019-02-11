package com.example.programs;

public class Fibonacci {

	public static int fibonacci(int n) {
		if (n==0 || n ==1) {
			return 1;
		}
		return (fibonacci(n-1) + fibonacci(n-2));
	}
	
	public static int factorial(int n) {
		if (n==0) return 1;
		return (n*factorial(n-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(4));
		System.out.println(factorial(4));
	}
	
}

