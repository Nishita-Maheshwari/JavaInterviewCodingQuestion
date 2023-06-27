package string.practice.program;

//1)Take two string input
//2)Convert first string to character array
//3)Take each character from first string and get the index of that character in second
//   string.If the index is present delete that character from second string.
//4)Repeat the same step for all the caracter in First STring.
//5)Finally check len second string is zero strings are anagram else not



public class AnagramUsingStringBuffer {

	public static void main(String[] args) {
		
		String str1="java";
		String str2="avaj";
		
		System.out.print(anagramCheck(str1,str2));
		

	}

	private static boolean anagramCheck(String str1,String str2) {
		char[] charString1=str1.toCharArray();
		StringBuilder sb=new StringBuilder(str2);
		
		for(char c:charString1) {
			int index=sb.indexOf(String.valueOf(c));
			
			if(index!=-1) {
				sb.deleteCharAt(index);
			}
			else {
				return false;
			}
			
		}
		
		return sb.length()==0;
		
	}

}
