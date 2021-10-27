package com.bankdemo.Beans;

import java.sql.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class BankRequestDto {

	@NotNull(message = "First name is mandatory.")
	private String  subscriberFirstName;
	@Size(min = 6, max = 16 ,message = "size can not be more than 16 characters.")
	private String  subscriberLastName;
	@NotEmpty()
	private Date    subscriberDOB;
	private String  subscriberPanNo;
	private String  subscriberGender;
	@Email
	@NotEmpty(message = "Email can not be empty.")
	private String  subscriberEmailId;
	private String  subscriberGenerateNewAccount;
	private int balance;
	public String getSubscriberFirstName() {
		return subscriberFirstName;
	}
	public void setSubscriberFirstName(String subscriberFirstName) {
		this.subscriberFirstName = subscriberFirstName;
	}
	public String getSubscriberLastName() {
		return subscriberLastName;
	}
	public void setSubscriberLastName(String subscriberLastName) {
		this.subscriberLastName = subscriberLastName;
	}
	public Date getSubscriberDOB() {
		return subscriberDOB;
	}
	public void setSubscriberDOB(Date subscriberDOB) {
		this.subscriberDOB = subscriberDOB;
	}
	public String getSubscriberPanNo() {
		return subscriberPanNo;
	}
	public void setSubscriberPanNo(String subscriberPanNo) {
		this.subscriberPanNo = subscriberPanNo;
	}
	public String getSubscriberGender() {
		return subscriberGender;
	}
	public void setSubscriberGender(String subscriberGender) {
		this.subscriberGender = subscriberGender;
	}
	public String getSubscriberEmailId() {
		return subscriberEmailId;
	}
	public void setSubscriberEmailId(String subscriberEmailId) {
		this.subscriberEmailId = subscriberEmailId;
	}
	public String getSubscriberGenerateNewAccount() {
		return subscriberGenerateNewAccount;
	}
	public void setSubscriberGenerateNewAccount(String subscriberGenerateNewAccount) {
		this.subscriberGenerateNewAccount = subscriberGenerateNewAccount;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
