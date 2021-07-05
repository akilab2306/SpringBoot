package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(EmployeeApplication.class,args);
		Scanner sc=new Scanner(System.in);
		EmployeeController emp1=con.getBean(EmployeeController.class);
		String empid;
		String empname,designation;
		Double salary;

		System.out.println("enter emp id");
		empid=sc.nextLine();
		System.out.println("enter name");
		empname=sc.nextLine();
		System.out.println("enter Designation");
		designation=sc.nextLine();
		System.out.println("enter salary");
		salary=sc.nextDouble();
		Employee e1=new Employee();
		e1.setEmpid(empid);
		e1.setEmpname(empname);
		e1.setDesignation(designation);
		e1.setSalary(salary);
		
		emp1.test(e1);
		
		
	}
}


