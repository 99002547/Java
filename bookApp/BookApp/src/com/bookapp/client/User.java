package com.bookapp.client;

import java.util.ArrayList;
import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class User {
 public static void main(String[] args) {
	BookService bookService=new BookServiceImpl();
	System.out.println("All Books details are:");
	List<Book> newBookList=new ArrayList<>();
	newBookList=bookService.getAllBooks();
	for(Book book: newBookList)
	System.out.println(book);
	System.out.println("books by author:");
	newBookList=bookService.getByAuthor("Tech");
	for(Book book: newBookList)
	System.out.println(book);
	System.out.println("books by category:");
	newBookList=bookService.getBookByCategory("Kathy");
	for(Book book: newBookList)
	System.out.println(book);
	
	}
}
