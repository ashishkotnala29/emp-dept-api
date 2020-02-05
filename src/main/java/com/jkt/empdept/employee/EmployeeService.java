package com.jkt.empdept.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	public List<Employee> getAllEmployee() {
		List<Employee> allEmployee = new ArrayList<>();
		empRepo.findAll().forEach(allEmployee::add);
		return allEmployee;
	}

	public Employee getEmployee(String id) {
		return empRepo.findById(id).get();
	}

	public List<Employee> getAllEmployeeFromDept(String id) {
		return empRepo.findByDepartmentDeptId(id);
	}

	public Employee addEmployee(Employee employee) {
		return empRepo.save(employee);
	}

	public Employee updateEmployee(Employee employee) {
		return empRepo.save(employee);
	}

	public void deleteEmployee(String id) {
		empRepo.deleteById(id);
	}

}
