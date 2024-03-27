package com.librarymanagement.library.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymanagement.library.entities.Book;
import com.librarymanagement.library.userRepository.UserRepository;

@Service
public class BookService 
{
	@Autowired
	private UserRepository userRepository;
	
	
	
	public Book saveBook(Book b)
	{
		return userRepository.save(b);
	}
	
	public Iterable<Book> saveAllBooks(List<Book> list)
	{
		return userRepository.saveAll(list);
	}
	
	
	public Book GetBookById(int id)
	{
		return userRepository.findById(id).orElse(null);
	}
	
	/*
	 
	 public Optional<Book> GetBookById(int id)
	 {
	 	return userRepository.findById(id);
	 }
	 
	 */
	
	public List<Book> getAllBooks()
	{
		return (List<Book>) userRepository.findAll();
	}
	
	
	public void deleteById(int id)
	{
		 userRepository.deleteById(id);
	}
	
	public void deleteAll()
	{
		userRepository.deleteAll();
	}
	
	public Book updateBook(Book book)
	{
		Book existBook = userRepository.findById(book.getId()).orElse(null);
		if(existBook != null)
		{
			existBook.setAutherName(book.getAutherName());
			existBook.setBookName(book.getBookName());
			existBook.setPrice(book.getPrice());
			userRepository.save(existBook);
		}
		return existBook;
	}
	
	public Book insertBook(Book book)
	{
		userRepository.save(book);
		return book;
	}	
	 
}
