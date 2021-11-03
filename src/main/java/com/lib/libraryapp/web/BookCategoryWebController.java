package com.lib.libraryapp.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.lib.libraryapp.model.BookCategory;
import com.lib.libraryapp.service.BookCategoryService;

@Controller
public class BookCategoryWebController {
	@Autowired
	private BookCategoryService bookCategoryService;
	
	@GetMapping("/viewbookcategory")
	public String getAllbookcategorys(Model model) {
		model.addAttribute("bookCategory",bookCategoryService.getallbookcategory());
		return "viewbookCategory";		
	}
	

	@GetMapping("/showaddbookCategory")
	public String showAddNewBookCategoryForm(BookCategory bookCategory) {
		return"newbookcategory";
	}
	@PostMapping("/addnewbookcategory")
	public String addnewBookCategory(@Valid BookCategory bookCategory, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "newbookcategory";
		}
		bookCategoryService.saveBookCategory(bookCategory);
		return "redirect:/viewbookcategory";			
	}
	
	@GetMapping("/deletebookcategory/{id}")
	public String deleteBookCategory(@PathVariable("id") Integer id, Model model) {
		bookCategoryService.deleteBookCategory(id);
		return "redirect:/viewbookcategory";
	}

}
