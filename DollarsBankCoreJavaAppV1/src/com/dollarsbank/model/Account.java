package com.dollarsbank.model;

public class Account {
	private String userId;
	private String password;
	private int balance;
	
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
		
	public void deposit(int amount) {
		
		if (amount > 0) {
			balance = balance + amount;
		} else {
			System.out.println("Invalid amount! Please enter an amount greater than 0.");
		}
		
	}
		
	public void withdraw(int amount) {
				
		if (amount < 0) {
			System.out.println("Cannot withdraw a negative amount!");
		} 
		else {
			balance = balance - amount;
		} 
		
	}
	
	public void transfer(int amount) {
		
	}

}