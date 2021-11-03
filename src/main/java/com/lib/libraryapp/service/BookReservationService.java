package com.lib.libraryapp.service;

import java.util.List;

import com.lib.libraryapp.model.BookReservation;

public interface BookReservationService {

	void saveBookReservation(BookReservation bookReservation);

	List<BookReservation> getallBookReservation();
	
	BookReservation getbyId (Integer id);

	void deleteBookReservation(Integer id);

}
