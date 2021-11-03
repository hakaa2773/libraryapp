package com.lib.libraryapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_video_borowing")
public class VideoBorowing {
	@Id
	@Column(name="video_borowing_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="video_id")
	private Integer video_id;
	@Column(name="meb_id")
	private Integer member_id;
	@Column(name="video_borrowing_date")
	private String borrowing_date;
	@Column(name="video_due_date")
	private String due_date;
	@Column(name="video_borrowing_status")
	private String borrowing_status;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getVideo_id() {
		return video_id;
	}
	public void setVideo_id(Integer video_id) {
		this.video_id = video_id;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public String getBorrowing_date() {
		return borrowing_date;
	}
	public void setBorrowing_date(String borrowing_date) {
		this.borrowing_date = borrowing_date;
	}
	public String getDue_date() {
		return due_date;
	}
	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
	public String getBorrowing_status() {
		return borrowing_status;
	}
	public void setBorrowing_status(String borrowing_status) {
		this.borrowing_status = borrowing_status;
	}
	
	

}
