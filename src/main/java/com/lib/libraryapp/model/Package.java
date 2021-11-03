package com.lib.libraryapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_packagers")
public class Package {
	@Id
	@Column(name="package_id")
	private Integer id;
	@Column(name="pack_name")
	private String name;
	@Column(name="nuber_of_books")
	private Integer nuber_of_books;
	@Column(name="nuber_of_videos")
	private Integer nuber_of_videos;
	@Column(name="book_leading_duration")
	private Integer book_leading_duration;
	@Column(name="video_lending_duration")
	private Integer video_lending_duration;
	@Column(name="book_lending_chargers")
	private Float book_lending_chargers;
	@Column(name="video_leading_chargers")
	private Float video_leading_chargers;
	@Column(name="annaul_mebership_fee")
	private Float annaul_mebership_fee;
	@Column(name="overdue_charge")
	private Float overdue_charge;
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
	public Integer getNuber_of_books() {
		return nuber_of_books;
	}
	public void setNuber_of_books(Integer nuber_of_books) {
		this.nuber_of_books = nuber_of_books;
	}
	public Integer getNuber_of_videos() {
		return nuber_of_videos;
	}
	public void setNuber_of_videos(Integer nuber_of_videos) {
		this.nuber_of_videos = nuber_of_videos;
	}
	public Integer getBook_leading_duration() {
		return book_leading_duration;
	}
	public void setBook_leading_duration(Integer book_leading_duration) {
		this.book_leading_duration = book_leading_duration;
	}
	public Integer getVideo_lending_duration() {
		return video_lending_duration;
	}
	public void setVideo_lending_duration(Integer video_lending_duration) {
		this.video_lending_duration = video_lending_duration;
	}
	public Float getBook_lending_chargers() {
		return book_lending_chargers;
	}
	public void setBook_lending_chargers(Float book_lending_chargers) {
		this.book_lending_chargers = book_lending_chargers;
	}
	public Float getVideo_leading_chargers() {
		return video_leading_chargers;
	}
	public void setVideo_leading_chargers(Float video_leading_chargers) {
		this.video_leading_chargers = video_leading_chargers;
	}
	public Float getAnnaul_mebership_fee() {
		return annaul_mebership_fee;
	}
	public void setAnnaul_mebership_fee(Float annaul_mebership_fee) {
		this.annaul_mebership_fee = annaul_mebership_fee;
	}
	public Float getOverdue_charge() {
		return overdue_charge;
	}
	public void setOverdue_charge(Float overdue_charge) {
		this.overdue_charge = overdue_charge;
	}
	

}
