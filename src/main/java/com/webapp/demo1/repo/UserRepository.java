package com.webapp.demo1.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.demo1.model.User;


public interface UserRepository extends JpaRepository<User, Integer>{


}