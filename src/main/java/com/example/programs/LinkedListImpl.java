package com.example.programs;

import java.util.Stack;

class Node {
	int value;
	public Node(int value) {
		super();
		this.value = value;
	}
	public Node next;
}

class LinkedList{
	static Node first;
	static Node current;
	int value;
	private Node temp;
	private int ListSize;
	public LinkedList() {
	}
	
	public void add(int value) {
		if (first ==null) {
			temp = new Node(value);
			temp.next = null;
			first = temp;
			current = temp;
			ListSize ++;
		}
		else {
		temp = new Node(value);
		temp.next = null;
		current.next = temp;
		current = temp;
		ListSize ++;}
	}

	public void print() {
		Node temp=first;
		while (temp!= null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void printReverse() {
		Stack<Integer> s1 = new Stack<Integer>();
		Node temp=first;
		while (temp!= null) {
			
			s1.add(temp.value);
			temp = temp.next;
		}
		while (s1.empty()==false) {
			System.out.println(s1.pop());
		}
	}
	
	public void printReverseRecursive(Node node) {
		if (node==null) {
			return;
		}
		else {
			printReverseRecursive(node.next);
			System.out.println(node.value);
			
		}

	}
	public void printReverseRecursive() {
		printReverseRecursive(first);
	}
	
}

public class LinkedListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(12);
		ll.add(11);
		ll.add(4);
		ll.print();
		System.out.println("Reverse recursive");
		ll.printReverseRecursive();
		System.out.println("Reverse normal");
		ll.printReverse();
	}

}
