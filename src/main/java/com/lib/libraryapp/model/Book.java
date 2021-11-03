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
@Table(name="tbl_book")
public class Book {
	@Id
	@Column(name="book_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="book_name")
	private String name;
	@Column(name="isbm")
	private Integer isbm;
	@Column(name="book_price")
	private Float price;
	@Column(name="nuber_of_copies")
	private Integer copies;	
	@ManyToOne(targetEntity =BookCategory.class, fetch = FetchType.LAZY)
	@JoinColumn(name="book_category_id",referencedColumnName = "book_category_id")
	private BookCategory bookCategory;
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
	public Integer getIsbm() {
		return isbm;
	}
	public void setIsbm(Integer isbm) {
		this.isbm = isbm;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getCopies() {
		return copies;
	}
	public void setCopies(Integer copies) {
		this.copies = copies;
	}
	public BookCategory getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}
	
	
	
	

	
	
	

}
