package good.L;

class SavingsAccount extends BankAccount
{
	public SavingsAccount(String accountNumber, double balance) 
	{
        super(accountNumber, balance);
    }
    // Overriding calculateInterest method for Savings Account
    @Override
    public double calculateInterest() 
    {
        // 5 percent interest rate for Savings Account
        return balance * 0.05; 
    }
}
