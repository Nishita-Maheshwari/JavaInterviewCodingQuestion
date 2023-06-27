package string.program;

//1)Same length
//2)contains the same characters
//3)Rotated around the character

public class StrngsRotation {

	public static void main(String[] args) {
		
		
		System.out.println(isRotatedVersion("abcd","bcda"));


	}
	
	public static boolean isRotatedVersion(String str, String rotatedString) {
		boolean isRotated=false;
		
		if(str==null || rotatedString==null) {
			return false;
		}
		else if(str.length()!=rotatedString.length()) {
			return false;
		}
		
		else {
			String concatenated= str+str;
			return concatenated.contains(rotatedString);
		}
	}

}
