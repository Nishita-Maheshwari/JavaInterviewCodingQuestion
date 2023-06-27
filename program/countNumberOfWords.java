package string.practice.program;

import java.util.Scanner;

public class countNumberOfWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string  ");
		String s=sc.nextLine();
	    int count = countWords(s);
	    System.out.println("num of words in string  "+ count);
		
	}
	
	private static Integer countWords(String s) {
		int count =0;
		if(s.charAt(0)!=' ') {
			count++;
		}
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
			
		}
		
		return count;
	}

}



//enter string  
//welcome to java
//num of words in string  3

