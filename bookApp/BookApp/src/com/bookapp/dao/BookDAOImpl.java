package com.bookapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDAOImpl implements BookDAO{

	@Override
	public List<Book> getAllBooks() {
		return showBookList();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		List<Book> newBookList=new ArrayList<>();
		for(Book book: showBookList())
		{
			if(book.getAuthor().equals(author))
				newBookList.add(book);
		}
		return newBookList;
		
	}

	@Override
	public List<Book> getBookByCategory(String category) {
		// TODO Auto-generated method stub
		List<Book> newBookList=new ArrayList<>();
		for(Book book: showBookList())
		{
			if(book.getCategory().equals(category))
				newBookList.add(book);
		}
		return newBookList;
	}

	@Override
	public Book getById(int id) {
		// TODO Auto-generated method stub
		
		for(Book book: showBookList())
		{
			if(book.getBooId()==id)
				return book;
		}
		return null;
	}
	
	private List<Book> showBookList(){
		return Arrays.asList(
				new Book(1,"J2EE","Kathy","Tech",900.0),
				new Book(2,"7 habits","Steve","Self help",800.0),new Book(3,"","Kathy","Tech",1500.0),new Book(4,"J2EE","Kathy","Tech",600.0));
	}
}
