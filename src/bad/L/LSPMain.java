package bad.L;

import java.util.Scanner;

public class LSPMain 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter amount to save in savings account :");
		BankAccount savingsAccount = new SavingsAccount("SA001", sc.nextDouble());
		System.out.println("Enter amount to save in current account :");
        BankAccount currentAccount = new CurrentAccount("CA001", sc.nextDouble());
        System.out.println("Enter amount to deposit in fixed deposit account and for term of fixed deposit :");
        BankAccount fixedDepositAccount = new FixedDepositAccount("FDA001", sc.nextDouble(), sc.nextInt());
        
        // Performing interest calculation for accounts
        double savingsInterest = savingsAccount.calculateInterest();
        double currentInterest = currentAccount.calculateInterest();
        double fdInterest = fixedDepositAccount.calculateInterest();
        
        // Displaying interest for bank accounts
        System.out.println("Interest for Savings Account: " + savingsInterest);
        System.out.println("Interest for Current Account: " + currentInterest);
        System.out.println("Interest for Fixed Deposit Account: " + fdInterest);
        
        // Performing the withdrawals on accounts
        System.out.println("Enter the amount to withdraw from savings account :");
        savingsAccount.withdraw(sc.nextDouble());
        System.out.println("Balance of Savings Account after withdrawal: " + savingsAccount.getBalance());
        
        System.out.println("Enter amount to withdraw from current account :");
        currentAccount.withdraw(sc.nextDouble());
        System.out.println("Balance of Current Account after withdrawal: " + currentAccount.getBalance());

        System.out.println("Enter amount to withdraw from fixed deposit account :");
        fixedDepositAccount.withdraw(sc.nextDouble());
        System.out.println("Balance of Fixed Deposit Account after withdrawal: " + fixedDepositAccount.getBalance());
        sc.close();
	}
}
