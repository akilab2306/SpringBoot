package com.webapp.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmpService {
	private List<Emp>e=Arrays.asList(
			new Emp(21,"sayed","sales,",200.00),
			new Emp(22,"sayed","sales,",5000.00));
	
	
	
	
	public List<Emp>getEmp(){
		return e;
	}

}
