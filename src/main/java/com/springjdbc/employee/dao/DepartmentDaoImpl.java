package com.springjdbc.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springjdbc.employee.entity.Department;
import com.springjdbc.employee.rowmapper.DepartmentRowMapper;

@Component
public class DepartmentDaoImpl implements DepartmentDao {

    private static final String SQL_GET_DEPARTMENT = "select * from employees.department where id=?";
    private static final String SQL_GET_DEPARTMENT_NAME = "select * from employees.department where dept_name=?";
    private final String SQL_DELETE_DEPARTMENT = "delete from employees.department where id = ?";
    private final String SQL_UPDATE_DEPARTMENT = "update employees.department set dept_name = ? where id = ?";
    private final String SQL_GET_ALL = "select * from employees.department";
    private final String SQL_INSERT_DEPARTMENT = "insert into employees.department (id, dept_name) values (?, ?)";

    @Autowired
    private JdbcTemplate postgresJdbcTemplate;

    @SuppressWarnings("deprecation")
    @Override
    public Department getDepartmentById(String id) {
	return postgresJdbcTemplate.queryForObject(SQL_GET_DEPARTMENT, new Object[] { id }, new DepartmentRowMapper());

    }

    @Override
    public List<Department> getDepartments() {
	return postgresJdbcTemplate.query(SQL_GET_ALL, new DepartmentRowMapper());
    }

    @Override
    public int updateDepartment(Department department) {
	return postgresJdbcTemplate.update(SQL_UPDATE_DEPARTMENT, department.getName(), department.getId());
    }

    @Override
    public boolean deleteDepartment(String id) {
	return postgresJdbcTemplate.update(SQL_DELETE_DEPARTMENT, id) > 0;
    }

    @SuppressWarnings("deprecation")
    @Override
    public Department getDepartmentByName(String name) {
	return postgresJdbcTemplate.queryForObject(SQL_GET_DEPARTMENT_NAME, new Object[] { name },
		new DepartmentRowMapper());
    }

    @Override
    public int saveDepartment(Department department) {
	return postgresJdbcTemplate.update(SQL_INSERT_DEPARTMENT, department.getId(), department.getName());
    }
    

}
