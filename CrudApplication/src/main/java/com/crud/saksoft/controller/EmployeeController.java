package com.crud.saksoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.saksoft.model.Employee;
import com.crud.saksoft.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// Save the Employee Data
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);

	}

	// Update the Employee Data
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);

	}

	// Update the Employee Data
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();

	}

	// Get Employee Data best on Id
	@GetMapping("/findByEmployeeId/{id}")
	public Employee findByEmployeeId(@PathVariable("id") int id) {
		return employeeService.findByEmployeeId(id);

	}

	// Delete Employee Data best on Id
	@DeleteMapping("/deleteByEmployeeId/{id}")
	public void deleteByEmployeeId(@PathVariable("id") int id) {
		employeeService.deleteByEmployeeId(id);
	}

}
