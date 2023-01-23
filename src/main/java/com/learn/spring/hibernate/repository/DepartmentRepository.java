package com.learn.spring.hibernate.repository;

import com.learn.spring.hibernate.dao.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
