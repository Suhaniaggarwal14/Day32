package com.graymatter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	DepartmentService service;
	
	

}
