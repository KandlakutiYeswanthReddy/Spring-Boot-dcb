package com.dialycodebuffer.Springboottutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dialycodebuffer.Springboottutorial.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	public Department findBydepartmentName(String departmentName);

	public Department findBydepartmentNameIgnoreCase(String departmentName);

}
