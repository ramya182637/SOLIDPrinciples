package good.L;

abstract class BankAccount 
{
	//Bank Account Variable Number and balance of account holders
	protected String accountNumber;
    protected double balance;
    //constructor initialization
    protected BankAccount(String accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //method to get Balance in an account
    public double getBalance() 
    {
        return balance;
    }
    //method to do add deposited amount to already existing balance in an account
    public void deposit(double amount)
    {
        balance += amount;
    }
    // Method to calculate interest
    public abstract double calculateInterest();
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
}
