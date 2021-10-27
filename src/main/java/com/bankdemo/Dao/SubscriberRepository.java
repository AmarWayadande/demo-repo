package com.bankdemo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bankdemo.Beans.BankHolder;
@Repository
public interface SubscriberRepository extends JpaRepository<BankHolder, Integer> {

}
