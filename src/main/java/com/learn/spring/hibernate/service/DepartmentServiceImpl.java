package com.learn.spring.hibernate.service;

import com.learn.spring.hibernate.dao.Department;
import com.learn.spring.hibernate.dao.Employee;
import com.learn.spring.hibernate.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Integer id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public void deleteDepartmentById(Integer id) {
        departmentRepository.deleteById(id);
    }

}
