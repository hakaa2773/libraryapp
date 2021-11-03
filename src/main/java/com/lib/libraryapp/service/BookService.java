package com.lib.libraryapp.service;

import java.util.List;
import java.util.Optional;

import com.lib.libraryapp.DTO.BookDto;
import com.lib.libraryapp.model.Book;

public interface BookService {

	void saveBook(Book book);

	List<Book> getallBook();
	
	Book getbyId(Integer id);

	Optional<Book>  updateBooks(Integer id, Book book);

	void deleteBook(Integer id);

	List<BookDto> getallBooknum();

}
