package com.learn.spring.hibernate.service;


import com.learn.spring.hibernate.dao.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import java.util.Collection;
import java.util.List;

public interface EmployeeService {

    public Employee addEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public Employee getEmpById(Integer id);

    public void deleteEmpById(Integer id);

    public List<Employee> findAllSortedByName();

    public List<Employee> findEmployeeByNameList(Collection<String> names);

    public Page<Employee> findEmployeePageable(Pageable pageable);
}
