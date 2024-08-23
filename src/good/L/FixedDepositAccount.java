package good.L;

class FixedDepositAccount extends BankAccount
{
	// Term of the fixed deposit in months
	private int term; 
    public FixedDepositAccount(String accountNumber, double balance, int term) 
    {
        super(accountNumber, balance);
        this.term = term;
    }
    // Overriding  calculateInterest method for Fixed Deposit Account
    @Override
    public double calculateInterest()
    {
        // Fixed Deposit interest calculation based on term and balance
        if (term >= 12) 
        {
        	// 8% interest for fixed deposits over a year
            return balance * 0.08; 
        } 
        else 
        {
        	// 6% interest for fixed deposits under a year
            return balance * 0.06; 
        }
    }
    // Overriding the withdraw method with penalty for early withdrawal
    @Override
    public void withdraw(double amount)
    {
    	// 5% penalty for early withdrawal
        double penalty = balance * 0.05; 
        if (amount <= balance - penalty)
        {
            balance -= (amount + penalty);
        } 
        else 
        {
            System.out.println("Insufficient funds as penalty was added for early withdrawal");
        }
    }
}
