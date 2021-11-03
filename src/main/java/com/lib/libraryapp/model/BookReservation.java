package com.lib.libraryapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="tbl_book_reservation")
public class BookReservation {
	@Id
	@Column(name="book_reservation_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="meb_id")
	private Integer meb_id;
	@Column(name="book_id")
	private Integer book_id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMeb_id() {
		return meb_id;
	}
	public void setMeb_id(Integer meb_id) {
		this.meb_id = meb_id;
	}
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	
	
	
}
