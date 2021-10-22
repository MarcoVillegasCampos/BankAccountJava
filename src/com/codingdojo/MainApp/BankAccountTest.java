package com.codingdojo.MainApp;
import com.codingdojo.classes.*;

public class BankAccountTest {

	public static void main(String args[]) {
		
		BankAccount account1=new BankAccount();
		
		account1.depositChecking(account1, 1000.35);
		account1.depositSavings(account1, 10000);
		
		account1.withDrawCheking(account1,5000);
		account1.withDrawSavings(account1, 5000);
		
		account1.PrintTotalBalance();
		
		
		
		
		
		
	}
}
