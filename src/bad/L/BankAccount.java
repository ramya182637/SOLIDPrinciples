package bad.L;

class BankAccount 
{
	protected String accountNumber;
    protected double balance;
    public BankAccount(String accountNumber, double balance) 
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //method to get the balance in bank account
    public double getBalance() 
    {
        return balance;
    }
    //method to do do money deposit into bank account
    public void deposit(double amount) 
    {
        balance += amount;
    }
    // Method to withdraw amount
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
    // Method to calculate interest
    public double calculateInterest()
    {
        // Default interest calculation rate
        return balance * 0.01; 
    }
}
