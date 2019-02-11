package com.example.programs;

import java.util.*;
import java.io.*;

class Node1 {
    Node1 left;
    Node1 right;
    int data;
    
    Node1(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTreeHeight {

	public static int height(Node1 root) {
		if (root==null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		int height = Math.max(leftHeight, rightHeight);
		
		return height + 1;
    }

	public static Node1 insert(Node1 root, int data) {
        if(root == null) {
            return new Node1(data);
        }
        else {
            Node1 cur;
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
	public static void inorder(Node1 root) {
	    if (root!=null) {
	        
	        inorder(root.left);
	        System.out.println(root.data);
	        inorder(root.right);
	
	    }
	}
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // int t = scan.nextInt();
        Node1 root = null;
        
        root = insert(root, 15);
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 7);
        root = insert(root, 12);
        root = insert(root, 9);
        root = insert(root, 19);
        
        // scan.close();
        int height = height(root);
        System.out.println(height);
        
        inorder(root);
    }	
}