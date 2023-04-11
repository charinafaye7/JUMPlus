package com.dollarsbanks.dao;

import java.util.List;

import com.dollarsbank.model.Account;

public interface AccountDAO {
	public List<Account> getAllCustomers();
	
	public Account getAccountById(String username);
	
    public boolean createAccount(String username, String password, double iDeposit);
    
    public boolean validAccount(Account account);
    
    public boolean updateAccount(Account account);
}
