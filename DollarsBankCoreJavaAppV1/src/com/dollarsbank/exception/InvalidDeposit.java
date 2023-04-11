package com.dollarsbank.exception;

public class InvalidDeposit extends Exception {
	private static final long serialVersionUID = 1L;
	
	public InvalidDeposit() {
		super("Deposit must be greate than 0!");
	}

}