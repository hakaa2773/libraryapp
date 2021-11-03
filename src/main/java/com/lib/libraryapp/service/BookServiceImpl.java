package com.lib.libraryapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lib.libraryapp.DTO.BookDto;
import com.lib.libraryapp.model.Book;
import com.lib.libraryapp.repository.BookRepocitory;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepocitory bookRepocitory;

	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		bookRepocitory.save(book);
		
	}

	@Override
	public List<Book> getallBook() {
		// TODO Auto-generated method stub
		List<Book> book =new ArrayList<Book>();
		bookRepocitory.findAll().forEach(book::add);
		return book;
	}

	@Override
	public Book getbyId(Integer id) {
		// TODO Auto-generated method stub
		Optional <Book> bk = Optional.ofNullable(bookRepocitory.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		Book book = bk.get();
		return book;
	}

	@Override
	@Transactional
	public Optional<Book> updateBooks(Integer id, Book book) {
		// TODO Auto-generated method stub		
		return bookRepocitory.findById(id).map(e->{
			e.setName(book.getName());
			e.setIsbm(book.getIsbm());
			e.setPrice(book.getPrice());
			e.setCopies(book.getCopies());
			return e;
		});
	}

	@Override
	public void deleteBook(Integer id) {
		// TODO Auto-generated method stub
		bookRepocitory.deleteById(id);
		
	}

	@Override
	public List<BookDto> getallBooknum() {
		// TODO Auto-generated method stub
		List<BookDto> bookDtos = new ArrayList<BookDto>();
		bookRepocitory.getallBooknum().forEach(bookDtos::add);
		return bookDtos;
	}
}
