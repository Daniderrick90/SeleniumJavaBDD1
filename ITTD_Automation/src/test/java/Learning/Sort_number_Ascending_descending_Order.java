package Learning;

import java.util.Scanner;

public class Sort_number_Ascending_descending_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{3,5,8,9,4,2};

		int length = arr.length,temp=0;
		
		for(int i = 0 ; i<=length-1;i++) {
			for(int j = i+1;j<length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The value in ascending order : ");
		for(int element : arr) {
			
			System.out.println(element);
		}
		
		for(int i = 0 ; i<=length-1;i++) {
			for(int j = i+1;j<length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The value in descending order : ");
		for(int element : arr) {
			
			System.out.println(element);
		}
	}

}
