package com.account;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int entry=0;
		AccountService accountService = new AccountService();
		do {
			System.out.println("Menu");
			System.out.println("1.Add account details");
       	 System.out.println("2.Remove account");
       	 System.out.println("3.Display account details with account number");
       	 System.out.println("4.display all accounts");
       	 System.out.println("5.Display account whose balance is less than 1000");;
       	 System.out.println("6.Exit");
			Scanner sc = new Scanner(System.in);
			entry = sc.nextInt();
			switch(entry) {
			case 1:System.out.println("Enter Account no");
					int accNo=sc.nextInt();
					System.out.println("enter account name:");
					String name=sc.next();
					System.out.println("enter accBalance");
					int accbalance= sc.nextInt();
				try {
					accountService.addAccount(new Account(accNo,name,accbalance));
				} catch (AccountAlreadyException e) {
					System.out.println("Duplicate account number is entered");
				}
					break;
			case 2: System.out.println("Enter account no:");
				try {
					accountService.removeAccount(sc.nextInt());
					System.out.println("Account successfully removed");
				} catch (AccountNotFoundException e) {
					System.out.println("Account number does not exist");
				}
					break;
			case 3: System.out.println("Enter account number to get account details");
				try {
					accountService.getAccountByNo(sc.nextInt());
				} catch (AccountNotFoundException e) {
					System.out.println("Account does not exist");
				}
					break;
			case 4: accountService.getAllaccounts();
					break;
			case 5:accountService.getAccountswitchLowBalnce();
					break;
			
			}
		}while(entry!=6);
	}



}
