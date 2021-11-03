package com.lib.libraryapp.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.lib.libraryapp.model.VideoCategory;
import com.lib.libraryapp.service.VideoCategoryService;

@Controller
public class VideoCategoryWebController {
	@Autowired
	private VideoCategoryService videoCategoryService;
	
	@GetMapping("/viewvideocategory")
	public String getAllvideocategorys(Model model) {
		model.addAttribute("videoCategory",videoCategoryService.getAllVideoCategory());
		return "viewvideoCategory";		
	}
	
	@GetMapping("/showaddvideoCategory")
	public String showAddNewVideoCategoryForm(VideoCategory videoCategory) {
		return"newvideocategory";
	}
	@PostMapping("/addnewvideocategory")
	public String addnewVideoCategory(@Valid VideoCategory videoCategory, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "newvideocategory";
		}
		videoCategoryService.saveVideoCategory(videoCategory);
		return "redirect:/viewvideocategory";			
	}
	
	@GetMapping("/deletevideocategory/{id}")
	public String deleteVideoCategory(@PathVariable("id") Integer id, Model model) {
		videoCategoryService.deleteVideoCategory(id);
		return "redirect:/viewvideocategory";
	}

}
