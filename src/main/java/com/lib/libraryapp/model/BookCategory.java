package com.lib.libraryapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_book_category")
public class BookCategory {
	@Id
	@Column(name="book_category_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="book_category_name")
	private String book_category_name;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBook_category_name() {
		return book_category_name;
	}
	public void setBook_category_name(String book_category_name) {
		this.book_category_name = book_category_name;
	}
	
	

}
