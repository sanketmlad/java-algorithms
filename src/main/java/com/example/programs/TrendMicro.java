package com.example.programs;
public class TrendMicro {

	
	    int solution(int[] A) {
	        int N = A.length;
	        int result = 0;
	        for (int i = 0; i < N; i++) {
	            for (int j = i+1; j < N; j++) {
	                if (A[i] != A[j]) {
	                    result = Math.max(result, j - i);
	                   
	                }
	                
	            }
	          //  System.out.println(i+"==>"+result);
	        }
	        return result;
	    }
	
	    int solutionOPtimized(int[] A) {
	    	int N = A.length;
	        int result = 0;
	        for (int i = 0; i < N; i++) {
	            for (int j = N-1; j > 0 ; j--) {
	                if (A[i] != A[j]) {
	                    result = Math.max(result, j - i);
	                    break;
	                   
	                }
	                
	            }
	          // System.out.println("break with result"+result);
	        }
	        return result;
	    }
	
	public static void main(String args[]) {
		
		TrendMicro t = new TrendMicro();
		
		int array[] = {4,6,2,2,6,6,4}; 
		//int array[] = {1,1,2,1,1,1,1,1,1,1}; 
			
		System.out.println(t.solution(array));		
		
		System.out.println(t.solutionOPtimized(array));	
		
	}
}
