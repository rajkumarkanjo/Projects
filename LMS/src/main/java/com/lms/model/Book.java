package com.lms.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "lms")
	public class Book  implements Serializable {

		private static final long serialVersionUID = 1L;

		@Id
		@Column(name = "id")
		@GeneratedValue(strategy = GenerationType.AUTO)
		//@GeneratedValue(strategy = GenerationType.IDENTITY)
		public String id;

		@Column(name="bookname")
		private String bookname;
		
		@Column(name="bookauthor")
		private String bookauthor;
		
		@Column(name="edition")
		private String edition;
		
		@Column(name="isbn_no")
		private String isbn_no;
		
		@Column(name="bookissuedate")
		private String bookissuedate;

		@Column(name="bookduedate")
		private String bookduedate;
			
		
		

		public String getId() {
			return id;
		}




		public void setId(String id) {
			this.id = id;
		}




		public String getBookname() {
			return bookname;
		}




		public void setBookname(String bookname) {
			this.bookname = bookname;
		}




		public String getBookauthor() {
			return bookauthor;
		}




		public void setBookauthor(String bookauthor) {
			this.bookauthor = bookauthor;
		}




		public String getEdition() {
			return edition;
		}




		public void setEdition(String edition) {
			this.edition = edition;
		}




		public String getIsbn_no() {
			return isbn_no;
		}




		public void setIsbn_no(String isbn_no) {
			this.isbn_no = isbn_no;
		}




		public String getBookissuedate() {
			return bookissuedate;
		}




		public void setBookissuedate(String bookissuedate) {
			this.bookissuedate = bookissuedate;
		}




		public String getBookduedate() {
			return bookduedate;
		}


		public void setBookduedate(String bookduedate) {
			this.bookduedate = bookduedate;
		}

		@Override
		public String toString() {
			return "Book [id=" + id + ", bookname=" + bookname
					+ ", bookauthor=" + bookauthor + ", edition=" + edition
					+ ", isbn_no=" + isbn_no + ", bookissuedate="
					+ bookissuedate + ", bookduedate=" + bookduedate + "]";
		}



	}


