package com.springRest.springRest.services;

import java.util.List;
import com.springRest.springRest.model.Employee;

public interface EmployeeServicesInterface {

	public List<Employee> getAllEmployee();

	public Employee getEmployeeById(long empId);

	public Employee addEmployee(Employee employee);

	public Employee updateEmployeeDetails(Employee employee);

	public Employee deleteEmployeeById(long empId);

}
