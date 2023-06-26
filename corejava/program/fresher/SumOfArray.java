package corejava.program.fresher;

public class SumOfArray {

	public static void main(String[] args) {
		int a[]= {5,2,7,9};
		
		int s=0;
		for(int i=0;i<=a.length-1;i++) {
			s=s+a[i];
		}
		System.out.print(s);

	}

}
