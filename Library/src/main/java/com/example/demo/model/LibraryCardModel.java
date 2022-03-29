package com.example.demo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


	@Table(name="library_card",schema = "demo")
	@Entity
	public class LibraryCardModel {
		@Id
		@Column(name="lib_card_no")
		private String libraryCardNo;
		
		@Column(name="lib_card_type")
		private String libraryCardType;
		
		@Column(name="lib_card_issue_date")
		private LocalDateTime libraryCardIssueDate;
		
		@Column(name="max_number_books_allowed")
		private Integer maxNumberBookAllowed;
		
		@Column(name="log_user_id")
		private String logUserId;
		
		@Column(name="log_ip_address")
		private String logIpAddress;
		
		@Column(name="log_timestamp")
		private LocalDateTime logTimeStamp;
		
		@Column(name="active")
		private String acTive;
		@Column(name="digita_books_allowed")
		private String DigitalBooksAllowed;

		public String getDigitalBooksAllowed() {
			return DigitalBooksAllowed;
		}

		public void setDigitalBooksAllowed(String digitalBooksAllowed) {
			DigitalBooksAllowed = digitalBooksAllowed;
		}

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

		public String getLogUserId() {
			return logUserId;
		}

		public void setLogUserId(String logUserId) {
			this.logUserId = logUserId;
		}

		public String getLogIpAddress() {
			return logIpAddress;
		}

		public void setLogIpAddress(String logIpAddress) {
			this.logIpAddress = logIpAddress;
		}

		public LocalDateTime getLogTimeStamp() {
			return logTimeStamp;
		}

		public void setLogTimeStamp(LocalDateTime logTimeStamp) {
			this.logTimeStamp = logTimeStamp;
		}

		public String getAcTive() {
			return acTive;
		}

		public void setAcTive(String acTive) {
			this.acTive = acTive;
		}

		
}
