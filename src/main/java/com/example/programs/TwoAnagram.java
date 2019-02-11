package com.example.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;





public class TwoAnagram{
	static int makeAnagram(String a, String b) {
	    HashMap<Character, Integer> aMap = new HashMap<Character, Integer>();
	    HashMap<Character, Integer> bMap = new HashMap<Character, Integer>();
	    for (char aChar : a.toCharArray()) {
	        aMap.merge(aChar, 1, Integer::sum);
	    }
	    for (char bChar : b.toCharArray()) {
	        bMap.merge(bChar, 1, Integer::sum);
	    }
	    ArrayList<Character> listOfChara = new ArrayList<Character>();
	    for ( char c : a.toCharArray() )
	    {
	    	listOfChara.add( c );
	    }
	    ArrayList<Character> listOfCharb = new ArrayList<Character>();
	    for ( char c : b.toCharArray() )
	    {
	    	listOfCharb.add( c );
	    }
	    Set<Character> setA = new HashSet<Character>(listOfChara);
	    Set<Character> setB = new HashSet<Character>(listOfCharb);
	    setA.addAll(setB);
	    System.out.println(setA);
	    int ElmRemoved = 0;
	    for (Character c: setA) {
	    	System.out.println(c + " " + aMap.get(c) + " " + bMap.get(c));
	    	int aValue = aMap.getOrDefault(c, 0);
	    	int bValue = bMap.getOrDefault(c, 0);
	    	System.out.println(c + " " + aValue + " " + bValue);
	    	int diff = aValue- bValue;
	    	diff = Math.abs(diff);
	    	ElmRemoved = ElmRemoved + diff;
	    	
	    }
	    Iterator it = aMap.entrySet().iterator();
	    String s = "AAAA";
	    ArrayList<Character> newArray = new ArrayList<Character>();
	    char prev = 0;
        int deleteCounter = 0;
	    for(Character c: s.toCharArray()){
        	if (c!=prev) {
        		
        		newArray.add(c);
        		prev = c;
        	}
        	else {
        		deleteCounter += 1;
        		
        	}
        }
        String result = newArray.toString();
	    System.out.println(result+ " Delete counter "+ deleteCounter);
		
	    return ElmRemoved;
		
		

	}
    public static void main(String []args){
    	System.out.println(" No of element to delete " + makeAnagram("cde", "abc"));
     }
 
}