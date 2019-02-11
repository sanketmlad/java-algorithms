package com.example.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class ValidString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isValid("abcdefghhgfedecba");

	}

    static String isValid(String s) {
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        for (Character c : s.toCharArray()) {
            sMap.merge(c, 1, Integer::sum);
        }
        HashMap<Integer, ArrayList<Character>> InvsMap = new HashMap<Integer,  ArrayList<Character>>();
        Iterator it = sMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            if (InvsMap.get(pair.getValue()) == null){
                ArrayList<Character> temp = new ArrayList<Character>();
                temp.add((Character) pair.getKey());
                InvsMap.put((Integer) pair.getValue(), temp) ;
            }
            else {
            	ArrayList<Character> temp1 = InvsMap.get(pair.getValue());
            	temp1 = InvsMap.get(pair.getValue());
            	temp1.add((Character) pair.getKey());
            	InvsMap.put((Integer) pair.getValue(), temp1);
            }
        }
        System.out.println(InvsMap);
        Iterator it2 = InvsMap.entrySet().iterator();
        
        while (it2.hasNext()) {
        	HashMap<Integer, ArrayList<Character>> InvsMapDup = InvsMap;
        	Map.Entry<Integer, ArrayList<Character>> pair = (Entry<Integer, ArrayList<Character>>) it2.next();
        	if (InvsMapDup.keySet().size() == 1) {
        		return "YES";
        	}
        	if(pair.getValue().size() == 1) {
        		char elem = pair.getValue().get(0);
        		int freq = pair.getKey();
        		freq = freq - 1;
        		ArrayList<Character> temp = InvsMapDup.get(freq);
        		temp.add(elem);
        		InvsMapDup.put(freq, temp);
        		InvsMapDup.remove(freq +1);
        	}
        	System.out.println(InvsMapDup);
        	if (InvsMapDup.keySet().size() == 1) {
        		return "YES";
        	}
        }
        return "NO";
    }
}
