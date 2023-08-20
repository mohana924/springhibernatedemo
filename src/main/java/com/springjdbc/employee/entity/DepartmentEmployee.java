package com.springjdbc.employee.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(schema = "employees", name = "department_employee")
public class DepartmentEmployee {

    @EmbeddedId
    private DepartmentEmployeePrimaryKey departmentEmployeePrimaryKey;

    @MapsId("employeeId")
    @ManyToOne
    @JoinColumn(name = "employee_id")
    @JsonBackReference
    private Employee employee;

    @MapsId("departmentId")
    @ManyToOne
    @JoinColumn(name = "department_id")
    @JsonBackReference
    private Department department;

    @Column(name = "from_date")
    @Temporal(TemporalType.DATE)
    private Date from_date;

    @Column(name = "to_date")
    @Temporal(TemporalType.DATE)
    private Date to_date;

    public DepartmentEmployeePrimaryKey getDepartmentEmployeePrimaryKey() {
	return departmentEmployeePrimaryKey;
    }

    public void setDepartmentEmployeePrimaryKey(DepartmentEmployeePrimaryKey departmentEmployeePrimaryKey) {
	this.departmentEmployeePrimaryKey = departmentEmployeePrimaryKey;
    }

    public Employee getEmployee() {
	return employee;
    }

    public void setEmployee(Employee employee) {
	this.employee = employee;
    }

    public Department getDepartment() {
	return department;
    }

    public void setDepartment(Department department) {
	this.department = department;
    }

    public Date getFrom_date() {
	return from_date;
    }

    public void setFrom_date(Date from_date) {
	this.from_date = from_date;
    }

    public Date getTo_date() {
	return to_date;
    }

    public void setTo_date(Date to_date) {
	this.to_date = to_date;
    }

}
