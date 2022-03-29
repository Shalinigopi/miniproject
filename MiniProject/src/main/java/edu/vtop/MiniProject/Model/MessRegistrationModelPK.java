package edu.vtop.MiniProject.Model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MessRegistrationModelPK implements Serializable  {

	private static final long serialVersionUID = 1L;


	@Column(name="register_no",insertable=false, updatable=false)
	private Integer registerNo;

	@Column(name="mess_id",insertable=false, updatable=false)
	private Integer messId;

	//getter and setter

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

	@Override
	public int hashCode() {
		return Objects.hash(messId, registerNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MessRegistrationModelPK other = (MessRegistrationModelPK) obj;
		return Objects.equals(messId, other.messId) && Objects.equals(registerNo, other.registerNo);
	}
}

