package com.crud.saksoft.service;

import java.util.List;

import com.crud.saksoft.model.Employee;

public interface EmployeeService {
	
	// Save the Employee Data
	public Employee saveEmployee(Employee employee);
	
	// Update the Employee Data
	public Employee updateEmployee(Employee employee);
	
	//Update the Employee Data
	public List<Employee> getAllEmployee();
	
	//Get Employee Data best on Id
	public Employee findByEmployeeId(int id);
	
	// Delete Employee Data best on Id
	public void deleteByEmployeeId(int id);
}
