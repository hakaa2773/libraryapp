package com.lib.libraryapp.service;

import java.util.List;
import java.util.Optional;

import com.lib.libraryapp.model.VideoBorowing;

public interface VideoBorowingService {

	void saveVideoBorowing(VideoBorowing videoBorowing);

	List<VideoBorowing> getallVideoBorowing();
	
	VideoBorowing getbyId (Integer id);

	Optional<VideoBorowing> updateVideoBorowing(Integer id, VideoBorowing videoBorowing);

}
