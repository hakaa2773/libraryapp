package com.lib.libraryapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.lib.libraryapp.model.VideoBorowing;

public interface VideoBorowingRepository extends CrudRepository<VideoBorowing, Integer>  {

}
