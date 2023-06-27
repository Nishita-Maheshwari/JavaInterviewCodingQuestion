package string.practice.program;

import java.util.Scanner;

public class CountCharacterWord {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter string ");
		String string=sc.next();
		int count =0;
		
		for(int i=0;i<string.length();i++) {
			
			if(string.charAt(i) != ' ')    
                count++;    
			
		}
		
		System.out.println("Count Character  " + count);
		
		

	}

}
