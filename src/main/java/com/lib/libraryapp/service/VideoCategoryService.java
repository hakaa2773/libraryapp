package com.lib.libraryapp.service;

import java.util.List;
import java.util.Optional;

import com.lib.libraryapp.model.VideoCategory;

public interface VideoCategoryService {

	void saveVideoCategory(VideoCategory videoCategory);

	List<VideoCategory> getAllVideoCategory();
	
	VideoCategory getById(Integer id);

	Optional<VideoCategory> updateVideoCategory(Integer id, VideoCategory videoCategory);

	void deleteVideoCategory(Integer id);

}
