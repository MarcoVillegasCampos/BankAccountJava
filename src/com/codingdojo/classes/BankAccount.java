package com.codingdojo.classes;

public class BankAccount {

	public double checkingBalance=0;
	public double savingsBalance=0;
	public static int numOfAccounts = 0;
	public static double totalBalance = 0;

	public BankAccount() {
		numOfAccounts++;

	}

	public double getCheckingBalance() {
		return checkingBalance;
	}


	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public void depositChecking(BankAccount account, double amount) {
		account.checkingBalance+=amount;
		totalBalance+=amount;
		
		
	}
	
	public void  depositSavings(BankAccount account, double amount) {
		account.checkingBalance+=amount;
		totalBalance+=amount;
		
		
	}
	
	public void withDrawCheking(BankAccount account, double amount) {
		if (account.checkingBalance>amount) {
			account.checkingBalance-=amount;
			totalBalance-=amount;
			
			
		}else {
			System.out.println("No sufficient funds... Your balance is: " +account.checkingBalance);
		}
		
	}

	public void withDrawSavings(BankAccount account, double amount) {
		if (account.savingsBalance>amount) {
			account.savingsBalance-=amount;
			totalBalance-=amount;
		}else {
			System.out.println("No sufficient funds... Your balance is: " +account.savingsBalance);
		}
			
			
		}
	
	public void PrintTotalBalance() {
		
		double AllBalances=totalBalance;
		System.out.println(String.format("%.2f",AllBalances));
		
		
	}
		
	


}
