package Learning;

import java.util.Scanner;

public class Find_the_smallest_number_in_a_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the digit : ");
		
		int n = sc.nextInt();
		
		System.out.println("Please enter a " + n + " digit value : ");
		
		int num = sc.nextInt();
		
		int reminder;
		
		int arr[] = new int[n];
		
		for(int i = 0; i<n;i++) {
			
			arr[i] = num%10;
			num = num/10;
		}
		n = n-1;
		for(int i = 0; i<=n; i++) {
			for(int j = i+1; j<n;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The second smallest number in a integer is : " + arr[1]);
	}

}
