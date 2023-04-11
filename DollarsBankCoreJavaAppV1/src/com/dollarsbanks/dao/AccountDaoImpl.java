package com.dollarsbanks.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dollarsbank.connection.DatabaseConnectionManager;
import com.dollarsbank.model.Customer;

public class AccountDaoImpl {
	
	private Connection connect = DatabaseConnectionManager.getConnection();
	private static int accCount = 0;
	
	public boolean createAccount(String username, String password, double iDeposit) {
		try {
			PreparedStatement loginDetails = connect.prepareStatement("INSERT INTO account_info VALUES(?, ?, ?, ?)");
				
			// Inserts information into account table
			loginDetails.setInt(1, accCount++);
			loginDetails.setString(2, username);
			loginDetails.setString(3, password);
			loginDetails.setDouble(4, iDeposit);
			
			loginDetails.execute();
			
			loginDetails.close();
			return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Did not connect to database");
			return false;
		}
	}
	
	
//	public boolean createAccount(String username, String password, double iDeposit) {
//		try (Connection connection = DatabaseConnectionManager.getConnection()) {
//			PreparedStatement createAcc = connection.prepareStatement("INSERT into customer values(null, ?, ?, ?)");
//			PreparedStatement loginDetails = connection.prepareStatement("INSERT into account_info values(?, ?, ?, ?)");
//			
//			// Inserts information into customer table
//			createAcc.setString(1, name);
//			createAcc.setString(2, address);
//			createAcc.setInt(3, contactNum);
//			createAcc.execute();
//			
//			// Inserts information into account table
//			loginDetails.setInt(1, accCount++);
//			loginDetails.setString(2, username);
//			loginDetails.setString(3, password);
//			loginDetails.setDouble(4, iDeposit);
//			loginDetails.execute();
//		}
//		catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("Did not connect to database");
//		}
//	}
	
	
	
		
}
