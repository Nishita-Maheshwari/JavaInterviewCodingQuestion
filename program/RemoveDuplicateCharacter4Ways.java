package string.practice.program;

import java.util.LinkedHashSet;
import java.util.Set;

//1-Using JAVA8
//2 Using indeOf(..)
//3 Using character array
//4 Using set interface method



public class RemoveDuplicateCharacter4Ways {

	public static void main(String[] args) {
		String str="programming";
		
		
	//Approach 1
	StringBuilder sb1=new StringBuilder();
	str.chars().distinct().forEach(c -> sb1.append((char)c));
	System.out.println(sb1);
		
	
	
	
	//Approach 2
	StringBuilder sb2=new StringBuilder();
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		int idx =str.indexOf(ch,i+1);
		
		if(idx==-1) {
			sb2.append(ch);
		}
	}
	System.out.println(sb2);
	
	
	
	
	
	//Approach-4
	StringBuilder sb4=new StringBuilder();
	Set<Character>set=new LinkedHashSet();
	
	for(int i=0;i<str.length();i++) {
		set.add(str.charAt(i));		
	}
	
	for(Character c:set) {
		sb4.append(c);
	}
	System.out.println(sb4);

	}

}
