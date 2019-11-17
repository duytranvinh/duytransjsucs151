
public class BankAccount
{
	private double balance;
	
	public BankAccount(double b)
	{
		balance = b;
	}
	
	double getBalance()
	{
		return balance;
	}
	
    void deposit(double n)
    {
        balance += n;
    }
    
    void withdraw(double n)
    {
        balance -=n;
    }
}
