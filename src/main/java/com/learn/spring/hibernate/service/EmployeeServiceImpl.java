package com.learn.spring.hibernate.service;

import com.learn.spring.hibernate.dao.Employee;
import com.learn.spring.hibernate.exception.BusinessException;
import com.learn.spring.hibernate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        if(employee.getId() <= 0) {
            throw new BusinessException("400", "Employee Id can't be zero or negative");
        }
        try {
            return employeeRepository.save(employee);
//            return new ResponseEntity<>("Inserted", HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            throw new BusinessException("602","given employee is null" + e.getMessage());
        } catch (Exception e) {
            throw new BusinessException("603","Something went wrong in Service layer while saving the employee" + e.getMessage());
        }
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmpById(Integer id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public void deleteEmpById(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAllSortedByName() {
        return employeeRepository.findAllSortedByName();
    }

    @Override
    public List<Employee> findEmployeeByNameList(Collection<String> names) {
        return employeeRepository.findEmployeeByNameList(names);
    }

    @Override
    public Page<Employee> findEmployeePageable(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }
}
