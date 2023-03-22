package com.ofss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.ofss.model.Book;
import com.ofss.model.BookRepository;

@Controller
public class BookController {

	@Autowired
    private final BookRepository bookRepository;


	
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookController is instantiated");
    }
    
    @SchemaMapping(typeName = "Query",value = "allBooks")
    public List<Book> findAll() {
    	System.out.println("Hitting FindAll BookController");
        return bookRepository.findAll();
    }
}