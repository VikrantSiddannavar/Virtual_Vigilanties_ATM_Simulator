package com.icici;

public class BankImple implements Bank {
	int balance;
	public BankImple(int balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Depositing : ₹" + amount);
		balance += amount;
		System.out.println("Amount deposited Successfully");
	}

	@Override
	public void withdraw(int amount) {
		
		if (amount <= balance) {
			System.out.println("Withdrawing : ₹"+amount);
			balance -= amount;
			System.out.println("Amount withdrawed Successfully");
		} else {
			try {
				throw new InsufficientBalanceException ("Insufficient Balance");
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public int getBalance() {
		return balance;
	}

}
