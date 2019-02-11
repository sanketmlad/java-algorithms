package com.example.programs;
import java.util.*;
import java.io.*;
class Node2 {
    Node2 left;
    Node2 right;
    int data;
    
    Node2(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class LCA {

	/*
    class Node2 
    	int data;
    	Node2 left;
    	Node2 right;
	*/
	public static Node2 lca(Node2 root, int v1, int v2) {
		
      	ArrayList<Node2> pathv1 = getPath(root, v1);
      	ArrayList<Node2> pathv2 = getPath(root, v2);
      	int n = Math.min(pathv1.size(), pathv2.size());
      	Node2 prev = null;
      	for (int i=0; i<n; i++) {
      		
      		System.out.println("Node2 1 " + pathv1.get(i).data + " Node2 2 " + pathv2.get(i).data);
      		if (pathv1.get(i).data == pathv2.get(i).data) {
      			prev = pathv1.get(i);
      		}
      		else {
      			System.out.println("they are not equal");
      			return prev;
      		}
      		System.out.println("iterator complete");
      	}
      	return pathv1.get(n-1);
    }

	private static ArrayList<Node2> getPath(Node2 root, int v1) {
		if (root==null) {
			return new ArrayList<Node2>();
		}
		HashMap <Node2, Node2> parentMap = new HashMap<Node2, Node2>(); 
		Stack<Node2> bfsStack = new Stack<Node2>();
		bfsStack.add(root);
		parentMap.put(root, null);
		ArrayList<Node2> v1Path = new ArrayList<Node2>();
		Node2 v1Node2 = null;
		while(!bfsStack.empty()) {
			
			Node2 currNode2 = bfsStack.pop();
			System.out.println("inside while "+ currNode2.data + "  v1 " + v1);
			if (currNode2.data == v1) {
				System.out.println("Node2 is found");
				v1Node2 = currNode2;
			}
			if(currNode2.right != null) {
				bfsStack.add(currNode2.right);
				parentMap.put(currNode2.right, currNode2);
			}
			if(currNode2.left != null) {
				bfsStack.add(currNode2.left);
				parentMap.put(currNode2.left, currNode2);
			}	
		}
		//System.out.println(parentMap);
		v1Path.add(v1Node2);
		while(parentMap.get(v1Node2)!=null) {
			v1Path.add(parentMap.get(v1Node2));
			v1Node2 = parentMap.get(v1Node2);
		}
		System.out.println(v1Path);
		Collections.reverse(v1Path);
		//System.out.println(v1Path);
		for (Node2 myNode2: v1Path) {
			System.out.println(myNode2.data);
		}
		// TODO Auto-generated method stub
		return v1Path;
	}

	public static Node2 insert(Node2 root, int data) {
        if(root == null) {
            return new Node2(data);
        } else {
            Node2 cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Node2 root = null;
        
        root = insert(root, 1);
        root = insert(root, 2);
        /*
        root = insert(root, 20);
        root = insert(root, 7);
        root = insert(root, 12);
        root = insert(root, 9);
        root = insert(root, 19);
         */
        Node2 ans = lca(root,1,2);
       
        System.out.println(ans.data);
    }	
}