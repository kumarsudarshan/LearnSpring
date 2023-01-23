package com.learn.spring.hibernate.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Department")
@Getter
@Setter
public class Department {
    @Id
    private int id;
    private String name;
}
