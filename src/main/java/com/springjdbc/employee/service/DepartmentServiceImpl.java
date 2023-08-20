package com.springjdbc.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjdbc.employee.entity.Department;
import com.springjdbc.employee.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    public DepartmentRepository departmentRepository;

    @Override
    public int addDepartment(Department department) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public List<Department> getAllDepartments() {
	return (List<Department>) departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentbyId(String id) {
	Optional<Department> department = departmentRepository.findById(id);
	return department.isPresent() ? department.get() : null;
    }

    @Override
    public Department getDepartmentByName(String name) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Department removeDepartmentbyId(String id) {
	// TODO Auto-generated method stub
	return null;
    }

}
