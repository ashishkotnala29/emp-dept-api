package com.jkt.empdept.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService deptService;
	
	@RequestMapping("/dept")
	public List<Department> getAllDept() {
		return deptService.getAllDept();
	}
	@RequestMapping("/dept/{id}")
	public Department getDept(@PathVariable String id) {
		return deptService.getDept(id);
	}
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method=RequestMethod.POST, value="/dept")
	public Department addDept(@RequestBody Department dept) {
		return deptService.addDept(dept);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/dept/{id}")
	public Department updateDept(@RequestBody Department dept,@PathVariable String id) {
		dept.setDeptId(id);
		return deptService.updateDept(dept);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/dept/{id}")
	public void deleteDept(@PathVariable String id) {
		deptService.deleteDept(id);
	}
}
