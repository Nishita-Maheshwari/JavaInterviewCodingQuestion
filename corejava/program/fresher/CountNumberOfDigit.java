package corejava.program.fresher;

import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int c=0;
		
		while(n!=0) {
			n=n/10;
			c++;
		}
		System.out.println("Number of Digits "+ c);
		

	}

}
