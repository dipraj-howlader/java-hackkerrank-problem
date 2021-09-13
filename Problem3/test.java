package Problem3;

public class test {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		SavingAccount saver1 = new SavingAccount();
		SavingAccount saver2 = new SavingAccount();
		saver1.setSavingsBalance(2000.00);
		saver2.setSavingsBalance(3000.00);
		for (int i = 1; i <= 12; i++) {
			SavingAccount.annualInterestRate = 0.04;
			System.out.printf("Saver1 %d month : ",i);
			saver1.calculateMonthlyInterest();
			System.out.printf("Saver2 %d month : ",i);
			saver2.calculateMonthlyInterest();
		}
	
//		saver1.setSavingsBalance(2000.00);
		System.out.println("Next month for saver1 : ");
		SavingAccount.annualInterestRate = 0.05;
		saver1.calculateMonthlyInterest();
		
		System.out.println("Next month for saver2 : ");
//		saver2.setSavingsBalance(3000.00);
		SavingAccount.annualInterestRate = 0.05;
		saver2.calculateMonthlyInterest();
		
		

		
	}

	
}
