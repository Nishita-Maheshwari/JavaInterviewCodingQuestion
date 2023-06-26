package corejava.program.fresher;

import java.util.Scanner;

public class SwapTwoNumWithoutThird {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first value ");
		int n=sc.nextInt();
		
		System.out.println("enter the first value ");
		int m=sc.nextInt();
	
		
		n=m+n;
		m=n-m;
		n=n-m;
		
		System.out.println("swap value "+ n+ "   " + m);
		
				
		

	}

}
