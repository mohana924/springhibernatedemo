package com.springjdbc.employee.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class TitlePrimaryKey implements Serializable{

	private static final long serialVersionUID = -4634432343766115192L;
	
	@Column(name = "employee_id")
	private Long employeeId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "from_date")
	private Date from_date;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((from_date == null) ? 0 : from_date.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		TitlePrimaryKey other = (TitlePrimaryKey) obj;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (from_date == null) {
			if (other.from_date != null)
				return false;
		} else if (!from_date.equals(other.from_date))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public TitlePrimaryKey() {
		super();
	}

	public TitlePrimaryKey(Long employeeId, String title, Date from_date) {
		super();
		this.employeeId = employeeId;
		this.title = title;
		this.from_date = from_date;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
