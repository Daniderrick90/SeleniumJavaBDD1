package Learning;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int digits = 0,last=0,sum=0;
		while(temp>0) {
			temp = temp/10;
			digits++;
			
		}
		
		temp = num;
		
		while(temp>0) {
			last = temp%10;
			sum += (Math.pow(last, digits));
			temp = temp/10;
		}
		System.out.println(num);
		System.out.println(sum);
		if(num == sum) {
			System.out.println("The given number is Armstrong number!");
		}
		else {
			System.out.println("The given number is not an Armstrong number!");
		}

	}

}
