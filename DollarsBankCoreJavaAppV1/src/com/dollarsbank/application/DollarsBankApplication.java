package com.dollarsbank.application;

import java.util.Scanner;

import com.dollarsbank.utility.BankFunctions;
import com.dollarsbank.utility.HeadersUtility;

public class DollarsBankApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HeadersUtility.welcomeMenu();
		String choice = scan.nextLine();

		while (!choice.matches("^[1-3]$")) {
			System.out.println("Try again.");
			HeadersUtility.welcomeMenu();
			selectFromWelcomeMenu(scan, choice);
			choice = scan.nextLine();
		}
		
		selectFromWelcomeMenu(scan, choice);	
		
		scan.close();
	}

	public static void selectFromWelcomeMenu(Scanner scan, String choice) {
		switch (choice) {
		case "1":
			System.out.println("Creating a new account");
			BankFunctions.createAcccount();
			break;
		case "2":
			System.out.println("Logging in");
			BankFunctions.login();
			break;
		case "3":
			System.out.println("Thank you for using this system. Goodbye.");
			break;
		default:
			System.out.println("Not a valid option! Try again!");
		}
	}
	
}