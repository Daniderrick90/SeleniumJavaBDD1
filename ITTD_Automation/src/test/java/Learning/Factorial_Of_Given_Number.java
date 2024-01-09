package Learning;

import java.util.Scanner;

public class Factorial_Of_Given_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a digit to get the factorial value : ");
		
		int num = sc.nextInt();
		
		
		for(int i = 1; i<=num; i++) {

			fact = fact*i;
			
		}
		
		System.out.println("**********************");
		System.out.println("The factorial of given number is --- " + fact);
		
	}

}
