package ExpressionHandaling;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		
		
		int count = 1;
		// decimal number formetting
		DecimalFormat ob = new DecimalFormat("0.0000");
		double la = 2.336645454;
		
		System.out.println(ob.format(la));
		
		do {
		try {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter number ONE :");
		
		int num1 = input.nextInt();
		
		System.out.println("Please enter number Two :");
				
		int num2 = input.nextInt();
				
		int result  = num1 / num2;
		
		System.out.println("Result : " + num1 + "/" + num2 + " = " + result);	
		count = 2;

		
		}
		catch(InputMismatchException e1) {
			System.out.println("Exception :" +e1);
			System.out.println("You must enter integer number, please try again");
		}
		catch(Exception e2) {
			System.out.println("Exception :" +e2);
			System.out.println("You must enter integer number, please try again");
		}
	

		}
		while(count == 1);
	
		
	}
}
