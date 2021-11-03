package com.lib.libraryapp.web;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.lib.libraryapp.model.Book;
import com.lib.libraryapp.service.BookCategoryService;
import com.lib.libraryapp.service.BookService;

@Controller
public class BookWebController {
	@Autowired
	private BookService bookService;
	@Autowired
	private BookCategoryService bookCategoryService;
	
	@GetMapping("/index")
	public String  showIndex() {
		return "index";
	}
	
	@GetMapping("/viewbook")
	public String getAllBooks(Model model) {
		model.addAttribute("book",bookService.getallBooknum());
		return "viewbook";		
	}
	
	@GetMapping("/showaddbook")
	public String addnewBook(Book book, Model model) {
		model.addAttribute("bookCategory", bookCategoryService.getallbookcategory());
		return"newbook";
	}
	@PostMapping("/addnewbook")
	public String addNewBook(@Valid Book book, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "newbook";
		}
		bookService.saveBook(book);
		return "redirect:/viewbook";			
	}
	
	
	@GetMapping("/showbook/{id}")
	public String showEditBookForm(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("book", bookService.getbyId(id));
		return"editbook";
	}
	
	@PostMapping("/updatebook/{id}")
	public String updatebook(@PathVariable("id")Integer id, @Valid Book book, BindingResult result, Model model) {
		if(result.hasErrors()) {
			book.setId(id);
			model.addAttribute("book", book);
			return"editbook";
		}
		Optional<Book> bookoOptional = bookService.updateBooks(id, book);
		return "redirect:/viewbook";		
	}
	
	@GetMapping("/deletebook/{id}")
	public String deleteBook(@PathVariable("id") Integer id, Model model) {
		bookService.deleteBook(id);
		return "redirect:/viewbook";
	}
 
}
