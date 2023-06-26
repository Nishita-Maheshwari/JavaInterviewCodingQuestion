package corejava.program.fresher;

import java.util.Scanner;

public class CountSumOfDigit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number ");
		int n=sc.nextInt();
		
		
		int s=0,r;
		
		
		while(n!=0) {
			r=n%10;
			s=s+r;
			n=n/10;
					
				
			
		}
		
		System.out.print("Sum of Digit in a number "+s);
	}

}
