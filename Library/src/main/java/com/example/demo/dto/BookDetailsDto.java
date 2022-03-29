package com.example.demo.dto;

public class BookDetailsDto {
	private String bookId;
	private String bookTitle;
	private String bookCategory;
	private String authorName;
	private String edition;
	private Integer pubYearDate;
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
	
	
	

}
