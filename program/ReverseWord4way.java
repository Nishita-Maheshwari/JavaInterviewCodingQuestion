package string.practice.program;

//1-Using charAt(int index) method
//2-Using tocharArray() method
//3-using java.lang.StringBuffer class provided reverse() method
//4-using java.lang.StringBuilder class provided reverse() method




public class ReverseWord4way {
	public static void main(String [] args) {
		String s="Nishita";
		String rev="";
		
		
		//Approach 1
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.print(rev);
		System.out.println(" ");	
	
	
	
	
	
	//Approach-2
	char[] chArr=s.toCharArray();
	for(int i=chArr.length-1;i>=0;i--) {
		System.out.print(chArr[i]);
	}
	System.out.println("");
	
	//Approach-3
	StringBuffer sb=new StringBuffer(s);
	System.out.println(sb.reverse());
	
	
	
	//Approach-4
	StringBuilder sbuilder=new StringBuilder(s);
	System.out.println(sbuilder.reverse());
	

}
}