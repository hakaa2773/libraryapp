package com.lib.libraryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lib.libraryapp.DTO.BookDto;
import com.lib.libraryapp.model.Book;
import com.lib.libraryapp.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	@RequestMapping(method = RequestMethod.POST,value = "/savebook")
	public void saveBook(@RequestBody Book book) {
		bookService.saveBook(book);		
	}
	@RequestMapping("getallbooks")
	public List<Book> getAll(){
		return bookService.getallBook();
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updateBook/{id}")
	public void updateBooks(@PathVariable Integer id, @RequestBody Book book){
		bookService.updateBooks(id,book);		
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletebook/{id}")
	public void deleteBook(@PathVariable Integer id){
		bookService.deleteBook(id);
	}
	
	@GetMapping("/getbybookid")
	public List<BookDto> getallBooknum(){
		return bookService.getallBooknum();
	}

}
