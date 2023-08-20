package com.springjdbc.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springjdbc.employee.entity.Department;
import com.springjdbc.employee.service.DepartmentService;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping(path = "/departments")
    public Department addDepartment(@RequestBody Department department) {
	departmentService.addDepartment(department);
	return department;
    }

    @RequestMapping(method = RequestMethod.GET, value = { "/departments/{id}" })
    public Department getDepartmentById(@PathVariable String id) {
	return departmentService.getDepartmentbyId(id);
    }
    
    @GetMapping("/departments")
    public List<Department> getAllDepartments(){
	return departmentService.getAllDepartments();
    }

    /*
     * @GetMapping("/departments/{name}") public Department
     * getDepartmentByName(@PathVariable String name) { return
     * departmentService.getDepartmentByName(name); }
     */

}
