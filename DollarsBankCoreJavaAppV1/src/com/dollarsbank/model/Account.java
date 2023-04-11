package com.dollarsbank.model;

import com.dollarsbank.exception.InvalidDeposit;
import com.dollarsbank.exception.InvalidWithdraw;

public class Account {
	private String userId;
	private String password;
	private float funds;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		
	public void deposit(float amount) {
		try {
			
			if (amount < 0) {
				throw new InvalidDeposit();
			} 
			
			this.funds += amount;	
			
		} catch (InvalidDeposit e) {
			System.out.println("Invalid amount! Please enter an amount greater than 0.");
		}
		
	}
		
	public void withdraw(float amount) {
		
		try {
			
			if (this.funds < amount) {
				throw new InvalidWithdraw();
			} 
			
			this.funds -= amount;	
			
		} catch (InvalidWithdraw e) {
			System.out.println("Insufficiant funds!");
		}
		
	}
	
	public void transfer(int amount) {
		
	}

}