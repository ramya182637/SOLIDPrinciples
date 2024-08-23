package bad.L;

class SavingsAccount extends BankAccount
{
	public SavingsAccount(String accountNumber, double balance) 
	{
        super(accountNumber, balance);
    }
    // Overriding the calculateInterest method for Savings Account
    @Override
    public double calculateInterest() 
    {
        // 5 percent interest rate for Savings Account
        return balance * 0.05; 
    }
    // Overriding the  withdraw method
    @Override
    public void withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
        } 
        else 
        {
            System.out.println("Insufficient funds in the account ");
        }
    }
}
