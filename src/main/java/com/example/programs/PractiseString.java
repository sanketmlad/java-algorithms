package com.example.programs;

import java.util.ArrayList;

public class PractiseString {

	static String MergeStrings(String str1) {
		char [] charArray = str1.toCharArray();
		System.out.println(charArray);
		str1 = new String(charArray);
		ArrayList<Character> test = new ArrayList<Character> ();
		test.add('C') ;
		test.add('D');
		String temp = "" ;
		for (Character s: test) {
			temp += s;
		}
		System.out.println(temp);
		return str1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeStrings("test");

	}

}
