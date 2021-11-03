package com.lib.libraryapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lib.libraryapp.model.VideoBorowing;
import com.lib.libraryapp.repository.VideoBorowingRepository;

@Service
public class VideoBorowingServiceImpl implements VideoBorowingService {
	@Autowired
	private VideoBorowingRepository videoBorowingRepository;

	@Override
	public void saveVideoBorowing(VideoBorowing videoBorowing) {
		// TODO Auto-generated method stub
		videoBorowingRepository.save(videoBorowing);
		
	}

	@Override
	public List<VideoBorowing> getallVideoBorowing() {
		// TODO Auto-generated method stub
		List<VideoBorowing> videoBorowings =new ArrayList<VideoBorowing>();
		videoBorowingRepository.findAll().forEach(videoBorowings::add);
		return videoBorowings;
	}

	@Override
	public VideoBorowing getbyId(Integer id) {
		// TODO Auto-generated method stub
		Optional <VideoBorowing> vb = Optional.ofNullable(videoBorowingRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("invalid Id")));
		VideoBorowing videoBorowing =vb.get();
		return videoBorowing;
	}

	@Override
	@Transactional
	public Optional<VideoBorowing> updateVideoBorowing(Integer id, VideoBorowing videoBorowing) {
		// TODO Auto-generated method stub
		return videoBorowingRepository.findById(id).map(e->{
			e.setBorrowing_date(videoBorowing.getBorrowing_date());
			e.setDue_date(videoBorowing.getDue_date());
			e.setBorrowing_status(videoBorowing.getBorrowing_status());			
			return e;
		});
	}

}
