package com.graymatter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graymatter.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findAll();

}
