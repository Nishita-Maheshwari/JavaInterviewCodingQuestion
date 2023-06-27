package string.practice.program;

import java.util.Arrays;

//1)Take two strings as input
//2)Convert two strings to character array.
//3)sort two strings arrays using arrays.sortt() method.
//4) Compare two string arrays if they are equal anagrams otherwise they are not

public class AnagramUsingArrays {

	public static void main(String[] args) {
	
		String str1="java";
		String str2="avaj";
		
	System.out.println(anagramCheck(str1,str2));

	}

	private static boolean anagramCheck(String str1, String str2) {
		char[] charArrayFromString1=str1.toCharArray();
		char[] charArrayFromString2=str2.toCharArray();
		
		Arrays.sort(charArrayFromString1);
		Arrays.sort(charArrayFromString2);
		
		return Arrays.equals(charArrayFromString1,charArrayFromString2);
		
		
	}

}
