package Learning;

import java.util.Scanner;

public class Sum_of_given_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		
		System.out.println("Enter the value for the number to be sum : ");
		
		int num = sc.nextInt();

		int a=0;
		
		while(num>0) {
			
			
			a = (num%10)+a;
			num = num/10;
			
		}
		
		System.out.println("The sum of the integer is : " + a);
	}

}
