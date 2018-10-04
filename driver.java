public class driver {
	public static void main(String[] args) {
		BankAccount zaibatsu = new BankAccount(58.42,8675309,"help me please");
		//Get ID & Balance
		System.out.println("Account Information for "+zaibatsu.getID());
		System.out.println("Your balance is: $" + zaibatsu.getBalance());
		//set new password
		zaibatsu.setPassword("ghostface killah");
		//display account information
		System.out.println(zaibatsu);
		//deposit 100$
		if (zaibatsu.deposit(100.00)) {
			System.out.println("Deposit succesful!");
			//display account information
			System.out.println(zaibatsu);	
		}
		else {
			System.out.println("Deposit failed.");
		}
		if (zaibatsu.withdraw(50.00)) {
			System.out.println("Withdrawal successful!");
			//display account information
			System.out.println(zaibatsu);
		}
		else {
			System.out.println("Withdrawal failed.");
		}
	}
}