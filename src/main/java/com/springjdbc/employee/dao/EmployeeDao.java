package com.springjdbc.employee.dao;

import com.springjdbc.employee.entity.Employee;

public interface EmployeeDao {

    public void insertEmployee(Employee emp);

    public void updateEmployee(Employee emp, int empId);
}
