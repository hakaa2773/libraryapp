package com.lib.libraryapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lib.libraryapp.model.BookBorowing;
import com.lib.libraryapp.repository.BookBorowingRepository;

@Service
public class BookBorowingServiceImpl implements BookBorowingService {
	@Autowired
	private BookBorowingRepository bookBorowingRepository;

	@Override
	public void saveBookBorowing(BookBorowing bookBorowing) {
		// TODO Auto-generated method stub
		bookBorowingRepository.save(bookBorowing);
		
	}

	@Override
	public List<BookBorowing> getallBookBorowing() {
		// TODO Auto-generated method stub
		List<BookBorowing> bookBorowings =new ArrayList<BookBorowing>();
		bookBorowingRepository.findAll().forEach(bookBorowings::add);
		return bookBorowings;
	}

	@Override
	public BookBorowing getbyId(Integer id) {
		// TODO Auto-generated method stub
		Optional <BookBorowing> bb = Optional.ofNullable(bookBorowingRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		BookBorowing bookBorowing =bb.get();
		return bookBorowing;
	}

	@Override
	@Transactional
	public Optional<BookBorowing> updateBookBorowing(Integer id, BookBorowing bookBorowing) {
		// TODO Auto-generated method stub
		return bookBorowingRepository.findById(id).map(e->{
			e.setBorrowing_date(bookBorowing.getBorrowing_date());
			e.setDue_date(bookBorowing.getDue_date());
			e.setBorrowing_status(bookBorowing.getBorrowing_status());					
			return e;
		});
	} 

}
