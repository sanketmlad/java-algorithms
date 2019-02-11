package com.example.programs;

import java.util.ArrayList;

public class JoinSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] l1 = {1, 2, 5, 7, 9, 10, 13, 14, 15};
		int [] l2 = {3, 4, 5, 6, 8, 10, 12};
		JoinList(l1, l2);

	}
	

	public static Integer[] JoinList(int [] l1, int [] l2) {
		int n1 = l1.length;
		int n2 = l2.length;
		int n = n1 + n2;
		int n1_counter = 0;
		int n2_counter = 0;
		int n_counter = 0;
		Integer[] newList = new  Integer[n];
		while(n1_counter < n1 && n2_counter < n2) {
				//System.out.println("n counter " +n_counter +" n1 counter " +n1_counter +" n2 counter " +n2_counter);
				if(l1[n1_counter] < l2[n2_counter]) {
				newList[n_counter] = l1[n1_counter];
				n_counter ++;
				n1_counter ++;
				}
				else {
				newList[n_counter] = l2[n2_counter];
				n_counter ++;
				n2_counter ++;
				}
				
		}
		while (n1_counter<n1) {
			newList[n_counter] = l1[n1_counter];
			n_counter ++;
			n1_counter ++;
		}
		while (n2_counter<n2) {
			newList[n_counter] = l2[n2_counter];
			n_counter ++;
			n1_counter ++;
		}
		
		for (int i=0; i<n; i++) {
		System.out.print(newList[i]+ " ");
		}
		return newList;
		}

}
