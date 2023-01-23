package com.learn.spring.hibernate.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
@Getter
@Setter
public class Employee {
    @Id
    private int id;
    private String name;
    private int dept_id;
    private String city;
    private int salary;
}
