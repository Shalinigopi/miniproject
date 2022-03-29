package edu.vtop.MiniProject.Dto;

public class StudentDto {
	private Integer registerNumber;
	private String studentName;
	private String gender;
	private String emailId;
	private String departMent;
	private Long phoneNO;
	
	public String getDepartMent() {
		return departMent;
	}
	public void setDepartMent(String departMent) {
		this.departMent = departMent;
	}
	
	public Integer getRegisterNumber() {
		return registerNumber;
	}
	public void setRegisterNumber(Integer registerNumber) {
		this.registerNumber = registerNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getPhoneNO() {
		return phoneNO;
	}
	public void setPhoneNO(Long phoneNO) {
		this.phoneNO = phoneNO;
	}
}
