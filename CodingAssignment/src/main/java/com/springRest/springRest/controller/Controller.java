package com.springRest.springRest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springRest.springRest.model.Employee;
import com.springRest.springRest.services.EmployeeServicesInterface;

@RestController
public class Controller {

	@Autowired
	EmployeeServicesInterface employeeServicesInterface;

	// Get home page
	@GetMapping("/home")
	public String home() {
		return "Home Page..";
	}

	// Get all employee details
	@GetMapping("/allEmployee")
	public List<Employee> getEmployees() {
		return this.employeeServicesInterface.getAllEmployee();
	}

	// Get employee by id
	@GetMapping("/employee/{empId}")
	public Employee getEmployeeById(@PathVariable String empId) {
		return this.employeeServicesInterface.getEmployeeById(Long.parseLong(empId));
	}

	// Add employee
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.employeeServicesInterface.addEmployee(employee);
	}

	// Update or Add course
	@PutMapping("/employee")
	public Employee updateEmployeeDetails(@RequestBody Employee employee) {
		return this.employeeServicesInterface.updateEmployeeDetails(employee);
	}

	// Delete employee by id
	@DeleteMapping("/employee/{empId}")
	public Employee deleteEmployeeById(@PathVariable String empId) {
		return this.employeeServicesInterface.getEmployeeById(Long.parseLong(empId));

	}
}
