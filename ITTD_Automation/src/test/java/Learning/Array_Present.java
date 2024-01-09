package Learning;

import java.util.Scanner;

public class Array_Present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = new int[5];
		
		arr[0] = 3;
		arr[1] = 34;
		arr[2] = 22;
		arr[3] = 8;
		arr[4] = 10;
		
		boolean find = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the value to find in the array : ");
		
		int num = sc.nextInt();
		
		int sum = arr.length-1;
		
		for(int i = 0 ; i<=sum; i++) {
			
			if(num==arr[i]) {
				
				find = true;
				
			}
			
		}
		
		if(find == true) {
			System.out.println("The given number is present in the array");
		}else {
			System.out.println("The given number is not present in the array");
		}
	}

}
