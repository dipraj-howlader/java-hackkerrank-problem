package Problem3;


public class SavingAccount {
	
	public static double annualInterestRate;   // for storing annual rate of all holder
	private double savingsBalance;          // indicating the amount the saver currently has on deposit
	
	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public static void modifyInterestRate(double annualInter) {
		annualInterestRate = annualInter;
		
	}
	
	public void calculateMonthlyInterest() {
		savingsBalance = savingsBalance + ((savingsBalance * annualInterestRate) / 12 );
		System.out.println(String.format("%.02f", savingsBalance));
	}
	


	
	
}
