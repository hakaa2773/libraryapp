package com.lib.libraryapp.service;

import java.util.List;
import java.util.Optional;

import com.lib.libraryapp.model.BookCategory;

public interface BookCategoryService {

	void saveBookCategory(BookCategory bookCategory);

	List<BookCategory> getallbookcategory();
	
	BookCategory getByd(Integer id);

	Optional<BookCategory> updateBookCategory(Integer id, BookCategory bookCategory);

	void deleteBookCategory(Integer id);

}
