package edu.app;

import java.util.List;

public class Studentdto {
	private int id;
	private String name;
	private static final String collegeName="VIT";
	private String departMent;
	private String address;
	private double totalfee;

	
	private List<Feesdto> FeesdtoList ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartMent() {
		return departMent;
	}
	public void setDepartMent(String departMent) {
		this.departMent = departMent;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getTotalfee() {
		return totalfee;
	}
	public void setTotalfee(double totalfee) {
		this.totalfee = totalfee;
	}
	public List<Feesdto> getFeesdtoList() {
		return FeesdtoList;
	}
	public void setFeesdtoList(List<Feesdto> feesdtoList) {
		FeesdtoList = feesdtoList;
	}
	public static String getCollegename() {
		return collegeName;
	}
}