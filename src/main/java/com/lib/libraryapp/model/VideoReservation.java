package com.lib.libraryapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="tbl_video_reservation")
public class VideoReservation {
	@Id
	@Column(name="video_reservation_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="video_id")
	private Integer videoid;
	@Column(name="meb_id")
	private Integer memberid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getVideoid() {
		return videoid;
	}
	public void setVideoid(Integer videoid) {
		this.videoid = videoid;
	}
	public Integer getMemberid() {
		return memberid;
	}
	public void setMemberid(Integer memberid) {
		this.memberid = memberid;
	}

}
