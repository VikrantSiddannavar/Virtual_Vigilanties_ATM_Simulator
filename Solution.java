package com.icici;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		System.out.println("Welcome to the State Bank of INDIA");
		System.out.println("==================================");

		Scanner scan = new Scanner(System.in);
		Bank bank = new BankImple(5000);

		while(true) {
			System.out.println("Enter your Choice");
			System.out.println("1: Diposit Amount\n2: Withdraw Amount\n3: Avail Balance\n4: Exit");

			int choice =scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the amount to be Deposited");
				int amountToDeposit = scan.nextInt();
				bank.deposit(amountToDeposit);
				break;
				
			case 2:
				System.out.println("Enter the amount to be Withdrawn");
				int amountToWithdrawn = scan.nextInt();
				bank.withdraw(amountToWithdrawn);
				break;
				
			case 3:
				System.out.println("Available Balance : ₹"+ bank.getBalance());
				break;
				
			case 4:
				System.out.println("THANK YOU\nVISIT AGAIN");
				System.exit(0);
			
			default:
				try {
					throw new Exception("Invalid choice, Kindly enter valid choice");
				} catch (Exception e){
					System.out.println(e.getMessage());
				}
			}
			System.out.println("=========================================");
		}
	}
}
