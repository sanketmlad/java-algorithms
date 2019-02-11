package com.example.programs;

import java.util.ArrayList;
import java.util.Comparator;


class EmployeeList extends Employee{
	private int Id;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public EmployeeList(int id) {
		super();
		Id = id;

	}

	public EmployeeList() {
		super();
	}

	@Override
	public String toString() {
		return "EmployeeList [Id=" + Id + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ "]";
	}

	
}


class EmployeeRecordsList implements EmployeeData{
	ArrayList<EmployeeList> employeelist = new ArrayList<EmployeeList>();
	
	public void addEmployee(int Id, String firstName, String lastName) {
		EmployeeList e = new EmployeeList();
		e.setId(Id);
		e.setFirstName(firstName);
		e.setLastName(lastName);
		employeelist.add(e);
		
	}
	
	public void deleteEmployee(int Id) {
		for (int i =0; i < employeelist.size() ; i++) {
		    if (employeelist.get(i).getId() == Id) {
		    	employeelist.remove(i);
		    }
		}
	}
	
	public void printEmployee(int Id) {
		boolean employeeFound = false;
		for (EmployeeList e : employeelist) {
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
		System.out.println("size " + employeelist.size());
		for (EmployeeList e : employeelist) {
		    	System.out.println(e);
		    
		}
	}
	public void sortRecords() {
		employeelist.sort(Comparator.comparing(EmployeeList::getId));
	}
	
	public void sortRecordsbubble() {
		 int n = employeelist.size();
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (employeelist.get(j).getId() > employeelist.get(j+1).getId()) 
	                { 
	                    EmployeeList temp = employeelist.get(j);
	                    employeelist.set(j, employeelist.get(j+1));
	                    employeelist.set(j+1, temp);

	                }
	}
}
public class WorkList {

	public static void main(String[] args) {
		EmployeeRecordsList employees = new EmployeeRecordsList();
		employees.addEmployee(3, "Sandeep", "Patel");
		employees.addEmployee(1, "Hemant", "Shah");
		employees.addEmployee(5, "Sanket", "Lad");
		employees.printEmployee(1);
		employees.deleteEmployee(1);
		System.out.println("After deleting 1");
		employees.printEmployee(1);
		employees.printAll();
		employees.sortRecords();
		System.out.println("After sort");
		employees.printAll();
		employees.addEmployee(10, "Bunty", "Lad");
		employees.addEmployee(2, "Swati", "Lad");
		employees.printAll();
		employees.sortRecordsbubble();
		System.out.println("After bubble sort");
		employees.printAll();
		

	}

}
