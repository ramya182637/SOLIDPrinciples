package bad.L;

class CurrentAccount  extends BankAccount
{
	public CurrentAccount(String accountNumber, double balance) 
	{
        super(accountNumber, balance);
    }
    // Overriding the  calculateInterest method for Current Account
    @Override
    public double calculateInterest() 
    {
        // Current Account does not earn interest
        return 0; 
    }
    // Overriding withdraw method, no penalty
    @Override
    public void withdraw(double amount) 
    {
        if (amount <= balance)
        {
            balance -= amount;
        } 
        else 
        {
            System.out.println("Insufficient funds in the account");
        }
    }
}
