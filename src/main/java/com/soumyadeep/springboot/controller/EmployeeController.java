package com.soumyadeep.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.soumyadeep.springboot.model.Employee;

@RestController
public class EmployeeController {

	@RequestMapping(value="/employee", method=RequestMethod.GET)
	public Employee getEmployee() {
		
		Employee employee=new Employee();
		employee.setDesignation("Director Technology");
		employee.setEmpId("1");
		employee.setName("Soumyadeep Saha");
		employee.setSalary(12000000.00);
		return employee;
	}
	
}
