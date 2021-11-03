package com.lib.libraryapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lib.libraryapp.DTO.BookDto;
import com.lib.libraryapp.model.Book;

public interface BookRepocitory extends CrudRepository<Book, Integer> {
	@Query(value = "SELECT new com.lib.libraryapp.DTO.BookDto (b.id, b.name, b.isbm, b.price, b.copies, bc.id, bc.book_category_name) FROM Book b JOIN BookCategory bc ON b.bookCategory = bc", nativeQuery = false)
	List<BookDto>getallBooknum();

}
