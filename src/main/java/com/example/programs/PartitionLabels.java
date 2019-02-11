package com.example.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PartitionLabels {

    public static List<Integer> partitionLabels(String S) {
    	HashMap<String, ArrayList<ArrayList<Object>>> timeMap = new HashMap<String, ArrayList<ArrayList<Object>>> ();
        
    	int lastIndex[] = new int[128];
        for (int i = 0; i < S.length(); ++i)
        {//System.out.println((int)S.charAt(i));
          lastIndex[(int)S.charAt(i)] = i;}
       // for (int i = 0; i < 128; ++i) {
        	//System.out.print(i + " ");
        // System.out.println(lastIndex[i]);}
        List<Integer> ans = new ArrayList<>();
        int start = 0;
        int end = 0;
        for (int i = 0; i < S.length(); ++i) {
          end = Math.max(end, lastIndex[(int)S.charAt(i)]);
          if (i == end) {
            ans.add(end - start + 1);
            start = end + 1;
          }
        }
        return ans;
        
    }
	
	public static void main(String args[]) {
		System.out.println(partitionLabels("ababcbacadefegdehijhklija"));
	}
}
