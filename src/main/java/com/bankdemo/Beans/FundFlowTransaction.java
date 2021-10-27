package com.bankdemo.Beans;



import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class FundFlowTransaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  id;
	
	private String  fromAccount;
	 private String  toAccount;
		private int  amount;
		 private String  Description;
	
		 @JsonFormat(pattern = "yyyy-MM-dd")
		 private Date date;
		 
		 
		 
		 public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
	 public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	

	 
	 public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}

}
