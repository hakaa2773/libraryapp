package com.lib.libraryapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.lib.libraryapp.model.VideoReservation;

public interface VideoReservationRepository extends CrudRepository<VideoReservation, Integer> {

}
