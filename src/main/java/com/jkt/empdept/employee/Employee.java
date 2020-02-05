package com.jkt.empdept.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.jkt.empdept.department.Department;

@Entity
public class Employee {

	@Id
	private String empId;
	private String empName;
	private String empCity;
	@ManyToOne
	private Department department;
	
	public Employee() {}
	
	public Employee(String empId, String empName, String empCity, String department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
		this.department = new Department(department);
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
