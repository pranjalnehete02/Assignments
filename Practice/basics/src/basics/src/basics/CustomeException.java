package basics;

import java.util.Scanner;


class TooYoungException extends Exception{

	public TooYoungException(String message) {
		super(message);
	}
}


public class CustomeException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age;
		age = sc.nextInt();
		
		try {
			if(age < 18) {
				throw new TooYoungException("You're not eligible");
			}
		}
		catch(TooYoungException e) {
			System.out.println("Got Exception "+ e);
		}
		
	}
}
