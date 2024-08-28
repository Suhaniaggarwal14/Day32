package com.graymatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Employee;

import com.graymatter.repositories.EmployeeRepository;

@Repository
public class EmpoyeeDao {
	@Autowired
	EmployeeRepository repository;
	public List<Employee> getAllEmployees(){
		return repository.findAll();
		
		
	}
	public Employee addEmployee(Employee employee) {
		return repository.save(employee);
	}
	
	
	}

