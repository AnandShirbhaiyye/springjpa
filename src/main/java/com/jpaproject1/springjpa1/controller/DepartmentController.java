package com.jpaproject1.springjpa1.controller;

import com.jpaproject1.springjpa1.Repository.DepartmentRepository;
import com.jpaproject1.springjpa1.model.Department;
import com.jpaproject1.springjpa1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping("/saveDepartment")
    public String saveDepartment(@RequestBody Department department) {
        departmentRepository.save(department);
        return "department saved";
    }
}
