package com.springRest.springRest.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.springRest.springRest.model.Employee;

@Service
public class EmployeeServicesImplementation implements EmployeeServicesInterface {

	List<Employee> list;

	public EmployeeServicesImplementation() {
		list = new ArrayList<>();
		list.add(new Employee(101, "Sunil", "Kumar", "sunil@example.com", 25, "Male", "Bangalore,Karnataka"));
		list.add(new Employee(102, "Ram", "Singh", "ram@example.com", 35, "Male", "Allahabad,UP"));
		list.add(new Employee(103, "Manish", "Gautam", "manish@example.com", 22, "Male", "Indore,MP"));
		list.add(new Employee(104, "Deeksha", "Mishra", "Deeksha@example.com", 23, "female", "Kanpur,UP"));
		list.add(new Employee(105, "Ayesha", "Kumari", "ayesha@example.com", 20, "female", "Bangalore,Karnataka"));
	}

	// Get all employee
	@Override
	public List<Employee> getAllEmployee() {
		return list;
	}

	// Get employee by id
	@Override
	public Employee getEmployeeById(long empId) {
		Employee e = null;
		for (Employee employee : list) {
			if (employee.getId() == empId) {
				e = employee;
				break;
			}
		}
		return e;
	}

	// Add employee
	@Override
	public Employee addEmployee(Employee employee) {
		list.add(employee);
		return employee;
	}

	// Update employee details
	@Override
	public Employee updateEmployeeDetails(Employee employee) {
		list.add(new Employee(111, "Abhishek", "Dixit", "abhishek@example.com", 25, "Male", "Bhopal,MP"));
		return employee;
	}

	// Delete employee
	@Override
	public Employee deleteEmployeeById(long empId) {
		Employee e = null;
		for (Employee employee : list) {
			if (employee.getId() == empId)
				e = employee;
			break;
		}
		return e;
	}
}
