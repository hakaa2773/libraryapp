package com.lib.libraryapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lib.libraryapp.model.VideoReservation;
import com.lib.libraryapp.repository.VideoReservationRepository;

@Service
public class VideoReservationServiceImpl implements VideoReservationService {
	@Autowired
	private VideoReservationRepository videoReservationRepository;

	@Override
	public void saveVideoReservation(VideoReservation videoReservation) {
		// TODO Auto-generated method stub
		videoReservationRepository.save(videoReservation);
		
	}

	@Override
	public List<VideoReservation> getallVideoReservation() {
		// TODO Auto-generated method stub
		List<VideoReservation> videoReservations =new ArrayList<VideoReservation>();
		videoReservationRepository.findAll().forEach(videoReservations::add);
		return videoReservations;
	}

	@Override
	public VideoReservation getbyId(Integer id) {
		// TODO Auto-generated method stub
		Optional <VideoReservation> vr = Optional.ofNullable(videoReservationRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		VideoReservation videoReservation = vr.get();
		return videoReservation;
	}

	@Override
	public Optional<VideoReservation> updateVideoReservations(Integer id, VideoReservation videoReservation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteVideoReservation(Integer id) {
		// TODO Auto-generated method stub
		videoReservationRepository.deleteById(id);
		
	}

}
