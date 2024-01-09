package Learning;

import java.util.Scanner;

public class pallindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the String : ");
		
		String value = sc.next();
		
		int num = value.length();
		
		String reverse = "";
		
		for(int i = num-1 ; i>=0; i--) {
			
			reverse =	reverse + value.charAt(i);
			
		}
		
		if(value.equals(reverse)) {
			System.out.println("The string is palindrom");
		}
		else {
			System.out.println("The string is not a palindrom");
		}
		
	}

}
