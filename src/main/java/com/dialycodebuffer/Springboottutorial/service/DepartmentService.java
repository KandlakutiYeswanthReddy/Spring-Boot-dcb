
package com.dialycodebuffer.Springboottutorial.service;

import java.util.List;

import com.dialycodebuffer.Springboottutorial.entity.Department;
import com.dialycodebuffer.Springboottutorial.error.DepartmentNotFoundException;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

	public void DeleteDepartmentByID(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	public Department fetchDepartmentByName(String departmentName);

	

}
