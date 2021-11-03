package com.lib.libraryapp.DTO;

public class BookDto {
	private Integer book_id;
	private String  book_name;
	private Integer isbm;
	private Float book_price;
	private Integer nuber_of_copies;
	private Integer book_category_id;
	private String book_category_name;
	public BookDto(Integer book_id, String book_name, Integer isbm, Float book_price, Integer nuber_of_copies,
			Integer book_category_id, String book_category_name) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.isbm = isbm;
		this.book_price = book_price;
		this.nuber_of_copies = nuber_of_copies;
		this.book_category_id = book_category_id;
		this.book_category_name = book_category_name;
	}
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public Integer getIsbm() {
		return isbm;
	}
	public void setIsbm(Integer isbm) {
		this.isbm = isbm;
	}
	public Float getBook_price() {
		return book_price;
	}
	public void setBook_price(Float book_price) {
		this.book_price = book_price;
	}
	public Integer getNuber_of_copies() {
		return nuber_of_copies;
	}
	public void setNuber_of_copies(Integer nuber_of_copies) {
		this.nuber_of_copies = nuber_of_copies;
	}
	public Integer getBook_category_id() {
		return book_category_id;
	}
	public void setBook_category_id(Integer book_category_id) {
		this.book_category_id = book_category_id;
	}
	public String getBook_category_name() {
		return book_category_name;
	}
	public void setBook_category_name(String book_category_name) {
		this.book_category_name = book_category_name;
	}
	
	
	
	
	

}
