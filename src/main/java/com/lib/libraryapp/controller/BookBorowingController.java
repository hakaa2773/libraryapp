package com.lib.libraryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lib.libraryapp.model.BookBorowing;
import com.lib.libraryapp.service.BookBorowingService;

@RestController
public class BookBorowingController {
	@Autowired
	private BookBorowingService bookBorowingService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/savebookborowing")
	public void saveBookBorowing(@RequestBody BookBorowing bookBorowing){
		bookBorowingService.saveBookBorowing(bookBorowing);		
	}
	@RequestMapping("/getallbookborowing")
	public List<BookBorowing> getAll(){
		return bookBorowingService.getallBookBorowing();
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updatebookborowing/{id}")
	public void updateBookBorowing(@PathVariable Integer id, @RequestBody BookBorowing bookBorowing) {
		bookBorowingService.updateBookBorowing(id,bookBorowing);
	}

}
