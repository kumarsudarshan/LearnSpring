package com.learn.spring.hibernate.controller;

import com.learn.spring.hibernate.dao.Employee;
import com.learn.spring.hibernate.exception.BusinessException;
import com.learn.spring.hibernate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/fetch_all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/fetch")
    public Employee getEmpById(@RequestParam Integer id) {
        return employeeService.getEmpById(id);
    }

    @DeleteMapping("/delete")
    public void deleteEmpById(@RequestParam Integer id) {
        employeeService.deleteEmpById(id);
    }

    @GetMapping("/sort_by_name")
    public List<Employee> findAllSortedByName() {
        return employeeService.findAllSortedByName();
    }

    @GetMapping("/fetch_employee_by_name_list")
    public Object findEmployeeByNameList(@RequestParam Collection<String> names) {
        return employeeService.findEmployeeByNameList(names);
    }

    @GetMapping("/fetch_employee_pageable")
    public Object findEmployeePageable(@RequestParam int offset, @RequestParam int limit) {
        return employeeService.findEmployeePageable(PageRequest.of(offset, limit));
    }
}
