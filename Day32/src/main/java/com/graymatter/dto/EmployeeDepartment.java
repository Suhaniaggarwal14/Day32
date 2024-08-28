package com.graymatter.dto;

import com.graymatter.entities.Employee;

public class EmployeeDepartment {
	EmployeeDto employeeDto;
	DepartmentDto departmentDto;
	public EmployeeDepartment(EmployeeDto employeeDto, DepartmentDto departmentDto) {
		super();
		this.employeeDto = employeeDto;
		this.departmentDto = departmentDto;
	}
	

}
