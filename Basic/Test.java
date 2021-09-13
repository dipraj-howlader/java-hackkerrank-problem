package Basic;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Please enter total Box number :");
		
		int n = input.nextInt();		
		int x = 1;
		while(x <= n) {
			System.out.printf("Please enter %d no box Height, Width, Depth :", x);;
			double h = input.nextDouble();
			double w = input.nextDouble();
			double d = input.nextDouble();
			
			Box_Volume vol = new Box_Volume(h,w,d);
			
			vol.displayvol();
			x++;
		}
		
	
	}
}
