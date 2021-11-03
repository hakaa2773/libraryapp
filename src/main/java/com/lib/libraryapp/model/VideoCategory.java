package com.lib.libraryapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_video_category")
public class VideoCategory {
	@Id
	@Column(name="Video_category_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="video_category_name")
	private String video_category_name;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVideo_category_name() {
		return video_category_name;
	}
	public void setVideo_category_name(String video_category_name) {
		this.video_category_name = video_category_name;
	}
	
	

}
