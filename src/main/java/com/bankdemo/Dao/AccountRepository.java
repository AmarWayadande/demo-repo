package com.bankdemo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankdemo.Beans.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
