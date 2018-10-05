public class driver {
	public static void main(String[] args) {
		BankAccount zaibatsu = new BankAccount(58.42,8675309,"help me please");
		BankAccount pool = new BankAccount(692.1, 555555, "help me please");
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
		if (pool.transferTo(zaibatsu,40,"help me please")) {
			System.out.println("Transfer successful.");
		}
		else {
			System.out.println("Transfer failed");
		}
		System.out.println(pool);
		System.out.println(zaibatsu);
	}
}