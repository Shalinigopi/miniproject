package edu.vtop.MiniProject.Dto;

public class MessRegistrationDto {
	private Integer registerNo;
	private Integer messId;
	private String fromMonth;
	private String toMonth;
	private Integer amount;
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getRegisterNo() {
		return registerNo;
	}
	public void setRegisterNo(Integer registerNo) {
		this.registerNo = registerNo;
	}
	public Integer getMessId() {
		return messId;
	}
	public void setMessId(Integer messId) {
		this.messId = messId;
	}
	public String getFromMonth() {
		return fromMonth;
	}
	public void setFromMonth(String fromMonth) {
		this.fromMonth = fromMonth;
	}
	public String getToMonth() {
		return toMonth;
	}
	public void setToMonth(String toMonth) {
		this.toMonth = toMonth;
	}

}
