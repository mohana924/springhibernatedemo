package com.springjdbc.employee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springjdbc.employee.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, String> {

}
