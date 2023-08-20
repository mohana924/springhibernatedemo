package com.springjdbc.employee.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(schema = "employees", name = "salary")
public class Salary {

    @EmbeddedId
    @AttributeOverrides({ @AttributeOverride(name = "employeeId", column = @Column(name = "employee_id")),
	    @AttributeOverride(name = "fromDate", column = @Column(name = "from_date")) })
    private SalaryPrimaryKey salaryPrimaryKey;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "to_date")
    @Temporal(TemporalType.DATE)
    private Date toDate;

    @MapsId("employeeId")
    @ManyToOne
    @JoinColumns(value = { @JoinColumn(name = "employee_id", referencedColumnName = "id") })
    @JsonBackReference
    private Employee employee;

    public SalaryPrimaryKey getSalaryPrimaryKey() {
	return salaryPrimaryKey;
    }

    public void setSalaryPrimaryKey(SalaryPrimaryKey salaryPrimaryKey) {
	this.salaryPrimaryKey = salaryPrimaryKey;
    }

    public Employee getEmployee() {
	return employee;
    }

    public void setEmployee(Employee employee) {
	this.employee = employee;
    }

    public Long getAmount() {
	return amount;
    }

    public void setAmount(Long amount) {
	this.amount = amount;
    }

    public Date getToDate() {
	return toDate;
    }

    public void setToDate(Date toDate) {
	this.toDate = toDate;
    }

}
