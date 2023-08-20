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
@Table(name = "EmployeeTitle", schema = "employees")
public class EmployeeTitle {
	
	@EmbeddedId
	private TitlePrimaryKey titlePrimaryKey;
	 
	@MapsId("employeeId")
    @JoinColumn(name = "employee_id")
    @ManyToOne
    @JsonBackReference
    private Employee employee;
	
	@Column(name = "title", insertable = false, updatable = false)
	private String title;
	
	@Column(name = "from_date", insertable = false, updatable = false)
	@Temporal(TemporalType.DATE)
	private Date from_date;
	
	@Column(name = "to_date",insertable = false, updatable = false)
	@Temporal(TemporalType.DATE)
	private Date to_date;

	public TitlePrimaryKey getTitlePrimaryKey() {
		return titlePrimaryKey;
	}

	public void setTitlePrimaryKey(TitlePrimaryKey titlePrimaryKey) {
		this.titlePrimaryKey = titlePrimaryKey;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
