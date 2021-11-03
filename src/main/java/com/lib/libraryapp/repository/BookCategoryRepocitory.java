package com.lib.libraryapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.lib.libraryapp.model.BookCategory;

public interface BookCategoryRepocitory extends CrudRepository<BookCategory, Integer> {

}
