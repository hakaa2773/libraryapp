package com.lib.libraryapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.lib.libraryapp.model.VideoCategory;

public interface VideoCategoryRepository extends CrudRepository<VideoCategory, Integer> {

}
