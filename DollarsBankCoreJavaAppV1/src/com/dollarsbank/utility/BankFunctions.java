package com.dollarsbank.utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.dollarsbank.connection.DatabaseConnectionManager;

public class BankFunctions {

	public static final Scanner input = new Scanner(System.in);
	public static int accCount = 0;
	public static String user = " ";

	public static void createAcccount() {
		HeadersUtility.createAccountHeader();
		System.out.println("Customer Name: ");
		String name = input.nextLine();

		System.out.println("Customer Address: ");
		String address = input.nextLine();

		System.out.println("Customer Contact Number: ");
		String contact = input.nextLine();
		int contactNum = Integer.parseInt(contact);

		System.out.println("User ID: ");
		String username = input.nextLine();

		System.out.println("Password (8 characters with lower, upper, and special): ");
		String password = input.nextLine();

		System.out.println("Initial Deposit Amount: ");
		double iDeposit = input.nextDouble();

		try (Connection connection = DatabaseConnectionManager.getConnection()) {
			PreparedStatement createAcc = connection.prepareStatement("INSERT INTO customer VALUES(null, ?, ?, ?)");
			PreparedStatement loginDetails = connection.prepareStatement("INSERT INTO account_info VALUES(?, ?, ?, ?)");

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
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Did not connect to database");
		}

	}

	public static boolean login() {
		HeadersUtility.loginHeader();
		System.out.println("User ID: ");
		String username = input.nextLine();
		System.out.println("Password: ");
		String password = input.nextLine();

		try (Connection connection = DatabaseConnectionManager.getConnection()) {
			Statement query = connection.createStatement();
			ResultSet queryResult = query.executeQuery("Select user_id, user_pass FROM account_info ");

			while (queryResult.next()) {
				String userLogin = queryResult.getString("user_id");
				String userPw = queryResult.getString("user_pass");

				if (userLogin.equals(username) && userPw.equals(password)) {
					HeadersUtility.loginMenu();
					loginSelection();
					return true;
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Did not connect to database");
		}

		System.out.println("Incorrect username or password");
		return false;

	}

	public static void loginSelection() {

		int choice = input.nextInt();

		switch (choice) {
		case 1:
			HeadersUtility.depositHeader();
			// deposit();
			break;
		case 2:
			HeadersUtility.withdrawHeader();
			// withdraw();
			break;
		case 3:
			HeadersUtility.transferHeader();
			// transferFunds();
			break;
		case 4:
			HeadersUtility.transactionsHeader();
			// transactions();
			break;
		case 5:
			HeadersUtility.displayInfoHeader();
			// displayInfo();
			break;
		case 6:
			// HeadersUtility.welcomeMenu();
			break;
		default:
			System.out.println("Not a valid option! Try again");

		}
	}

}
