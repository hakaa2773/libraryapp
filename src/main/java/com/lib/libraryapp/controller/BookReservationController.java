package com.lib.libraryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lib.libraryapp.model.BookReservation;
import com.lib.libraryapp.service.BookReservationService;

@RestController
public class BookReservationController {
	@Autowired
	private BookReservationService bookReservationService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/savebookreservation")
	public void saveBookReservation(@RequestBody BookReservation bookReservation) {
		bookReservationService.saveBookReservation(bookReservation);		
	}
	
	@RequestMapping("/getallbookReservation")
	public List<BookReservation> getAll(){
		return bookReservationService.getallBookReservation();
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletebookreservation/{id}")
	public void deleteBookReservation(@PathVariable Integer id){
		bookReservationService.deleteBookReservation(id);
	}

}
