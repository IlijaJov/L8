package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter n: "); //a scanner is introduced so a user can decide
										//last number
		int n = s.nextInt();
		
		fibonacci(n);
		s.close();
	}
	
	public static void fibonacci(int n) {
		int n1 = 0; // a first, second and third variable are introduced 
		int n2 = 1;
		int n3;
		
		String comma = "";
		
		for (int i = 0; i < n; i++) { //a for loop is created 
			
			System.out.print(comma + n1); //first number is printed
			
			n3 = n1 + n2; // third number is a result of first and second number
			n1 = n2;	 // n1 gets value from n2
			n2 = n3;	// n2 gets value from n3 and with this the loop 
					   // creates fibonacci sequence
			comma = ", ";
		}
	}
}
