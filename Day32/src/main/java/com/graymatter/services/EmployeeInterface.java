package com.graymatter.services;

import java.util.List;

import com.graymatter.entities.Employee;

public interface EmployeeInterface {
	
	public List<Employee> getAllEmployees();
	public Employee addEmployee(Employee Employee);
	

}
