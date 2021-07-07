package com.webapp.demo1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.demo1.model.Message;



public interface MessageRepository extends JpaRepository<Message, Integer>{

}