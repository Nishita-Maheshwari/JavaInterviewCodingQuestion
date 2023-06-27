package string.practice.program;

public class PangramExample {

	public static void main(String[] args) {
		
		String s="The quick brown fox jumps over the lazy dogs";
		System.out.println(isPanagram(s));
		

	}

	private static boolean isPanagram(String s) {
		if(s.length()<26) {
			return false;
			
		}else {
			
			for(char ch='a';ch<='z';ch++) {
				if(s.indexOf(ch)<0) {
					return false;
				}
			}
		}
		return true;
		
		
	}

}
