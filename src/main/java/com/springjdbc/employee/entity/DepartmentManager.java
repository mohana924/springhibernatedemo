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
@Table(name = "department_manager", schema = "employees")
public class DepartmentManager {

    @EmbeddedId
    private DepartmentManagerPrimaryKey departmentManagerPrimaryKey;

    @MapsId("employeeId")
    @JoinColumn(name = "employee_id")
    @ManyToOne
    @JsonBackReference
    private Employee employee;

    @MapsId("departmentId")
    @JoinColumn(name = "department_id")
    @ManyToOne
    @JsonBackReference
    private Department department;

    @Column(name = "from_date")
    @Temporal(TemporalType.DATE)
    private Date from_date;

    @Column(name = "to_date")
    @Temporal(TemporalType.DATE)
    private Date to_date;

    public DepartmentManagerPrimaryKey getDepartmentManagerPrimaryKey() {
	return departmentManagerPrimaryKey;
    }

    public void setDepartmentManagerPrimaryKey(DepartmentManagerPrimaryKey departmentManagerPrimaryKey) {
	this.departmentManagerPrimaryKey = departmentManagerPrimaryKey;
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
