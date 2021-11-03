package com.lib.libraryapp.service;

import java.util.List;
import java.util.Optional;

import com.lib.libraryapp.DTO.VideoDto;
import com.lib.libraryapp.model.Video;

public interface VideoService {

	void saveVideo(Video video);

	List<Video> getallVideos();
	
	Video getById(Integer id);

	Optional<Video> updateVideo(Integer id, Video video);

	void deleteVideo(Integer id);

	List<VideoDto> getallVideoNumbers();

}
