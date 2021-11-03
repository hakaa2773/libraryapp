package com.lib.libraryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lib.libraryapp.DTO.VideoDto;
import com.lib.libraryapp.model.Video;
import com.lib.libraryapp.service.VideoService;

@RestController
public class VideoController {
	@Autowired
	private VideoService videoService;
	@RequestMapping(method = RequestMethod.POST,value = "/savevideo")
	public void saveVideo(@RequestBody Video video){
		videoService.saveVideo(video);		
	}
	@RequestMapping("/getallvideos")
	public List<Video> getAll(){
		return videoService.getallVideos();
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updatevideo/{id}")
	public void updateVideo(@PathVariable Integer id, @RequestBody Video video) {
		videoService.updateVideo(id,video);
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletevideo/{id}")
	public void deleteVideo(@PathVariable Integer id){
		videoService.deleteVideo(id);
	}
	

	@GetMapping("/getbyvideoid")
	public List<VideoDto> getallVideoNumbers(){
		return videoService.getallVideoNumbers();
	}

}
