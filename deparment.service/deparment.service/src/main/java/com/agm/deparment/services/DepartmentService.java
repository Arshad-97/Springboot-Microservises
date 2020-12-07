package com.agm.deparment.services;


import com.agm.deparment.entity.Department;
import com.agm.deparment.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department){
        //log.info("Inside save department of departmentService");
        return departmentRepository.save(department);
    }

	public Optional<Department> findDepartmentById(Long departmentId) {
		return departmentRepository.findById(departmentId);
	}

}
