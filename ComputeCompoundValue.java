// A simple program to display the account value after sixth months

class ComputeCompoundValue {
	public static void main(String[] args) {
		double monthlyDeposit = 100;
		double monthlyInterestRate  = 0.05 / 12; 
		double accountBalance = 0;
		
		// 1st month
		accountBalance = (accountBalance + monthlyDeposit) * 
				(1 + monthlyInterestRate);
		// 2nd month
		accountBalance = (accountBalance + monthlyDeposit) * 
				(1 + monthlyInterestRate);
		// 3rd month
		accountBalance = (accountBalance + monthlyDeposit) * 
				(1 + monthlyInterestRate);
		// 4th month
		accountBalance = (accountBalance + monthlyDeposit) * 
				(1 + monthlyInterestRate);
		// 5th month
		accountBalance = (accountBalance + monthlyDeposit) * 
				(1 + monthlyInterestRate);
		// 6th month
		accountBalance = (accountBalance + monthlyDeposit) * 
				(1 + monthlyInterestRate);
		
		System.out.print("Account balance: " + accountBalance);
	}
}