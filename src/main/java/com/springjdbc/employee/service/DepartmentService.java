package com.springjdbc.employee.service;

import java.util.List;

import com.springjdbc.employee.entity.Department;

public interface DepartmentService {

    public int addDepartment(Department department);

    public List<Department> getAllDepartments();

    public Department getDepartmentbyId(String id);

    public Department getDepartmentByName(String name);
    
    public Department removeDepartmentbyId(String id);

}
