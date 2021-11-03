package com.lib.libraryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lib.libraryapp.model.VideoCategory;
import com.lib.libraryapp.service.VideoCategoryService;

@RestController
public class VideoCategoryController {
	@Autowired
	private VideoCategoryService videoCategoryService;
	@RequestMapping(method = RequestMethod.POST,value = "/savevideocategory")
	public void SaveVideoCategory(@RequestBody VideoCategory videoCategory) {
		videoCategoryService.saveVideoCategory(videoCategory);		
	}
	
	@RequestMapping("/getallvideocategory")
	public List<VideoCategory> getAll(){
		return videoCategoryService.getAllVideoCategory();		
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updatevideocategory/{id}")
	public void updateVideoCategory(@PathVariable Integer id, @RequestBody VideoCategory videoCategory){
		videoCategoryService.updateVideoCategory(id,videoCategory);
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletevideocategory/{id}")
	public void deleteVideoCategory(@PathVariable Integer id){
		videoCategoryService.deleteVideoCategory(id);
	}

}
