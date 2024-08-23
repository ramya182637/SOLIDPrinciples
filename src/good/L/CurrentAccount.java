package good.L;

class CurrentAccount extends BankAccount
{
	public CurrentAccount(String accountNumber, double balance) 
	{
        super(accountNumber, balance);
    }
    // Overriding calculateInterest method for Current Account
    @Override
    public double calculateInterest() 
    {
        // Current Account does not earn interest
        return 0;
    }

}
