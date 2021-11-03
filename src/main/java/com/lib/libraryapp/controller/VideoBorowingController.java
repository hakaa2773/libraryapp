package com.lib.libraryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.lib.libraryapp.model.VideoBorowing;
import com.lib.libraryapp.service.VideoBorowingService;

@RestController
public class VideoBorowingController {
	@Autowired
	private VideoBorowingService videoBorowingService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/savevideoborowing")
	public void saveVideoBorowing(@RequestBody VideoBorowing videoBorowing){
		videoBorowingService.saveVideoBorowing(videoBorowing);		
	}
	@RequestMapping("/getallvideoborowing")
	public List<VideoBorowing> getAll(){
		return videoBorowingService.getallVideoBorowing();
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updatevideoborowing/{id}")
	public void updateVideoBorowing(@PathVariable Integer id, @RequestBody VideoBorowing videoBorowing) {
		videoBorowingService.updateVideoBorowing(id,videoBorowing);
	}
	
	

}
