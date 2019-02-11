package com.example.programs;

import java.util.Set;
import java.util.TreeSet;


class EmployeeTreeSet extends Employee implements Comparable<EmployeeTreeSet>{
	private int Id;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public EmployeeTreeSet(int id) {
		super();
		Id = id;

	}

	public EmployeeTreeSet() {
		super();
	}

	@Override
	public String toString() {
		return "EmployeeTreeSet [Id=" + Id + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(EmployeeTreeSet e) {
        if (this.Id == e.getId()) {
            return 0;
        } else if (this.Id < e.getId()) {
            return -1;
        }
        return 1;
	}

	
}


class EmployeeRecordsTreeSet {
	//TreeSet<EmployeeTreeSet> employeeTreeSet = new TreeSet<EmployeeTreeSet>();
	Set<EmployeeTreeSet> employeeTreeSet = new TreeSet<EmployeeTreeSet>();
	public void addEmployee(int Id, String firstName, String lastName) {
		EmployeeTreeSet e = new EmployeeTreeSet();
		e.setId(Id);
		e.setFirstName(firstName);
		e.setLastName(lastName);
		employeeTreeSet.add(e);
	}
	
	public void deleteEmployee(int Id) {
		employeeTreeSet.removeIf(e -> e.getId() == Id);
	}
	
	public void printEmployee(int Id) {
		for (EmployeeTreeSet e : employeeTreeSet) {
			if(e.getId() == Id) {
				System.out.println(e);
			}		
		}
	}
	
	public void printAll() {
		for (EmployeeTreeSet e : employeeTreeSet) {
				System.out.println(e);	
		}
	}

}

public class WorkTreeSet {

	public static void main(String[] args) {
		EmployeeRecordsTreeSet employeesTreeset = new EmployeeRecordsTreeSet();
		employeesTreeset.addEmployee(3, "Sandeep", "Patel");
		employeesTreeset.addEmployee(1, "Hemant", "Shah");
		employeesTreeset.addEmployee(5, "Sanket", "Lad");
		employeesTreeset.printAll();
		employeesTreeset.printEmployee(1);
		employeesTreeset.deleteEmployee(1);
		System.out.println("After deleting 1");
		employeesTreeset.addEmployee(8, "Sank", "Laad");
		employeesTreeset.addEmployee(6, "V", "V");
		employeesTreeset.printAll();

	}

}
