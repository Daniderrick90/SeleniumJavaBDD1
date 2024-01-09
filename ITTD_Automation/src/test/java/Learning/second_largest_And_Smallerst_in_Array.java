package Learning;

import java.util.Scanner;

public class second_largest_And_Smallerst_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Please enter the lenght of an array : ");
		
		int n = sn.nextInt();
		
		int arr[] = new int[n];
		
		int temp;
		
		System.out.println("Please enter " + n + " values of the array : ");
		
		for(int i = 0 ; i<n; i++) {
			
			arr[i] = sn.nextInt();
			System.out.println("*************");
		}
		
		for(int i = 0 ; i<=n ; i++) {
			for(int j = i+1 ; j<n; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		System.out.println(arr[i]);
		}
		System.out.println("*****************************************************");
		System.out.println("The second largest value in an array is : " + arr[n-2]);
		System.out.println("*****************************************************");
		System.out.println("The second smallest value in an array is : " + arr[1]);
		
	}

}
