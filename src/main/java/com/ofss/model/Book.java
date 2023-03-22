package com.ofss.model;

public class Book {
	private Integer id;
	private String title;
	private Integer pages;
	private Author author;
	
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Book(Integer id, String title, Integer pages, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.pages = pages;
		this.author = author;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public Integer getPages() {
		return pages;
	}



	public void setPages(Integer pages) {
		this.pages = pages;
	}



	public Author getAuthor() {
		return author;
	}



	public void setAuthor(Author author) {
		this.author = author;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", pages=" + pages + ", author=" + author + "]";
	}
	
	
	
}
