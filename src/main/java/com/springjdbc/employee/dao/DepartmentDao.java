package com.springjdbc.employee.dao;

import java.util.List;

import com.springjdbc.employee.entity.Department;

public interface DepartmentDao {

	public Department getDepartmentById(String id);

	public List<Department> getDepartments();

	public int updateDepartment(Department department);

	public boolean deleteDepartment(String id);

	public Department getDepartmentByName(String name);
	
	public int saveDepartment(Department department);

}
