package Learning;

import java.util.Scanner;

public class Prime_Number_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Solution - A number that can we divided by 1 and by itself are prime number
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number :" );
		System.out.println();
		
		int num = sc.nextInt();
		
		boolean value = false;
		
		for(int i = 2 ; i<num ; i++) {
			
			if(num%i==0) {
				value = true;
				
			}		
		}
		
		if(value == false) {
			System.out.println("The given number is prime!");
		}
		else {
			System.out.println("The given number is not a prime!");
		}

	}

}
