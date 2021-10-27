package com.bankdemo.Dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bankdemo.Beans.BankHolder;
@Repository
public class SubscriberImpl {
	private static final Logger logger = LoggerFactory.getLogger(SubscriberRepositoryImpl.class);
	@Autowired
	SubscriberRepository subscriberRepository;

	/*
	 * public BankHolder CreateAccount(BankHolder bankHolder) {
	 * 
	 * return bankHolder = subscriberRepository.save(bankHolder);
	 * 
	 * }
	 */
	
 public BankHolder CreateAccount(BankHolder bankHolder) {
		//BankHolder bankHolder = new BankHolder();
		//BeanUtils.copyProperties(bankRequestDto, bankHolder);
		return bankHolder =  subscriberRepository.save(bankHolder);
		
	}

	

}
