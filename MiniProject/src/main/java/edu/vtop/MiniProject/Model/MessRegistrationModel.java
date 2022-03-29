package edu.vtop.MiniProject.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mess_registration",schema = "demo")

public class MessRegistrationModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MessRegistrationModelPK id;

	@Column(name="form_month")
	private String fromMonth;

	@Column(name="to_month")
	private String toMonth;

	@Column (name="amount")
	private Integer amount;
	
	@Column (name="status")
	private String status;


	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	public MessRegistrationModelPK getId() {
		return id;
	}

	public void setId(MessRegistrationModelPK id) {
		this.id = id;
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
