package com.bankdemo.Dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankdemo.Beans.FundFlowTransaction;
@Service
public class FundRepositoryImpl {
	private static final Logger logger = LoggerFactory.getLogger(FundRepositoryImpl.class);
	@Autowired
	FundTransferRepository  fundTransferRepository;
	
     public FundFlowTransaction FundTransfer(FundFlowTransaction fundFlowTransaction) {
    	
		return fundTransferRepository.save(fundFlowTransaction);
	}
	
	/*
	 * public FundFlowTransaction FundTransfer1(FundFlowTransaction
	 * fundFlowTransaction) {
	 * 
	 * FundFlowTransaction fundFlowTransaction1 =
	 * fundTransferRepository.save(fundFlowTransaction);
	 * if(fundFlowTransaction1.getId().) return fundFlowTransaction1; }
	 */
	
	
	 public List<FundFlowTransaction> getRecordsByMonthYear(int year ,int month) {
	 return fundTransferRepository.findByMonthYear(year, month); }
	 
     
     public List<FundFlowTransaction> getRecordsByMonthYear1(int year ,int month) { 
    	 List<FundFlowTransaction> fundList =  fundTransferRepository.findByMonthYear(year, month);
			/*
			 * if(!fundList.isEmpty()) { fundTransferRepository.updateReBalance(null, null);
			 * }
			 */
    	 return fundList ;
		 }
	
	
     
     
 	 public List<FundFlowTransaction> getAll() 
 	 {
 		 return fundTransferRepository.findAll();
 		 }

 	 
}
