package com.springjdbc.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjdbc.employee.entity.Employee;
import com.springjdbc.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
	return (List<Employee>) employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
	Optional<Employee> employee = employeeRepository.findById(id);
	return employee.isPresent() ? employee.get() : null;
    }

}
