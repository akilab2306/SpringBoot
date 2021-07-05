package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
@Controller
public class EmployeeController {

	
	public void test(Employee e)
	{
		ArrayList<Employee>al=new ArrayList();
		if(e.getSalary()>5000)
		{
		al.add(e);
		}
		else 
			System.out.println("the salary range is below 5000");
		
		
		al.forEach(e1->System.out.println(al.toString()));	
	}
	
	

}
