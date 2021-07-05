package com.webapp.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "/employees",path="/employees")
public interface EmployeeRepo extends JpaRepository<Emp,Integer>
{

}
