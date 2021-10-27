package com.bankdemo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bankdemo.Beans.BankHolder;
import com.bankdemo.Beans.FundFlowTransaction;
@Repository
public interface FundTransferRepository extends JpaRepository<FundFlowTransaction, Integer> {
	
	
	 @Query(value=" from FundFlowTransaction f where YEAR(f.date) =:year and month(f.date) =:month") 
	 List<FundFlowTransaction> findByMonthYear( int year , int month);
	 
	 
		/*
		 * @Modifying
		 * 
		 * @Query(
		 * value="update BankHolder u set  u.balance=: amount where u.subscriberGenerateNewAccount=: accNo"
		 * ) public void updateReBalance(String amount ,String accNo);
		 */
	 

}
