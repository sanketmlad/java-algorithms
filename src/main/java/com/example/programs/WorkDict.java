package com.example.programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;



class EmployeeRecords implements EmployeeData{
	HashMap<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
	
	public void addEmployee(int Id, String firstName, String lastName) {
		if(employeeMap.get(Id) == null) {
			Employee e = new Employee();
			e.setFirstName(firstName);
			e.setLastName(lastName);
			employeeMap.put(Id, e);
			}
	
	}
	
	public void deleteEmployee(int Id) {
		employeeMap.remove(Id);
	}
	
	public void printEmployee(int Id) {
		if (employeeMap.get(Id) != null) {
		System.out.println(employeeMap.get(Id));}
		else {
			System.out.println("record deleted");
		}
	}
	public void printAll() {
		employeeMap.forEach((id, employee) -> {
			System.out.println("id: " + id +  " value: " + employee);
		});
	}
	
	public void sortRecords() {
		Map<Integer, Employee> result = employeeMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey()) 			
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
				(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		employeeMap =(HashMap<Integer, Employee>) result;
	}
}

public class WorkDict {

	public static void main(String[] args) {
		EmployeeRecords employees = new EmployeeRecords();
		employees.addEmployee(3, "Sandeep", "Patel");
		employees.addEmployee(1, "Hemant", "Shah");
		employees.addEmployee(2, "Sanket", "Lad");
		employees.sortRecords();
		employees.printEmployee(2);
		employees.printAll();
		employees.deleteEmployee(2);
		System.out.println("After deleting 2");
		employees.printAll();
		
	}

}
