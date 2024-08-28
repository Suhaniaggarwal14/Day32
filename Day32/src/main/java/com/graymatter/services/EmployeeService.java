package com.graymatter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.dao.EmpoyeeDao;
import com.graymatter.entities.Employee;
@Service
public class EmployeeService implements EmployeeInterface{
	@Autowired
	
	EmpoyeeDao dao;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

	@Override
	public Employee addEmployee(Employee Employee) {
		// TODO Auto-generated method stub
		return dao.addEmployee(Employee);
	}

	
	
	
	
	

}
