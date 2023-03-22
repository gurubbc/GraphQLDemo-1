package com.ofss.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

@Repository
public class AuthorRepository {

	
	public AuthorRepository()
	{
		System.out.println("Creating AuthorRepository object constructor");
	}
	
	
    private List<Author> authors = new ArrayList<>();

    public List<Author> findAll() {
        return authors;
    }

    public Author findById(int id) {
        return authors.stream()
                .filter(author -> author.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Author not found"));
    }

    public Author findByName(String name) {
        return authors.stream()
                .filter(author -> author.getFirstName()!=null)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Author not found"));
    }

    @PostConstruct
    private void init() {
        authors.add(new Author(1,"Josh","Long"));
        authors.add(new Author(2,"Mark","Heckler"));
        authors.add(new Author(3,"Greg","Turnquist"));
        authors.add(new Author(4,"Guru","Murthy"));
        System.out.println("init method from AuthorRepository");
    }
}