package com.ofss.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

	@Autowired
	private final AuthorRepository authorRepository;

	private List<Book> books = new ArrayList<>();

	public BookRepository(AuthorRepository authorRepository) {
		System.out.println("Creating BookRepository object constructor");
		this.authorRepository = authorRepository;
	}

	public List<Book> findAll() {
		return books;
	}

	public Book findOne(Integer id) {
		return books.stream()
				.filter(book -> book.getId() == id)
				.findFirst().orElseThrow(() -> new RuntimeException("Book not found"));
	}

	@PostConstruct
	private void init() {
		System.out.println("init method from BookRepository");
		books.add(new Book(1,
				"Reactive Spring",
				484,
				authorRepository.findByName("Josh Long")));
		books.add(new Book(2,
				"Spring Boot Up & Running",
				328,
				authorRepository.findByName("Mark Heckler")));
		books.add(new Book(3,
				"Hacking with Spring Boot 2.3",
				392,
				authorRepository.findByName("Greg Turnquist")));
		books.add(new Book(4,
				"From Amateur to Architects",
				600,
				authorRepository.findByName("Guru")));
	}

}