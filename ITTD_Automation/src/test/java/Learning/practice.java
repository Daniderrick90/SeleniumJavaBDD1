package Learning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the firrst value : ");
		String s1 = sc.next();
		int num1 = s1.length();
		System.out.println("Please enter the second value : ");
		String s2 = sc.next();
		int num2 = s2.length();
		char[] char_array1 = s1.toCharArray();
		char[] char_array2 = s2.toCharArray();
		Arrays.sort(char_array1);
		Arrays.sort(char_array2);
		if(num1==num2) {
			if(Arrays.equals(char_array1, char_array2)) {
				System.out.println("The given strings is an Anagram!");
			}
			else {
				System.out.println("The given strings is not an Anagram!");
			}
		}else {
			System.out.println("The given strings is not an Anagram!");
		}
		
	}

}
