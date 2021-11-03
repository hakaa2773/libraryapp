package com.lib.libraryapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lib.libraryapp.DTO.VideoDto;
import com.lib.libraryapp.model.Video;
import com.lib.libraryapp.repository.VideoRepocitory;

@Service
public class VideoServiceImpl implements VideoService{
	
	@Autowired
	private VideoRepocitory videoRepocitory;

	@Override
	public void saveVideo(Video video) {
		// TODO Auto-generated method stub
		videoRepocitory.save(video);
		
	}

	@Override
	public List<Video> getallVideos() {
		// TODO Auto-generated method stub
		List<Video> video =new ArrayList<Video>();
		videoRepocitory.findAll().forEach(video::add);
		return video;
	}

	@Override
	public Video getById(Integer id) {
		// TODO Auto-generated method stub
		Optional <Video> vd = Optional.ofNullable(videoRepocitory.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		Video video =vd.get();
		return video;
	}

	@Override
	@Transactional
	public Optional<Video> updateVideo(Integer id, Video video) {
		// TODO Auto-generated method stub
		return videoRepocitory.findById(id).map(e->{
			e.setName(video.getName());
			e.setVideo_age_restriction(video.getVideo_age_restriction());
			e.setNumber_of_copies(video.getNumber_of_copies());	
			return e;
		});
	}

	@Override
	public void deleteVideo(Integer id) {
		// TODO Auto-generated method stub
		videoRepocitory.deleteById(id);
		
	}

	@Override
	public List<VideoDto> getallVideoNumbers() {
		// TODO Auto-generated method stub
		List<VideoDto> videoDtos = new ArrayList<VideoDto>();
		videoRepocitory.getallVideoNumbers().forEach(videoDtos::add);
		return videoDtos;
	}

}
