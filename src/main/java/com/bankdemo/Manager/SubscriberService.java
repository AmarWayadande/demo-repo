package com.bankdemo.Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankdemo.Beans.Account;
import com.bankdemo.Beans.BankHolder;
import com.bankdemo.Beans.BankRequestDto;
import com.bankdemo.Beans.FundFlowTransaction;
import com.bankdemo.Dao.FundRepositoryImpl;
import com.bankdemo.Dao.SubscriberRepositoryImpl;

@Service
public class SubscriberService {
	
	private static final Logger logger = LoggerFactory.getLogger(SubscriberService.class);
	@Autowired
	SubscriberRepositoryImpl subscriberRepositoryImpl;
	
	@Autowired
	FundRepositoryImpl fundRepositoryImpl;
	
	public BankHolder CreateNewAccount(BankHolder bankHolder)
	{
		//Random rd = new Random();
		//String acNo = String.valueOf(rd.nextInt());
		//Account acc =  new Account();
		//acc.setAccountno(acNo);; 
		//bankHolder.getAccList().get(1).setAccountno(acNo);
		//bankHolder.setSubscriberGenerateNewAccount(Optional.ofNullable(acNo) == null ? "" : acNo );
		 
		       subscriberRepositoryImpl.CreateAccount(bankHolder);
		return bankHolder;
		
	}
	
	/*
	 * public BankHolder CreateNewAccount(BankRequestDto bankRequestDto) { Random rd
	 * = new Random(); String acNo = "hcl"+rd.nextInt();
	 * bankRequestDto.setSubscriberGenerateNewAccount(Optional.ofNullable(acNo) ==
	 * null ? "" : acNo ); subscriberRepositoryImpl.CreateAccount(bankRequestDto);
	 * return bankHolder;
	 * 
	 * }
	 */

	public FundFlowTransaction FundTransfer(FundFlowTransaction fundFlowTransaction) {

		return fundRepositoryImpl.FundTransfer(fundFlowTransaction);
		
	}
	
	public List<FundFlowTransaction> getRecordsByMonthYear(int year ,int month) {
       
		return fundRepositoryImpl.getRecordsByMonthYear(year, month);
		
	}
	

	public List<FundFlowTransaction> getAll() {
    
			return fundRepositoryImpl.getAll();
			
		}

	

}
