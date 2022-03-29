package edu.vtop.MiniProject.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="master_mess",schema = "demo")
public class MasterMessModel {


@Id
@Column(name="mess_id")
private Integer messId;

public Integer getMessId() {
	return messId;
}

public void setMessId(Integer messId) {
	this.messId = messId;
}

public String getMessName() {
	return messName;
}

public void setMessName(String messName) {
	this.messName = messName;
}

public String getDescripTion() {
	return descripTion;
}

public void setDescripTion(String descripTion) {
	this.descripTion = descripTion;
}

@Column(name="mess_name")
private String messName;

@Column(name="description")
private String descripTion;



}

