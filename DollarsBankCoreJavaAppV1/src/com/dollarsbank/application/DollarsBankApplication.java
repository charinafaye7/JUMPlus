package com.dollarsbank.application;

import java.util.Scanner;

import javax.xml.transform.Templates;

import com.dollarsbank.utility.BankFunctions;
import com.dollarsbank.utility.HeadersUtility;

public class DollarsBankApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HeadersUtility.welcomeMenu();
		String choice = scan.nextLine();
		// scan.nextLine();
		//do {
		while (!choice.matches("^[1-3]$")) {
			System.out.println("Try again.");
			HeadersUtility.welcomeMenu();
			selectFromWelcomeMenu(scan, choice);
			choice = scan.nextLine();
		}
		
		selectFromWelcomeMenu(scan, choice);
		
		//} while (choice != 1 || choice != 2 || choice != 3); 
				
		scan.close();
}

	public static void selectFromWelcomeMenu(Scanner scan, String choice) {
		// int input = Integer.parseInt(choice);
		switch (choice) {
		case "1":
			//BankFunctions.createAcccount();
//			// userList.entrySet().stream().forEach(c -> System.out.println(c));
//			// System.out.println(user.toString());
			System.out.println("Creating a new account");
			BankFunctions.createAcccount();
			break;
		case "2":
			//BankFunctions.login();
			HeadersUtility.loginMenu();
//			selectFromLoginMenu(scan, choice);
			System.out.println("Logging in");
			break;
		case "3":
			System.out.println("Thank you for using this system. Goodbye.");
			break;
		default:
			System.out.println("Not a valid option! Try again!");
		}
	}
//	
//	public static void login(Scanner scan) {
//		HeadersUtility.loginHeader();
//		System.out.println("User ID: ");
//		String sInput = scan.next();
//		System.out.println("Password: ");
//		scan.nextLine();
//		sInput = scan.nextLine();
//	}
//
//	public static void selectFromLoginMenu(Scanner scan, int choice) {
//		switch (choice) {
//		case 1:
//			deposit(scan);
//			break;
//		case 2:
//			withdraw(scan);
//			break;
//		case 3:
//			transferFunds(scan);
//			break;
//		case 4:
//			transactions(scan);
//			break;
//		case 5:
//			//displayInfo(user);
//			break;
//		case 6:
//			welcomeMenu();
//			break;
//		default:
//			System.out.println("Not a valid option! Try again");
//		}
//	}
//
//	public static Customer createAcccount() {
//		HeadersUtility.createAccountHeader();
//		System.out.println("Customer Name: ");
//		String sInput = scan.nextLine();
//		String name = sInput;
//		user.setName(name);
		
//		System.out.println("Customer Address: ");
//		scan.nextLine();
//;		sInput = scan.next();
//		String address = sInput;
//		user.setAddress(address);
//		
//		System.out.println("Customer Contact Number: ");
//		scan.nextLine();
//		int iInput = scan.nextInt();
//		int contactNum = iInput;
//		user.setContact(contactNum);
//		
//		System.out.println("User ID: ");
//		scan.nextLine();
//		String username = scan.nextLine();
//		// user.setUserId(username);
//		user.getAccount().setUserId(username);
//		
//		System.out.println("Password (8 characters with lower, upper, and special): ");
//		String password = scan.nextLine();
//		user.acc
//		//user.setPassword(password);
//		
//		System.out.println("Initial Deposit Amount: ");
//		int iDeposit = scan.nextInt();
//		//user.setIntialDeposit(iDeposit);
//		
//		userList.put(user.getAccount().getUserId(), user);
//		
//	}
//	
//
//		
//	public static void deposit(Scanner scan) {
//		HeadersUtility.depositHeader();
//	}
//	
//	public static void withdraw(Scanner scan) {
//		HeadersUtility.withdrawHeader();
//		double withdrawAmt = scan.nextDouble();
//		if(withdrawAmt > 0 && withdrawAmt <)
//		
//		
//	}
//	
//	public static void transferFunds(Scanner scan) {
//		HeadersUtility.transferHeader();
//	}
//	
//	public static void transactionsHeader(Scanner scan) {
//		HeadersUtility.transactionsHeader();;
//	}
//	
//	public static void displayInfo(Customer user) {
//		HeadersUtility.displayInfoHeader();
//		System.out.println("Name: " + user.nameToString());
//		System.out.println("Address: " + user.getAddress());
//		System.out.println("Contact Number " + user.getContact());
//		System.out.println("User ID: " + user.getUserId());
//		System.out.println("Amount: ");
//
//	}
//	
//	
	
	
	
	// Customer user = new Customer(ANSI_CYAN, ANSI_CYAN, ANSI_YELLOW, 0,
	// ANSI_RESET, ANSI_CYAN);
	// System.out.println("Initial Deposit Amount in account [" + user.getUserId ]
	// ");

}
