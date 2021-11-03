package com.lib.libraryapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.lib.libraryapp.model.BookBorowing;

public interface BookBorowingRepository extends CrudRepository<BookBorowing, Integer> {

}
