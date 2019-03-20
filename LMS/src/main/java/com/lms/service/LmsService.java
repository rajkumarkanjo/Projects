package com.lms.service;

import java.util.List;

import org.apache.camel.CamelContext;

import com.lms.model.Book;

public interface LmsService {
	
	public Book save(Book object);
	
	public Book getById(String id);
	
	public List<Book> getAll();
	
	public String delete(String id);   //boolean to string
	
	public Book updateAgent(String id, Book object);
	
	

}
