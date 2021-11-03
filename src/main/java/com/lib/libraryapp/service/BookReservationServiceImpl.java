package com.lib.libraryapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lib.libraryapp.model.BookReservation;
import com.lib.libraryapp.repository.BookReservationRepository;

@Service
public class BookReservationServiceImpl implements BookReservationService {
	@Autowired
	private BookReservationRepository bookReservationRepository;

	@Override
	public void saveBookReservation(BookReservation bookReservation) {
		// TODO Auto-generated method stub
		bookReservationRepository.save(bookReservation);
		
	}

	@Override
	public List<BookReservation> getallBookReservation() {
		// TODO Auto-generated method stub
		List<BookReservation> bookReservations =new ArrayList<BookReservation>();
		bookReservationRepository.findAll().forEach(bookReservations::add);
		return bookReservations;
	}

	@Override
	public BookReservation getbyId(Integer id) {
		// TODO Auto-generated method stub
		Optional <BookReservation> br = Optional.ofNullable(bookReservationRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		BookReservation bookReservation = br.get();
		return bookReservation;
	}

	@Override
	public void deleteBookReservation(Integer id) {
		// TODO Auto-generated method stub
		bookReservationRepository.deleteById(id);
		
	}

}
