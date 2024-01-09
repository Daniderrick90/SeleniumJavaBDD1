package Learning;

import java.util.Scanner;

public class Find_Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please provide an year to check for leap year!");
		
		int year = sc.nextInt();
		
		boolean is_leap_year = false;
		
		if (year % 4 == 0) {
			is_leap_year=true;
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					is_leap_year=true;
				}else {
					is_leap_year=false;
				}
			}
		}else {
			is_leap_year=false;
		}
		if(!is_leap_year) {
			System.out.println(year + " : Non Leap-year"); 
		}else {
			System.out.println(year + " : Leap-year"); 
		}
	}

}
