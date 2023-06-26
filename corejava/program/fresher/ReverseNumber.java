package corejava.program.fresher;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the number ");
		int n =sc.nextInt();
		
		int s=0, rev;
		
		while(n!=0) {
			rev=n%10;
			s=s*10+rev;
			n=n/10;							
		}
		
		System.out.println("reverse number "+s);
		

	}

}
