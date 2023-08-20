package com.springjdbc.employee.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Embeddable
public class SalaryPrimaryKey implements Serializable {

    private static final long serialVersionUID = -5064985617480184692L;

    private Long employeeId;

    @Temporal(TemporalType.DATE)
    private Date fromDate;

    public SalaryPrimaryKey() {
    }

    public SalaryPrimaryKey(Long employeeId, Date fromDate) {
	this.employeeId = employeeId;
	this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
	result = prime * result + ((fromDate == null) ? 0 : fromDate.hashCode());
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
	SalaryPrimaryKey other = (SalaryPrimaryKey) obj;
	if (employeeId == null) {
	    if (other.employeeId != null)
		return false;
	} else if (!employeeId.equals(other.employeeId))
	    return false;
	if (fromDate == null) {
	    if (other.fromDate != null)
		return false;
	} else if (!fromDate.equals(other.fromDate))
	    return false;
	return true;
    }

    public Long getEmployeeId() {
	return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
	this.employeeId = employeeId;
    }

    public Date getFromDate() {
	return fromDate;
    }

    public void setFromDate(Date fromDate) {
	this.fromDate = fromDate;
    }

}
