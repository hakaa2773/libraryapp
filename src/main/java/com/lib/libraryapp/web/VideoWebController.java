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
import com.lib.libraryapp.model.Video;
import com.lib.libraryapp.service.VideoCategoryService;
import com.lib.libraryapp.service.VideoService;

@Controller
public class VideoWebController {
	@Autowired
	private VideoService videoService;
	@Autowired
	private VideoCategoryService videoCategoryService;
	
	@GetMapping("/viewvideo")
	public String getAllVideos(Model model) {
		model.addAttribute("video",videoService.getallVideoNumbers());
		return "viewvideo";		
	}
	
	@GetMapping("/showaddvideo")
	public String addnewVideo(Video video, Model model) {
		model.addAttribute("videoCategory", videoCategoryService.getAllVideoCategory());
		return"newvideo";
	}
	@PostMapping("/addnewvideo")
	public String addNewVideo(@Valid Video video, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "newvideo";
		}
		videoService.saveVideo(video);
		return "redirect:/viewvideo";			
	}
	
	
	@GetMapping("/showvideo/{id}")
	public String showEditVideoForm(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("video", videoService.getById(id));
		return"editvideo";
	}
	
	@PostMapping("/updatevideo/{id}")
	public String updatevideo(@PathVariable("id")Integer id, @Valid Video video, BindingResult result, Model model) {
		if(result.hasErrors()) {
			video.setId(id);
			model.addAttribute("video", video);
			return"editvideo";
		}
		Optional<Video> videoOptional = videoService.updateVideo(id, video);
		return "redirect:/viewvideo";		
	}
	
	@GetMapping("/deletevideo/{id}")
	public String deleteVideo(@PathVariable("id") Integer id, Model model) {
		videoService.deleteVideo(id);
		return "redirect:/viewvideo";
	}

}
