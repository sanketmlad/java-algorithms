package com.example.programs;

import java.util.ArrayList;
import java.util.HashMap;

public class MatchingSocks {

    
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, Integer[] ar) {
    	HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
    	int socksCounter = 0;
    	int currValue = 0;
        for(int i=0; i<n-1; i++){
        	
        	if(counter.get(ar[i]) == null) {
        		counter.put(ar[i], 1);
        		currValue = 0;
        	} else {
        		currValue = counter.get(ar[i]);
        		counter.put(ar[i], currValue+1);
        	}
        	if ((currValue +1)%2 == 0) {
        		socksCounter = socksCounter +1; 
        	}
        	//System.out.println("socks counter "+ socksCounter + " int " + ar[i]+ " crr counter " + counter.get(ar[i]));
        }
        return socksCounter;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ar = new Integer[] {1, 1, 3, 1, 2, 1, 3, 3, 3, 3 };
		int n = 10;
		System.out.println(sockMerchant(n, ar));
	
	}

}
