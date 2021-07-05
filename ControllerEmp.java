package com.webapp.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ControllerEmp {
	@Autowired
	EmpService service;
	@RequestMapping("/")
	public List<Emp>allemp(){
		return  service.getEmp();
				
				
				
				
			
		
	}

}
