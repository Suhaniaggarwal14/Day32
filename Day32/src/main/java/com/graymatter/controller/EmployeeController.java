package com.graymatter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.graymatter.dto.DepartmentDto;
import com.graymatter.dto.EmployeeDepartment;
import com.graymatter.dto.EmployeeDto;

import com.graymatter.entities.Employee;

import com.graymatter.services.EmployeeService;



	@RestController

	public class EmployeeController {
		@Autowired
		EmployeeService service;
		
		@Autowired
		RestTemplate restTemplate;
		
		@GetMapping("/employee")
		public List<Employee> getAllEmployees(){
			return service.getAllEmployees();
		}
		
		@PostMapping("/employee")
		public Employee addEmployee(@RequestBody Employee employee) {
			return service.addEmployee(employee);
		}
		
		
		
		
		@GetMapping("/employee/deptId/{id}")
		public EmployeeDepartment getAllEmployeesOfDepartment(@PathVariable("id")int id){
			String url="http://DEPARTMENT_SERVICE/dept"+id;
		    DepartmentDto departmentDto=restTemplate.getForObject(url, DepartmentDto.class);
		    EmployeeDto employeeDto=new EmployeeDto(1,"aaa",30000);
		    
			return new EmployeeDepartment(employeeDto,departmentDto);
		    
		
			
			
		
		

		
		

		}}
