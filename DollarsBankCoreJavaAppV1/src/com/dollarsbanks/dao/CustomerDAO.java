package com.dollarsbanks.dao;

import java.util.List;

import com.dollarsbank.model.Customer;

public interface CustomerDAO {
	public List<Customer> getAllCustomers();
	
	public Customer getCustomerById();
	
	public Customer getCustomerByName(String custName);
	
    public boolean addCustomer(Customer cust);
    
    public boolean deleteCustomer(int custId);
    
    public boolean updateCustomer(Customer cust);
}
