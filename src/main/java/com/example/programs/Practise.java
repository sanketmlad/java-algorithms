package com.example.programs;

public class Practise {

	public String Solution() {
		return "Yes";
	}
	public static void main(String[] args) {
		//String s="welcometojava";
		String s="ZASKFDLklhfsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH";
		int k=1;
        String smallest = "";
        String largest = "";
        int Stringlen = s.length();
        String currSub;
        for (int i=0; i< Stringlen-k+1; i++){
        	currSub = (String) s.subSequence(i, i+k);
        	if(smallest == "") {
        		smallest = currSub;
        	}
        	if(largest == "") {
        		largest = currSub;
        	}
        	//System.out.println(currSub);
        	for (int j=0; j<= k-1; j++) {
        		//System.out.println(currSub.charAt(j) + largest.charAt(j));
        		if (currSub.charAt(j) > largest.charAt(j)) {
        			largest = currSub;
        			break;
        		}
        		if (currSub.charAt(j) < largest.charAt(j)) {
        			break;
        		}
        	}
        	for (int j=0; j<= k-1; j++) {
        		//System.out.println(currSub.charAt(j) + smallest.charAt(j));
        		if (currSub.charAt(j) < smallest.charAt(j)) {
        			smallest = currSub;
        			break;
        		}
        		if (currSub.charAt(j) > smallest.charAt(j)) {
        			break;
        		}
        	}
            //System.out.println(currSub + " " + smallest + " " + largest);
            
        }
        
        System.out.println(smallest + "\n" + largest);
	}

}
