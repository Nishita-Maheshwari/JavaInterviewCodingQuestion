package corejava.program.fresher;

public class ReverseStringUsingBufferClass {

	public static void main(String[] args) {
	String str="ABCD";
	
	StringBuffer sb=new StringBuffer(str);
	System.out.println(sb.reverse());

	}

}
