package com.webapp.demo.log;

import java.util.List;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.webapp.demo.model.Emp;

@Aspect
@Component
public class LogginAspect {
	private static final Logger LOGGER=LoggerFactory.getLogger(LogginAspect.class);
	
	@Before("execution(public * com.webapp.demo.controller.EmployeeCon.Emp())")
	public void log()
	{
		LOGGER.info("getEmployee method called");
	}	
	@After("execution(public * com.webapp.demo.controller.EmployeeCon.Emp())")
	public void logAfter()
	{
		LOGGER.info("getEmployee method executed");
	}
	@AfterReturning("execution(public * com.webapp.demo.controller.EmployeeCon.Emp())")
	public void logAfterReturn()
	{
		LOGGER.info("getEmployee method executed after returning");
	}
	@AfterThrowing("execution(public * com.webapp.demo.controller.EmployeeCon.Emp())")
	public void logAfterthrow()
	{
		LOGGER.info("exception");
	}

}
