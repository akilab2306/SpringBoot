package com.webapp.demo1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.demo1.model.Message;
import com.webapp.demo1.repo.MessageRepository;

import com.webapp.demo1.service.MessageService;


@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageRepository messageRepository;

	@Override
	@Transactional(propagation = Propagation.NEVER)
	public String saveMessage() {
		String response = "Message Saved.";
		Message message = new Message("message for user.");
		messageRepository.save(message);
		System.out.println(response);
		return response;
	}
}