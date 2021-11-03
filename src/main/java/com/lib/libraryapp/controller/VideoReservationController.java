package com.lib.libraryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.lib.libraryapp.model.VideoReservation;
import com.lib.libraryapp.service.VideoReservationService;

@RestController
public class VideoReservationController {
	@Autowired
	private VideoReservationService videoReservationService;
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/savevideoreservation")
	public void saveVideoReservation(@RequestBody VideoReservation videoReservation) {
		videoReservationService.saveVideoReservation(videoReservation);		
	}
	@RequestMapping("getallvideoReservations")
	public List<VideoReservation> getAll(){
		return videoReservationService.getallVideoReservation();
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/updatevideoReservation/{id}")
	public void updateVideoReservation(@PathVariable Integer id, @RequestBody VideoReservation videoReservation){
		videoReservationService.updateVideoReservations(id,videoReservation);		
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletevideoReservation/{id}")
	public void deleteVideoReservation(@PathVariable Integer id){
		videoReservationService.deleteVideoReservation(id);
	}
	

}
