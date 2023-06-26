package corejava.program.fresher;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int n =sc.nextInt();
		int c=0;
		
		if(n>1) {
			for(int i=1;i<=n;i++) {
				if(n%i==0) 
					c++;
				
				if(c==2) {
					System.out.print(" prime");
				}
				else {
					System.out.print("not prime");
				}
					
			}
		}
		
		else {
			System.out.print("not prime");
		}


	}

}
