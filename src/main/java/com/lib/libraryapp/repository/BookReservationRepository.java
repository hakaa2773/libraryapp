package com.lib.libraryapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.lib.libraryapp.model.BookReservation;

public interface BookReservationRepository extends CrudRepository<BookReservation, Integer> {

}
