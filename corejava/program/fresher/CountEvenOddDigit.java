package corejava.program.fresher;

import java.util.Scanner;

public class CountEvenOddDigit {
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter number  ");
		int n =sc.nextInt();
		
		int even_count=0;
		int odd_count=0;
		
		while(n!=0) {
			int r=n%10;
			
			if(r%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			
			n=n/10;
			
			
	
		}
		
		System.out.println("number of even digit  " + even_count);
		System.out.println("number of odd digit  " + odd_count);
				
	}

}
