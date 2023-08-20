package com.springjdbc.employee.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "department", schema = "employees")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", length = 4)
    private String id;

    @Column(name = "dept_name")
    private String name;

    @OneToMany(mappedBy = "department")
    @JsonManagedReference
    private Set<DepartmentManager> departmentManagers;

    public Department() {
	super();
    }

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Department(String id, String name) {
	super();
	this.id = id;
	this.name = name;
    }

}
