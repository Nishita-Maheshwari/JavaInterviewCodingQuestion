package corejava.program.fresher;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int s=0,org=n,r;
		
		while(n!=0) {
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		if(s==org) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
		
	
		


	}

}
