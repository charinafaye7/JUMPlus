package com.dollarsbank.utility;

public class HeadersUtility {
	public static void welcomeMenu() {
		System.out.println(ConsoleColors.YELLOW + "+---------------------------+");
		System.out.println("| DOLLARSBANK Welcomes You! |");
		System.out.println("+---------------------------+" + ConsoleColors.RESET);
		System.out.println("1. Create New Account");
		System.out.println("2. Login");
		System.out.println("3. Exit");
		System.out.println(ConsoleColors.CYAN + "Enter Choice (1, 2, or 3):" + ConsoleColors.RESET);
	}
	
	public static void loginMenu() {
		System.out.println(ConsoleColors.YELLOW + "+---------------------+");
		System.out.println("| Welcome Customer!!! |");
		System.out.println("+---------------------+" + ConsoleColors.RESET);
		System.out.println("1. Deposit Amount");
		System.out.println("2. Withdraw Amount");
		System.out.println("3. Funds Transfer");
		System.out.println("4. View 5 Recent Transactions");
		System.out.println("5. Display Customer Information");
		System.out.println("6. Sign Out");
		System.out.println(ConsoleColors.CYAN + "Enter Choice (1, 2, 3, 4, 5, or 6):" + ConsoleColors.RESET);
	}
	
	public static void loginHeader() {
		System.out.println(ConsoleColors.YELLOW + "+---------------------+");
		System.out.println("| Enter Login Details |");
		System.out.println("+---------------------+" + ConsoleColors.RESET);
	}
	
	public static void createAccountHeader() {
		System.out.println(ConsoleColors.YELLOW + "+-------------------------------+");
		System.out.println("| Enter Details For New Account |");
		System.out.println("+-------------------------------+" + ConsoleColors.RESET);
	}
	
	public static void depositHeader() {
		System.out.println(ConsoleColors.YELLOW + "+----------------+");
		System.out.println("| Deposit Amount |");
		System.out.println("+----------------+" + ConsoleColors.RESET);
	}
	
	public static void withdrawHeader() {
		System.out.println(ConsoleColors.YELLOW + "+-----------------+");
		System.out.println("| Withdraw Amount |");
		System.out.println("+-----------------+" + ConsoleColors.RESET);
		System.out.println(ConsoleColors.CYAN + "Amount to withdraw: " + ConsoleColors.RESET);
	}
	
	public static void transferHeader() {
		System.out.println(ConsoleColors.YELLOW + "+----------------+");
		System.out.println("| Funds Transfer |");
		System.out.println("+----------------+" + ConsoleColors.RESET);
	}
	
	public static void transactionsHeader() {
		System.out.println(ConsoleColors.YELLOW + "+-----------------------+");
		System.out.println("| 5 Recent Transactions |");
		System.out.println("+-----------------------+" + ConsoleColors.RESET);
	}
	
	public static void displayInfoHeader() {
		System.out.println(ConsoleColors.YELLOW + "+----------------------+");
		System.out.println("| Customer Information |");
		System.out.println("+----------------------+" + ConsoleColors.RESET);
	}
}
