package com.webapp.demo.dao;
import org.springframework.data.repository.CrudRepository;

import com.webapp.demo.model.Emp;
public interface EmployeeDAO extends CrudRepository<Emp,Integer>
{

	Emp getOne(int empid);

}