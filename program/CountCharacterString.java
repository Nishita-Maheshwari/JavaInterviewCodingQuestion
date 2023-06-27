package string.program;

public class CountCharacterString {

	public static void main(String[] args) {
		String str="Hello World";
		count(str);
		

	}

	private static void count(String str) {
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			String s="";
		
			//when the character is not space
			while(i<ch.length && ch[i]!=' ') {
				s=s+ch[i];
				i++;
				
			}
			
			if(s.length()>0) {
				System.out.println(s + "->" + s.length());
				
			}
			
			
		}
	
		
	}

}


//Hello->5
//World->5
