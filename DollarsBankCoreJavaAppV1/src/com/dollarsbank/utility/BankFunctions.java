package com.dollarsbank.utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.dollarsbank.connection.DatabaseConnectionManager;

public class BankFunctions {
	
	public static final Scanner input = new Scanner(System.in);
	public static int accCount = 0;
	
	public static void createAcccount() {
		HeadersUtility.createAccountHeader();
		System.out.println("Customer Name: ");
		String name = input.nextLine();
		
		System.out.println("Customer Address: ");
		String address = input.nextLine();
	
		System.out.println("Customer Contact Number: ");
		String contact = input.nextLine();
		// change to int later
		int contactNum = Integer.parseInt(contact);
		
		System.out.println("User ID: ");
		String username = input.nextLine();

		System.out.println("Password (8 characters with lower, upper, and special): ");
		String password = input.nextLine();

		System.out.println("Initial Deposit Amount: ");
		double iDeposit = input.nextDouble();
		
		try (Connection connection = DatabaseConnectionManager.getConnection()) {
			PreparedStatement createAcc = connection.prepareStatement("INSERT into customer values(null, ?, ?, ?)");
			PreparedStatement loginDetails = connection.prepareStatement("INSERT into account_info values(?, ?, ?, ?)");
			
			// Inserts information into customer table
			createAcc.setString(1, name);
			createAcc.setString(2, address);
			createAcc.setInt(3, contactNum);
			createAcc.execute();
			
			// Inserts information into account
			loginDetails.setInt(1, accCount++);
			loginDetails.setString(2, username);
			loginDetails.setString(3, password);
			loginDetails.setDouble(4, iDeposit);
			loginDetails.execute();
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Did not connect to database");
		}
		

//		try (Connection connection = DatabaseConnectionManager.getConnection()) {
//			PreparedStatement loginDetails = connection.prepareStatement("INSERT into acc_info values(null, ?, ?, ?)");
//			loginDetails.setString(1, username);
//			loginDetails.setString(2, password);
//			loginDetails.setDouble(3, iDeposit);
//		}
//		catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("Did not connect to database");
//		}
		
		
	}
	
	public static void login() {
		HeadersUtility.loginHeader();
		System.out.println("User ID: ");
		String username = input.nextLine();
		System.out.println("Password: ");
		String password = input.nextLine();
	}
	
//	public static void loginSelection() {
//		int choice = input.nextInt();
//		
//		switch (choice) {
//			case 1:
//				deposit(scan);
//				break;
//			case 2:
//				withdraw(scan);
//				break;
//			case 3:
//				transferFunds(scan);
//				break;
//			case 4:
//				transactions(scan);
//				break;
//			case 5:
//				displayInfo(user);
//				break;
//			case 6:
//				HeadersUtility.welcomeMenu();
//				break;
//			default:
//				System.out.println("Not a valid option! Try again");
//		}
//	}

}
