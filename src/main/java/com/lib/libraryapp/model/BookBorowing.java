package com.lib.libraryapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_book_borowing")
public class BookBorowing {
	@Id
	@Column(name="book_borowing_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="book_id")
	private Integer book_id;
	@Column(name="meb_id")
	private Integer meb_id;
	@Column(name="book_borrowing_date")
	private String borrowing_date;
	@Column(name="book_due_date")
	private String due_date;
	@Column(name="book_borrowing_status")
	private String borrowing_status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public Integer getMeb_id() {
		return meb_id;
	}
	public void setMeb_id(Integer meb_id) {
		this.meb_id = meb_id;
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
