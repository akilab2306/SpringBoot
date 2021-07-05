package com.webapp.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	@GeneratedValue
	private Integer empid;
	private String empname;
	private String designation;
	private Double salary;
	
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", empname=" + empname + ", designation=" + designation + ", salary=" + salary
				+ "]";
	}

	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
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
