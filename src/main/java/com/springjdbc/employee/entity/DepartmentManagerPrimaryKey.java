package com.springjdbc.employee.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class DepartmentManagerPrimaryKey implements Serializable {

    private static final long serialVersionUID = -2766538242278434423L;

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "department_id")
    private String departmentId;
    
    public DepartmentManagerPrimaryKey() {
	super();
    }

    public Long getEmployeeId() {
	return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
	this.employeeId = employeeId;
    }

    public String getDepartmentId() {
	return departmentId;
    }

    public void setDepartmentId(String departmentId) {
	this.departmentId = departmentId;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((departmentId == null) ? 0 : departmentId.hashCode());
	result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	DepartmentManagerPrimaryKey other = (DepartmentManagerPrimaryKey) obj;
	if (departmentId == null) {
	    if (other.departmentId != null)
		return false;
	} else if (!departmentId.equals(other.departmentId))
	    return false;
	if (employeeId == null) {
	    if (other.employeeId != null)
		return false;
	} else if (!employeeId.equals(other.employeeId))
	    return false;
	return true;
    }

    public DepartmentManagerPrimaryKey(Long employeeId, String departmentId) {
	super();
	this.employeeId = employeeId;
	this.departmentId = departmentId;
    }

}
