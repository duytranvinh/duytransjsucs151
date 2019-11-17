
public class hw4 implements Runnable
{
	private BankAccount account;
	private int REPETITIONS = 5;
	private int DELAY = 10;

	public hw4(BankAccount b){
		account = b;
	}
	public static void main(String[] args) {
		BankAccount anAccount = new BankAccount(100);
		hw4 t = new hw4(anAccount);
		Thread one = new Thread(t);
		Thread two = new Thread(t);
		one.setName("Customer #1");
		two.setName("Customer #2");
		System.out.println("Account Balance: $" + anAccount.getBalance());
		one.start();
		two.start();

	}
	@Override
	public void run()
	{
		try {
			for (int i = 0; i < REPETITIONS; i++)
			{
				unsynchronizedDeposit(20);
				unsynchronizedWithdraw(50);
				Thread.sleep(DELAY);
			}
			System.out.println("\nSynchronized methods");
			for (int i = 0; i < REPETITIONS; i++)
			{
				deposit(20);
				withdraw(50);
				Thread.sleep(DELAY);
			}

		}catch(InterruptedException e){}
	}
	private void  unsynchronizedDeposit(double amount){
		account.deposit(amount);
		System.out.println(Thread.currentThread().getName() +
				" deposits $" + amount + ", new balance is $" + account.getBalance());
	}

	private void unsynchronizedWithdraw(double amount){
		if (account.getBalance() >=amount){
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() +
					" withdraws $" + amount + ", new balance is $" + account.getBalance());
		}else{
			System.out.println("Unable to complete the requested task for " + Thread.currentThread().getName()
					+ " because there is not enough money in the account");
		}
	}

	private synchronized void withdraw(double amount){
		if (account.getBalance() >=amount){
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() +
					" withdraws $" + amount + ", new balance is " + account.getBalance());
		}else{
			System.out.println("Unable to complete the requested task for " + Thread.currentThread().getName()
					+ " because there is not enough money in the account");
		}
	}

	private synchronized void deposit(double amount){
		account.deposit(amount);
		System.out.println(Thread.currentThread().getName() +
				" deposits $" + amount + ", new balance is $" + account.getBalance());
	}
}

