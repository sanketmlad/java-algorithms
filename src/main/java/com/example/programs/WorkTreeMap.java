package com.example.programs;

import java.util.TreeMap;
class EmployeeTreeMap extends Employee implements Comparable<EmployeeTreeMap>{

	@Override
	public int compareTo(EmployeeTreeMap e) {
		return 0;
	}
	
}

class EmployeeRecordsTree implements EmployeeData {
	TreeMap<Integer, EmployeeTreeMap> employeeTreeMap = new TreeMap<Integer, EmployeeTreeMap>();
	
	public void addEmployee(int Id, String firstName, String lastName) {
		employeeTreeMap.comparator();
		if(employeeTreeMap.get(Id) == null) {
			EmployeeTreeMap e = new EmployeeTreeMap();
			e.setFirstName(firstName);
			e.setLastName(lastName);
			employeeTreeMap.put(Id, e);
			}
	
	}
	
	public void deleteEmployee(int Id) {
		employeeTreeMap.remove(Id);
	}
	
	public void printEmployee(int Id) {
		if (employeeTreeMap.get(Id) != null) {
		System.out.println(employeeTreeMap.get(Id));}
		else {
			System.out.println("record deleted");
		}
	}
	public void printAll() {
		employeeTreeMap.forEach((id, employee) -> {
			System.out.println("id: " + id +  " value: " + employee);
		});
	}
	
	public void sortRecords() {
		
	}
}


public class WorkTreeMap {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		EmployeeRecordsTree employees = new EmployeeRecordsTree();
		employees.addEmployee(3, "Sandeep", "Patel");
		employees.addEmployee(1, "Hemant", "Shah");
		employees.addEmployee(2, "Sanket", "Lad");
		//employees.sortRecords();
		employees.printEmployee(2);
		employees.printAll();
		employees.deleteEmployee(2);
		System.out.println("After deleting 2");
		employees.addEmployee(7, "Sank", "Laad");
		employees.addEmployee(4, "V", "V");
		employees.printAll();
	}

}
