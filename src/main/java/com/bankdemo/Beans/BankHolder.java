package com.bankdemo.Beans;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class BankHolder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int     subscriberid;
	
	private String  subscriberFirstName;
	private String  subscriberLastName;
	private Date    subscriberDOB;
	private String  subscriberPanNo;
	private String  subscriberGender;
	private String  subscriberEmailId;
	private String  subscriberPhoneNo;
	@OneToMany( cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
	@JoinColumn(name="cust_Id")  
	private List<Account>  accList ;
	
	public BankHolder()
	{
		
	}
	
	//@OneToOne(cascade = CascadeType.ALL)
	//private FundFlowTransaction  fundFlowTransaction;
	//public FundFlowTransaction getFundFlowTransaction() {
	//	return fundFlowTransaction;
//	}

	//public void setFundFlowTransaction(FundFlowTransaction fundFlowTransaction) {
	//	this.fundFlowTransaction = fundFlowTransaction;
	//}

	
	public int getSubscriberid() {
		return subscriberid;
	}
	public List<Account> getAccList() {
		return accList;
	}
	public void setAccList(List<Account> accList) {
		this.accList = accList;
	}
	public void setSubscriberid(int subscriberid) {
		this.subscriberid = subscriberid;
	}
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
	public String getSubscriberPhoneNo() {
		return subscriberPhoneNo;
	}
	public void setSubscriberPhoneNo(String subscriberPhoneNo) {
		this.subscriberPhoneNo = subscriberPhoneNo;
	}
	
	public BankHolder(int subscriberid, String subscriberFirstName, String subscriberLastName, Date subscriberDOB,
			String subscriberPanNo, String subscriberGender, String subscriberEmailId, String subscriberPhoneNo,
			List<Account> accList) {
		super();
		this.subscriberid = subscriberid;
		this.subscriberFirstName = subscriberFirstName;
		this.subscriberLastName = subscriberLastName;
		this.subscriberDOB = subscriberDOB;
		this.subscriberPanNo = subscriberPanNo;
		this.subscriberGender = subscriberGender;
		this.subscriberEmailId = subscriberEmailId;
		this.subscriberPhoneNo = subscriberPhoneNo;
		this.accList = accList;
	}
	

}
