package com.lib.libraryapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_video")
public class Video {
	@Id
	@Column(name="video_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="video_name")
	private String name;
	@Column(name="video_age_restriction")
	private Integer video_age_restriction;
	@Column(name="number_of_copies")
	private Integer number_of_copies;	
	@ManyToOne(targetEntity =VideoCategory.class, fetch = FetchType.LAZY)
	@JoinColumn(name="video_category_id",referencedColumnName = "video_category_id")
	private VideoCategory videoCategory;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public VideoCategory getVideoCategory() {
		return videoCategory;
	}
	public void setVideoCategory(VideoCategory videoCategory) {
		this.videoCategory = videoCategory;
	}
	
	
	
	
	
	
	

}
