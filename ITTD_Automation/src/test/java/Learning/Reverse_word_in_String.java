package Learning;

import java.util.Scanner;

public class Reverse_word_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the string : ");
		
		String value = sc.next();
		
		int ln = value.length();
		
		String reverse = "";
		
		for(int i = ln-1 ; i>=0;i--) {
		
		reverse = reverse + value.charAt(i);
		
		}
			
		System.out.println("The reverse string is : " + reverse.toUpperCase());
		System.out.println("The reverse string is : " + reverse.toLowerCase());
		}

}
