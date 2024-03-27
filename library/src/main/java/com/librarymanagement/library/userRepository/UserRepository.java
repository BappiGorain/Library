package com.librarymanagement.library.userRepository;

import org.springframework.data.repository.CrudRepository;

import com.librarymanagement.library.entities.Book;

public interface UserRepository extends CrudRepository<Book, Integer>
{
	
}
