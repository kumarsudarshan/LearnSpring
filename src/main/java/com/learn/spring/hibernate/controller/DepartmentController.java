package com.learn.spring.hibernate.controller;

import com.learn.spring.hibernate.dao.Department;
import com.learn.spring.hibernate.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/add")
    public Department addDepartment(@RequestBody Department department) {
        return departmentService.addDepartment(department);
    }

    @GetMapping("/fetch_all")
    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/fetch")
    public Department getDepartmentById(@RequestParam Integer id) {
        return departmentService.getDepartmentById(id);
    }

    @DeleteMapping("/delete")
    public void deleteDepartmentById(@RequestParam Integer id) {
        departmentService.deleteDepartmentById(id);
    }
}
