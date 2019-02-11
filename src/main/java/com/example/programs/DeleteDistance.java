package com.example.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DeleteDistance {
	  static int deletionDistance(String str1, String str2) {
		  ArrayList<Integer> visited = new ArrayList<Integer> ();
		  
		    int str1len = str1.length();
		    int str2len = str2.length();
		    char[] stringToCharArray = str1.toCharArray();
		    stringToCharArray.toString();
		    int strlen = stringToCharArray.length;
		    ArrayList<Character> myCharArray = new ArrayList<Character> ();
		    for (char mychar: stringToCharArray){
	            myCharArray.add(mychar);
	        }
	        Set<Character> charSet = new HashSet<Character>(myCharArray);
	        charSet.size();
		    System.out.println(str1.substring(0, 1));
		    if ((str1len==0)||(str2len==0)){
		      return Math.max(str1len, str2len);
		    }
		    int n = Math.min(str1len, str2len);
		    if (str1.charAt(0) == str2.charAt(0)) {
		    	return deletionDistance(str1.substring(1), str2.substring(1));
		    }
		    else {
		    	return 1 + Math.min(deletionDistance(str1.substring(0), str2.substring(1)),
		    			(deletionDistance(str1.substring(1), str2.substring(0))));
		    }
		    
		    // your code goes here
		  }

		  public static void main(String[] args) {
		  System.out.println(deletionDistance("heat", "hit"));
		  }

}
