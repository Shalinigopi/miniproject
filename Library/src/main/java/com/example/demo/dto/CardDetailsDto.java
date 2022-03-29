package com.example.demo.dto;

import java.time.LocalDateTime;

public class CardDetailsDto {
	
	private String libraryCardNo;
	private String libraryCardType;
	private LocalDateTime libraryCardIssueDate;
	private Integer maxNumberBookAllowed;
	private String acTive;
	private String digitalBooksAllowed;
	public String getLibraryCardNo() {
		return libraryCardNo;
	}
	public void setLibraryCardNo(String libraryCardNo) {
		this.libraryCardNo = libraryCardNo;
	}
	public String getLibraryCardType() {
		return libraryCardType;
	}
	public void setLibraryCardType(String libraryCardType) {
		this.libraryCardType = libraryCardType;
	}
	public LocalDateTime getLibraryCardIssueDate() {
		return libraryCardIssueDate;
	}
	public void setLibraryCardIssueDate(LocalDateTime libraryCardIssueDate) {
		this.libraryCardIssueDate = libraryCardIssueDate;
	}
	public Integer getMaxNumberBookAllowed() {
		return maxNumberBookAllowed;
	}
	public void setMaxNumberBookAllowed(Integer maxNumberBookAllowed) {
		this.maxNumberBookAllowed = maxNumberBookAllowed;
	}
	public String getAcTive() {
		return acTive;
	}
	public void setAcTive(String acTive) {
		this.acTive = acTive;
	}
	public String getDigitalBooksAllowed() {
		return digitalBooksAllowed;
	}
	public void setDigitalBooksAllowed(String digitalBooksAllowed) {
		this.digitalBooksAllowed = digitalBooksAllowed;
	}
}
	