package com.bankdemo.Dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankdemo.Beans.BankHolder;
import com.bankdemo.Beans.BankRequestDto;
@Service
public class SubscriberRepositoryImpl  {
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
