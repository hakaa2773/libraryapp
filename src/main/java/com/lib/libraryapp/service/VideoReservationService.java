package com.lib.libraryapp.service;

import java.util.List;
import java.util.Optional;

import com.lib.libraryapp.model.VideoReservation;

public interface VideoReservationService {

	void saveVideoReservation(VideoReservation videoReservation);

	List<VideoReservation> getallVideoReservation();
	
	VideoReservation getbyId (Integer id);

	Optional<VideoReservation> updateVideoReservations(Integer id, VideoReservation videoReservation);

	void deleteVideoReservation(Integer id);

}
