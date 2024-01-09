package Learning;

import java.util.Scanner;

public class Largest_and_Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the value : ");
		
		int num = sc.nextInt();
		
		int reminder; int largest = 0;
		
		while(num>0) {
			
			reminder = num%10;
			if(largest < reminder) {
				largest = reminder;
			}
			num = num/10;
		}
		
		System.out.println("The largest number is : " + largest);

	}

}
