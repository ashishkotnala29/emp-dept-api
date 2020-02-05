package com.jkt.empdept.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jkt.empdept.department.Department;
import com.jkt.empdept.employee.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@RequestMapping("/employee")
	public List<Employee> getAllEmployee() {
		return empService.getAllEmployee();
	}
	@RequestMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable String id) {
		return empService.getEmployee(id);
	}
	@RequestMapping("/employee/dept/{id}")
	public List<Employee> getAllEmployeeFromDept(@PathVariable String id) {
		return empService.getAllEmployeeFromDept(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/employee/dept/{id}")
	public Employee addEmployee(@RequestBody Employee employee,@PathVariable String id) {
		employee.setDepartment(new Department(id));
		return empService.addEmployee(employee);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/employee/{empId}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable String empId) {
		employee.setEmpId(empId);
		return empService.updateEmployee(employee);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/employee/{id}")
	public void deleteEmployee(@PathVariable String id) {
		empService.deleteEmployee(id);
	}
}
