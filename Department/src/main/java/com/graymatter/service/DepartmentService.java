package com.graymatter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.repositories.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	DepartmentRepository repository;

}
