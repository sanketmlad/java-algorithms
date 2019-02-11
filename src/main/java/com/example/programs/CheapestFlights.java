package com.example.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

public class CheapestFlights {
	public static void main(String args[]) 
    { 
		int [][] flights = new int [3][3];
		
		flights[0] = new int []{0, 1, 100};
		flights[1] = new int []{1, 2, 100};
		flights[2] = new int []{0, 2, 500};
		findCheapestPrice(3, flights, 0, 2, 0);

    }
	public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
		HashMap<Integer, ArrayList<int []>> childs = new HashMap();
		int step = 0;
		for (int [] flight: flights) {
			childs.putIfAbsent(flight[0], new ArrayList<>());
			childs.get(flight[0]).add(new int [] {flight[1], flight[2]});
			System.out.println(flight[0]);
		}
		// Arrays.sort(B, Comparator.comparingInt(Math::abs));
		System.out.println(childs.get(0).get(0)[1]);
		Stack<Integer> stack = new Stack();
		stack.add(src);
		ArrayList<Integer> visited = new ArrayList();
		int [] cost = new int[n];
		Arrays.fill(cost, Integer.MAX_VALUE);
		Stack<Integer> stackCost = new Stack();
		int currcost = 0;
		while(!stack.empty()) {
			int curr = stack.pop();
			if (curr!=src)
			currcost = cost[curr];
			visited.add(curr);
			ArrayList<int []> currChilds = childs.get(curr);
			System.out.println(curr + " " + cost[curr]);
			if (currChilds == null)
				continue;
			for (int [] dest: currChilds) {
				if (!visited.contains(dest[0]))
					stack.add(dest[0]);
				
					cost[dest[0]] = Math.min(currcost + dest[1], cost[dest[0]]);
					
			}
			
			if (step++ > K) {
                break;
            }
		}
		for (int j=0; j<n; j++)
			System.out.println(cost[j]);
		return cost[dst]==Integer.MAX_VALUE ? -1 : cost[dst];
	}
}
