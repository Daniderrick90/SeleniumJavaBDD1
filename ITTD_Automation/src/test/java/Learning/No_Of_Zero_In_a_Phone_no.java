	package Learning;

import java.util.Scanner;

public class No_Of_Zero_In_a_Phone_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		long reminder;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the phone number : ");
		
		long phone_number = sc.nextLong();
		
		for(int i = 0 ; i<10; i++) {
			
			reminder = (phone_number%10);
			if(reminder==0) {
				count=count+1;
			}
			phone_number=phone_number/10;
		}
		System.out.println("************************************************");
		System.out.println("The number of zero present in phone number is : " + count);
		
	}

}
