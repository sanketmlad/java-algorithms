package com.example.programs;


class Employee {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Employee() {
		super();
	}
	public Employee(int id, String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	
}

public interface EmployeeData{
	public void addEmployee(int Id, String firstName, String lastName);
	
	public void deleteEmployee(int Id);
	
	public void printEmployee(int Id);
	
	public void printAll();
}