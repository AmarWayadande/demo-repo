package com.bankdemo.Controller;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bankdemo.Beans.Account;
import com.bankdemo.Beans.BankHolder;
import com.bankdemo.Beans.BankRequestDto;
import com.bankdemo.Beans.FundFlowTransaction;
import com.bankdemo.Manager.SubscriberService;

@RestController
public class SubsciberController {

	
	private static final Logger logger = LoggerFactory.getLogger(SubsciberController.class);
	@Autowired
	SubscriberService subscriberService;

	
	  @PostMapping("/subscriberRegistration") 
	  public BankHolder createNewAccount(@RequestBody BankHolder bankHolder) {
	   logger.info("createNewAccount");

	      return subscriberService.CreateNewAccount(bankHolder);	 
	  }
	
	@PostMapping("/fundTransfer")
	public FundFlowTransaction FundTransfer(@RequestParam String fromAcc ,@RequestParam String toAcc, @RequestParam int amount,@RequestParam String desc )
	{
		
		 logger.info("fundTransfer");
		FundFlowTransaction  fundFlowTransaction = new FundFlowTransaction();
		
		fundFlowTransaction.setFromAccount(fromAcc);
		fundFlowTransaction.setToAccount(toAcc);
		fundFlowTransaction.setAmount(amount);
		fundFlowTransaction.setDescription(desc);
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	     LocalDate localDate = LocalDate.now();
		 fundFlowTransaction.setDate(Date.valueOf(localDate));
		 return subscriberService.FundTransfer(fundFlowTransaction);
	}
	
	@GetMapping("/yearmonthWiseStatement")
	public List<FundFlowTransaction> gelAllyearmonthwiseStatement(@RequestParam int year ,@RequestParam int month)
	{
	  logger.info("year Month statement");
	  return subscriberService.getRecordsByMonthYear(year, month);
	}
	
	@GetMapping("getAll")
	public List<FundFlowTransaction> getAll()
	{
	  return subscriberService.getAll();
	}
	
	
	
}
