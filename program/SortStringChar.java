package string.practice.program;

import java.util.Arrays;

//1 without using sort method
//2 using sort method

public class SortStringChar {

	public static void main(String[] args) {
		String str ="rock";
		char arr[]= str.toCharArray();
		
		char temp;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(new String(arr));
		
		
		
		
		
		
		
		//Approach-2
		String str1="rock";
		char[] charArray= str1.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray));
		
	}

}
