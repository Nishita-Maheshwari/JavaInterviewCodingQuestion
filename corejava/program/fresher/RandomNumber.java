package corejava.program.fresher;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		
		Random rand =new Random();
		
		int rand_int=rand.nextInt(1000);
		
		System.out.print(rand_int);

	}

}
