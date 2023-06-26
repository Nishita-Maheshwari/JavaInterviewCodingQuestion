package corejava.program.fresher;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter your String");
		
		String s=sc.next();
		String org=s;
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		if(org.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println(" not palindrome");
		}
		

	}

}
