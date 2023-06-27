package string.practice.program;

public class CompareString {

	public static void main(String[] args) {
		
		String str1="nishita";
		String str2="nishita";
		
		boolean isCompare=false;
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				isCompare=false;
				break;
			}
			isCompare=true;
		}
		
		System.out.println("both the strings are equal " +isCompare);

	}

}
