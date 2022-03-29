package com.example.demo.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="book_details",schema = "demo")
@Entity
public class BookDetailsModel{
	
	@Id
	@Column(name="book_id")
	private String bookId;
	
	@Column(name="book_title")
	private String bookTitle;
	
	@Column(name="book_category")
	private String bookCategory;
	
	@Column(name="author_name")
	private String authorName;
	
	@Column(name="edition")
	private String edition;
	
	@Column(name="pub_year_date")
	private Integer pubYearDate;
	
	@Column(name="log_user_id")
	private String logUserId;
	
	@Column(name="log_ip_addr")
	private String logIPAddr;
	
	@Column(name="log_time_stamp")
	private LocalDateTime logTimeStamp;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public Integer getPubYearDate() {
		return pubYearDate;
	}

	public void setPubYearDate(Integer pubYearDate) {
		this.pubYearDate = pubYearDate;
	}

	public String getLogUserId() {
		return logUserId;
	}

	public void setLogUserId(String logUserId) {
		this.logUserId = logUserId;
	}

	public String getLogIPAddr() {
		return logIPAddr;
	}

	public void setLogIPAddr(String logIPAddr) {
		this.logIPAddr = logIPAddr;
	}

	public LocalDateTime getLogTimeStamp() {
		return logTimeStamp;
	}

	public void setLogTimeStamp(LocalDateTime logTimeStamp) {
		this.logTimeStamp = logTimeStamp;
	}
		
}
	