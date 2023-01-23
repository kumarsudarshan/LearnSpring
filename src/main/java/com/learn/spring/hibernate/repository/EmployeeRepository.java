package com.learn.spring.hibernate.repository;

import com.learn.spring.hibernate.dao.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value = "SELECT e FROM Employee e ORDER BY name")
    public List<Employee> findAllSortedByName();

    @Query(value = "SELECT e FROM Employee e WHERE e.name IN :names")
    public List<Employee> findEmployeeByNameList(@Param("names") Collection<String> names);

}
