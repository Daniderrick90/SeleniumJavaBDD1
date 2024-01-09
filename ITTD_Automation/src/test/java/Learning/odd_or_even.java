package Learning;

import java.util.Scanner;

public class odd_or_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number : ");
		
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("The given number " + num + " is even number!");
		}
		
		else {
			
			System.out.println("The given number " + num + " is odd number!");
			
		}

	}

}
