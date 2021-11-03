package com.lib.libraryapp.model;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_librarian")
public class Librarian {
	@Id
	@Column(name="lib_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="lib_firstname")
	private String firstname;
	@Column(name="lib_lastname")
	private String lastename;
	@Column(name="lib_email")
	private String email;
	@Column(name="lib_phone")
	private Integer phone;
	@Column(name="lib_addtess")
	private String address;
	@Column(name="lib_dob")
	private Date dob;
	@Column(name="lib_password")
	private String password;
	@Column(name="lib_photo")
	private Blob photo; 
	

}
