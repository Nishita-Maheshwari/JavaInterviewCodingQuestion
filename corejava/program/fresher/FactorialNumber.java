package corejava.program.fresher;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		long factorial=1;
		
		for(int i=1;i<=n;i++) {
			factorial=factorial*i;
		}
		System.out.print("factorial of a number "+ factorial);

	}

}
