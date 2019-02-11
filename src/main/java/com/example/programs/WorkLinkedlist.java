package com.example.programs;

import java.util.LinkedList;

class EmployeeLinked extends Employee{
	private int Id;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public EmployeeLinked(int id) {
		super();
		Id = id;

	}

	public EmployeeLinked() {
		super();
	}

	@Override
	public String toString() {
		return "EmployeeLinked [Id=" + Id + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ "]";
	}

	
}

class EmployeeRecordsLinked implements EmployeeData{
	LinkedList<EmployeeLinked> employeeLinkedlist = new LinkedList<EmployeeLinked>();
	
	public void addEmployee(int Id, String firstName, String lastName) {
		EmployeeLinked e = new EmployeeLinked();
		e.setId(Id);
		e.setFirstName(firstName);
		e.setLastName(lastName);
		employeeLinkedlist.add(e);
	}
	
	public void deleteEmployee(int Id) {
		for (EmployeeLinked e : employeeLinkedlist) {
		    if (e.getId() == Id) {
		    	employeeLinkedlist.remove(e);
		    }
		}
	}
	
	public void printEmployee(int Id) {
		boolean employeeFound = false;
		for (EmployeeLinked e : employeeLinkedlist) {
		    if (e.getId() == Id) {
		    	employeeFound = true;
		    	System.out.println(e);
		    }
		}
		if (!employeeFound) {
			System.out.println("Employee not found");
		}

	}
	public void printAll() {
		for (EmployeeLinked e : employeeLinkedlist) {
		    	System.out.println(e);
		    
		}
	}
}

public class WorkLinkedlist {

	public static void main(String[] args) {
		EmployeeRecordsLinked employees = new EmployeeRecordsLinked();
		employees.addEmployee(1, "Sandeep", "Patel");
		employees.addEmployee(2, "Hemant", "Shah");
		employees.addEmployee(3, "Sanket", "Lad");
		employees.printEmployee(3);
		employees.deleteEmployee(3);
		System.out.println("After deleting 3");
		employees.printEmployee(3);
		employees.printAll();
		
	}

}
