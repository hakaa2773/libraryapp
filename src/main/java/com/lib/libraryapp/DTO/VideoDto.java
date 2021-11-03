package com.lib.libraryapp.DTO;

public class VideoDto {
	private Integer video_id;
	private String video_name;
	private Integer video_age_restriction;
	private Integer number_of_copies;
	private Integer video_category_id;
	private String video_category_name;
	public VideoDto(Integer video_id, String video_name, Integer video_age_restriction, Integer number_of_copies,
			Integer video_category_id, String video_category_name) {
		super();
		this.video_id = video_id;
		this.video_name = video_name;
		this.video_age_restriction = video_age_restriction;
		this.number_of_copies = number_of_copies;
		this.video_category_id = video_category_id;
		this.video_category_name = video_category_name;
	}
	public Integer getVideo_id() {
		return video_id;
	}
	public void setVideo_id(Integer video_id) {
		this.video_id = video_id;
	}
	public String getVideo_name() {
		return video_name;
	}
	public void setVideo_name(String video_name) {
		this.video_name = video_name;
	}
	public Integer getVideo_age_restriction() {
		return video_age_restriction;
	}
	public void setVideo_age_restriction(Integer video_age_restriction) {
		this.video_age_restriction = video_age_restriction;
	}
	public Integer getNumber_of_copies() {
		return number_of_copies;
	}
	public void setNumber_of_copies(Integer number_of_copies) {
		this.number_of_copies = number_of_copies;
	}
	public Integer getVideo_category_id() {
		return video_category_id;
	}
	public void setVideo_category_id(Integer video_category_id) {
		this.video_category_id = video_category_id;
	}
	public String getVideo_category_name() {
		return video_category_name;
	}
	public void setVideo_category_name(String video_category_name) {
		this.video_category_name = video_category_name;
	}
	
	
	

}
