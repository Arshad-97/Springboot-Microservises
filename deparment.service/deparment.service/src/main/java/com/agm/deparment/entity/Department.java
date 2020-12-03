package com.agm.deparment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentid;
    private String departmentname;
    private String departmentaddress;
    private String departmentcode;
}
