package com.lib.libraryapp.service;

import java.util.List;
import java.util.Optional;

import com.lib.libraryapp.model.BookBorowing;

public interface BookBorowingService {

	void saveBookBorowing(BookBorowing bookBorowing);

	List<BookBorowing> getallBookBorowing();
	
	BookBorowing getbyId (Integer id);

	Optional<BookBorowing> updateBookBorowing(Integer id, BookBorowing bookBorowing);

}
