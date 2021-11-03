package com.lib.libraryapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lib.libraryapp.model.VideoCategory;
import com.lib.libraryapp.repository.VideoCategoryRepository;

@Service
public class VideoCategoryServiceImpl implements VideoCategoryService {
	
	@Autowired
	private VideoCategoryRepository videoCategoryRepository;

	@Override
	public void saveVideoCategory(VideoCategory videoCategory) {
		// TODO Auto-generated method stub
		videoCategoryRepository.save(videoCategory);
		
	}

	@Override
	public List<VideoCategory> getAllVideoCategory() {
		// TODO Auto-generated method stub
		List<VideoCategory> videoCategories =new ArrayList<VideoCategory>();
		videoCategoryRepository.findAll().forEach(videoCategories::add);
		return videoCategories;
	}

	@Override
	public Optional<VideoCategory> updateVideoCategory(Integer id, VideoCategory videoCategory) {
		// TODO Auto-generated method stub
		//videoCategory.setId(id);
		//videoCategoryRepository.save(videoCategory);
		return videoCategoryRepository.findById(id).map(e->{
			e.setVideo_category_name(videoCategory.getVideo_category_name());
			return e;
			
		});
		
	}

	@Override
	public void deleteVideoCategory(Integer id) {
		// TODO Auto-generated method stub
		videoCategoryRepository.deleteById(id);
		
	}

	@Override
	public VideoCategory getById(Integer id) {
		// TODO Auto-generated method stub
		Optional <VideoCategory> vcat = Optional.ofNullable(videoCategoryRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		VideoCategory videoCategory = vcat.get();
		return videoCategory;
	}

}
