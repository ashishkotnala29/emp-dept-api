package com.jkt.empdept.employee;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String>{

	public List<Employee> findByDepartmentDeptId(String deptId);
}
