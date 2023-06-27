package string.practice.program;

public class VowelConstantCount {

	public static void main(String[] args) {
		String str="Nishita";
		
		countVowels(str);
		

	}

	private static void countVowels(String str) {
		int vowelCount=0;
		int constantCount=0;
		
		for(int i=0;i<str.length();i++) {
			if(isVowel(str.charAt(i))) {
				++vowelCount;
				
			}else {
				++constantCount;
			}
		}
		System.out.println("Vowel Count " +vowelCount);
		System.out.println("Constant Count " +constantCount);
		
		
		
		
	}

	private static boolean isVowel(char ch) {
		ch=Character.toUpperCase(ch);
		return(ch=='A'|| ch=='E'|| ch=='I' || ch=='O' || ch=='U');
	}

}
