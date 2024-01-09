package Learning;

import java.util.Scanner;

public class vowels_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean value = false;
		
		int count_a = 0, count_e = 0 , count_i = 0,count_o = 0,count_u = 0;
		
		String word = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a word");
		
		String st = sc.next();
		
		int ln = st.length();
		
		for(int i = 0 ; i<=ln-1 ; i++) {
		
		word = word + st.charAt(i);
		if(word.equals("a")) {
			value = true;
			count_a = count_a+1;
		}
		else if(word.equals("e")) {
			value = true;
			count_e = count_e+1;
		}
		else if(word.equals("i")) {
			value = true;
			count_i = count_i+1;
		}
		else if(word.equals("o")) {
			value = true;
			count_o = count_o+1;
		}
		else if(word.equals("u")) {
			value = true;
			count_u = count_u+1;
		}
		word = "";
		}
		if(value==true) {
		System.out.println("The word has a vowels");
		System.out.println("*******************************");
		System.out.println("The count of a is : " + count_a);
		System.out.println("The count of e is : " + count_e);
		System.out.println("The count of i is : " + count_i);
		System.out.println("The count of o is : " + count_o);
		System.out.println("The count of u is : " + count_u);
		}
		else {
			System.out.println("The word does not has a vowels");
		}
	}

}
