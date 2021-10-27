package com.bankdemo.Beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Account {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private String accountType;
	 private long accountno;
	 private int balanace;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	 @JoinColumn(name = "cust_id")
	 @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	 private BankHolder  bankHolder;
	
	public Account()
	{
		
	}
	 public BankHolder getBankHolder() {
		return bankHolder;
	}
	public void setBankHolder(BankHolder bankHolder) {
		this.bankHolder = bankHolder;
	}
	
	 
	 public int getId() {
		return id;
	}
	public String getAccountType() {
		return accountType;
	}
	public String getAccountno() {
		return accountno;
	}
	public int getBalanace() {
		return balanace;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public void setBalanace(int balanace) {
		this.balanace = balanace;
	}
	
	 public Account(int id, String accountType, String accountno, int balanace, BankHolder bankHolder) {
			super();
			this.id = id;
			this.accountType = accountType;
			this.accountno = accountno;
			this.balanace = balanace;
			this.bankHolder = bankHolder;
		}
	
	 
}
