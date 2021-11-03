package com.lib.libraryapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lib.libraryapp.model.BookCategory;
import com.lib.libraryapp.repository.BookCategoryRepocitory;

@Service
public class BookCategoryServiceImpl implements BookCategoryService {
	
	@Autowired	
	private BookCategoryRepocitory bookCategoryRepocitory;

	@Override
	public void saveBookCategory(BookCategory bookCategory) {
		// TODO Auto-generated method stub
		bookCategoryRepocitory.save(bookCategory);
		
	}

	@Override
	public List<BookCategory> getallbookcategory() {
		// TODO Auto-generated method stub
		List<BookCategory> bookCategories =new ArrayList<BookCategory>();
		bookCategoryRepocitory.findAll().forEach(bookCategories::add);
		return bookCategories;
	}

	@Override
	public Optional<BookCategory> updateBookCategory(Integer id, BookCategory bookCategory) {
		// TODO Auto-generated method stub
		//bookCategory.setId(id);
		//bookCategoryRepocitory.save(bookCategory);
		return bookCategoryRepocitory.findById(id).map(e->{
			e.setBook_category_name(bookCategory.getBook_category_name());
			return e;
			
		});
		
	}

	@Override
	public void deleteBookCategory(Integer id) {
		// TODO Auto-generated method stub
		bookCategoryRepocitory.deleteById(id);
		
	}

	@Override
	public BookCategory getByd(Integer id) {
		// TODO Auto-generated method stub
		Optional <BookCategory> bcat = Optional.ofNullable(bookCategoryRepocitory.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		BookCategory bookCategory = bcat.get();
		return bookCategory;
	}

}
