package com.webapp.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.webapp.demo.dao.EmployeeDAO;
import com.webapp.demo.model.Emp;
@RestController
public class EmployeeCon {
	
	@Autowired
	EmployeeDAO repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "redirect:/home.jsp";
	}
	
	@RequestMapping("/addEmp")
	public String addEmp(Emp emp)
	{
		repo.save(emp);
		return "redirect:/home.jsp";
	}
	@PostMapping("/employees")
	public Emp postEmp(Emp emp)
	{
		repo.save(emp);
		return emp;
		
	}
	@PutMapping(path="/employees")
	public Emp putEmp(@RequestBody Emp emp)
	{
		repo.save(emp);
		return emp;
		
	}
	@RequestMapping("/searchEmp")

	public ModelAndView getEmp(@RequestParam int empid)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("redirect:/show.jsp");
		Emp e=repo.findById(empid).orElse(new Emp());
		mv.addObject(e);
		return mv;
	}
	@RequestMapping("/deleteEmp")
	public String deleteEmp(@RequestParam Emp empid)
	{
		repo.delete(empid);
		return "redirect:/home.jsp";
	}
	@RequestMapping("/updateEmp")
	public String updateEmp(@RequestParam Integer empid)
	{
	  	Emp e=repo.findById(empid).get(); 
	  	e.setSalary(200000.00);
	  	repo.save(e);
		return "redirect:/home.jsp";
	}
	
	@GetMapping(path="/employees")
	public List<Emp> Emp()
	{
		//int i=4/0;
		return (List<com.webapp.demo.model.Emp>) repo.findAll();
		
		
	}
	@GetMapping("/employees/{empid}")
	public Optional<Emp> getAlien(@PathVariable("empid")int empid)
	{
		return repo.findById(empid);
		
		
	}
	@DeleteMapping("/employees/{empid}")
	public String delAlien(@PathVariable("empid")int empid)
	{
		
		Emp e=repo.getOne(empid);
		repo.delete(e);
		return "Deleted";
		
	}
}
