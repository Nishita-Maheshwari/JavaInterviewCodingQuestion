package string.practice.program;

public class ReverseString {

	public static void main(String[] args) {
		String str=" this is reverse word prog";
		String splitArray[]=str.split(" ");
		
		for(int i=splitArray.length-1; i>=0;i--) {
			System.out.println(splitArray[i]);
		}

	}

}
