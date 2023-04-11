package com.dollarsbank.exception;

public class InvalidWithdraw extends Exception {
	private static final long serialVersionUID = 1L;
		
	public InvalidWithdraw() {
		super("Do not have enough money. Withdraw a valid amount");
	}

}