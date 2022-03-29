package edu.vtop.MiniProject.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details",schema = "demo")

public class StudentDetailsModel {

	@Id
	@Column(name="register_no")
	private Integer registerNumber;
	
    @Column(name="student_name")
	private String studentName;
    
    @Column(name="gender")
   	private String gender;
    
    @Column(name="email_id")
   	private String emailId;
    
    @Column(name="department")
    private String departMent;
    
    @Column(name="phone_no")
	private Long phoneNO;
    
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
	public String getDepartMent() {
		return departMent;
	}
	public void setDepartMent(String departMent) {
		this.departMent = departMent;
	}
	public Long getPhoneNO() {
		return phoneNO;
	}
	public void setPhoneNO(Long phoneNO) {
		this.phoneNO = phoneNO;
	}
    
}
