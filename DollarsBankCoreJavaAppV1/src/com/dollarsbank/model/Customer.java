package com.dollarsbank.model;

public class Customer {
	private String name;
	private String address;
	private int contact;
	private Account account;

	public Customer() {
		name = "";
		address = "";
		contact = 0;
	}
	
	public Customer(String name, String address, int contact, Account account) {
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", contact=" + contact
				+ "]";
	}
	
}
