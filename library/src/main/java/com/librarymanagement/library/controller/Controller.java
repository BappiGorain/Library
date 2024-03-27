package com.librarymanagement.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.librarymanagement.library.entities.Book;
import com.librarymanagement.library.service.BookService;

@RestController
public class Controller 
{
	@Autowired
	private BookService bookService;
	
	@PostMapping("/addBook")
	public Book createBook(@RequestBody Book book)
	{
		return bookService.insertBook(book);
	}
	
	@GetMapping("/getBooks")
	public List<Book> getAllBooks()
	{
		return bookService.getAllBooks();
	}
	
	@GetMapping("/getBooks/{id}")
	public Book getAllBooks(@PathVariable int id)
	{
		return bookService.GetBookById(id);
	}
	
	@DeleteMapping("/deleteBooks")
	public void deleteBooks()
	{
		bookService.deleteAll();
	}
	
	@DeleteMapping("/deleteBooks/{id}")
	public void deleteBook(@PathVariable int id)
	{
		bookService.deleteById(id);
	}
	
	@PutMapping("/update")
	public Book updateBook(@RequestBody Book book) 
	{
		return bookService.updateBook(book);
	}
	
}
