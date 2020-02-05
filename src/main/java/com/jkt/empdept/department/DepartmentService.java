package com.jkt.empdept.department;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository deptRepo;
	
	public List<Department> getAllDept() {
		List<Department> allDept = new ArrayList<>();
		deptRepo.findAll().forEach(allDept::add);
		return allDept;
	}

	public Department getDept(String id) {
		return deptRepo.findById(id).get();
	}

	public Department addDept(Department dept) {
		return deptRepo.save(dept);
	}

	public Department updateDept(Department dept) {
		return deptRepo.save(dept);
	}

	public void deleteDept(String id) {
		deptRepo.deleteById(id);
	}
}
