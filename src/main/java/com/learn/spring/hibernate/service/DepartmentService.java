package com.learn.spring.hibernate.service;

import com.learn.spring.hibernate.dao.Department;
import com.learn.spring.hibernate.dao.Employee;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface DepartmentService {
    public Department addDepartment(Department department);

    public List<Department> getAllDepartments();

    public Department getDepartmentById(Integer id);

    public void deleteDepartmentById(Integer id);
}
