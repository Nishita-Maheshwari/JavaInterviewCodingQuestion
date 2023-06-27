package string.practice.program;

public class CompareString2 {
	

//1) using equal()method
//2) Using equalsIgnorecase() method
//3)Using compareTo()
//4)Using compareToIgnorecase()method
//5)Object.equals() method
	
	public static void main(String[] args) {
		
		String str1=new String("sandeep");
		String str2= new String ("Sandeep");
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.compareTo(str2));
		
		System.out.println(str1.compareToIgnoreCase(str2));
		
		
	}
}
