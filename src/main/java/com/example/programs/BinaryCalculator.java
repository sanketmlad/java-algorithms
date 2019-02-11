package com.example.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class BinaryCalculator {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer> ();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		Stack<Integer> stack = new Stack<Integer> ();
		String firstValue = "10";
		String secondValue = "10";
		int firstInt = Integer.parseInt(firstValue, 2);
		int secondInt = Integer.parseInt(secondValue, 2);
		int sumValue = firstInt + secondInt;
		String firstValuebinary = Integer.toBinaryString(sumValue);
		System.out.println(firstValuebinary);
	}

}
