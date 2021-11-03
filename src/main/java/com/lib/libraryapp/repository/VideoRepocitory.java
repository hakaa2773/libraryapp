package com.lib.libraryapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.lib.libraryapp.DTO.VideoDto;
import com.lib.libraryapp.model.Video;

public interface VideoRepocitory extends CrudRepository<Video, Integer>{
	@Query(value = "SELECT new com.lib.libraryapp.DTO.VideoDto (v.id, v.name, v.video_age_restriction, v.number_of_copies, vc.id, vc.video_category_name) FROM Video v JOIN VideoCategory vc ON v.videoCategory = vc", nativeQuery = false)
	List<VideoDto>getallVideoNumbers();

}
