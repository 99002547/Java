package com.bookapp.model;

public class Book {

	Integer booId;
	String title;
	String category;
	String author;
	Double Price;
	
	
	public Book() {
		super();
	}
	public Book(Integer booId, String title, String category, String author, Double price) {
		super();
		this.booId = booId;
		this.title = title;
		this.category = category;
		this.author = author;
		this.Price = price;
	}
	public Integer getBooId() {
		return booId;
	}
	public void setBooId(Integer booId) {
		this.booId = booId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Book [booId=" + booId + ", title=" + title + ", category=" + category + ", author=" + author
				+ ", Price=" + Price + "]";
	}
	
	

}
