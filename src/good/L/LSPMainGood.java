package good.L;

import java.util.Scanner;

public class LSPMainGood 
{
	public static void main(String[] args)
	{
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the amount to save in the savings account :");
		    BankAccount savingsAccount = new SavingsAccount("SA001", sc.nextDouble());
		    System.out.println("Enter the amount to save in the current account :");
	        BankAccount currentAccount = new CurrentAccount("CA001", sc.nextDouble());
	        System.out.println("Enter the amount to deposit in the Fixed Deposit account and how many months i.e term :");
	        BankAccount fixedDepositAccount = new FixedDepositAccount("FDA001", sc.nextDouble(),sc.nextInt());
	        
	        // Performing interest calculation on bank accounts
	        double savingsInterest = savingsAccount.calculateInterest();
	        double currentInterest = currentAccount.calculateInterest();
	        double fdInterest = fixedDepositAccount.calculateInterest();
	        
	        // Displaying the interest calculated above
	        System.out.println("Interest for Savings Account: " + savingsInterest);
	        System.out.println("Interest for Current Account: " + currentInterest);
	        System.out.println("Interest for Fixed Deposit Account: " + fdInterest);
	        
	        // Performing withdrawals on the bank accounts
	        System.out.println("Enter the Amount to withdraw from savings account :");
	        savingsAccount.withdraw(sc.nextDouble());
	        System.out.println("Balance of Savings Account after withdrawal: " + savingsAccount.getBalance());
	        System.out.println("Enter the amount to withdraw from current account :");
	        currentAccount.withdraw(sc.nextDouble());
	        System.out.println("Balance of Current Account after withdrawal: " + currentAccount.getBalance());
	        // Attempting to withdraw from a fixed deposit
	        System.out.println("Enter the amount to withdraw from fixed deposit in early :");
	        fixedDepositAccount.withdraw(sc.nextDouble()); 
	        System.out.println("Balance of Fixed Deposit Account after withdrawal: " + fixedDepositAccount.getBalance());
	        sc.close();
	}
}
