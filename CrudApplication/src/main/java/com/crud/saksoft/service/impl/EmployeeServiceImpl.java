package com.crud.saksoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.saksoft.model.Employee;
import com.crud.saksoft.repository.EmployeeRepository;
import com.crud.saksoft.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {

		return employeeRepository.findAll();
	}

	@Override
	public Employee findByEmployeeId(int id) {

		return employeeRepository.findById(id);
	}

	@Override
	public void deleteByEmployeeId(int id) {
		employeeRepository.deleteById(id);
		
	}

}
