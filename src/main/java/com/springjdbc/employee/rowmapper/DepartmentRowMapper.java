package com.springjdbc.employee.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.employee.entity.Department;

public class DepartmentRowMapper implements RowMapper<Department> {

    @Override
    public Department mapRow(ResultSet rs, int rowNum) throws SQLException {

	Department department = new Department();
	department.setId(rs.getString("id"));
	department.setName(rs.getString("dept_name"));

	return department;
    }

}
