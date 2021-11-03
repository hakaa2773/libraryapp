package com.lib.libraryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lib.libraryapp.model.BookCategory;
import com.lib.libraryapp.service.BookCategoryService;

@RestController
public class BookCategoryController {
	@Autowired
	private BookCategoryService bookCategoryService;
	@RequestMapping(method = RequestMethod.POST,value ="/savebookcategory")
	public void saveBookCategory(@RequestBody BookCategory bookCategory) {
		bookCategoryService.saveBookCategory(bookCategory);
	}
	@RequestMapping("/getallbookategory")
	public List<BookCategory> getAll(){
		return bookCategoryService.getallbookcategory();
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updatebookcategory/{id}")
	public void updateBookCategory(@PathVariable Integer id, @RequestBody BookCategory bookCategory) {
		bookCategoryService.updateBookCategory(id,bookCategory);
		
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletebookcategory/{id}")
	public void deleteBookCategory(@PathVariable Integer id) {
		bookCategoryService.deleteBookCategory(id);
	}
	
	

}
