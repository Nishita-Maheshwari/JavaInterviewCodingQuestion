package string.practice.program;

public class AnagramString {
	
	public static void main(String[]args) {
		System.out.println(isAnagaram("aab","baa")) ;
	}
	
	
	private static boolean isAnagaram(String string1, String string2) {
		int count[]=new int[256];
		
		for(int i=0;i<string1.length();i++) {
			count[string1.charAt(i)]++;
			count[string1.charAt(i)]--;
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				return false;
			}
		}
		return true;
	}
}

