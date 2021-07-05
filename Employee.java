package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String empid;
	private String empname;
	private String designation;
	private Double salary;

	@Override
	public String toString() {
		return "Employee Details: \n empid=" + empid + "\n  empname=" + empname + "\n designation=" + designation + "\n salary="
				+ salary + "\n ";
	}


	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
