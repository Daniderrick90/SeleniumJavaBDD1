package Learning;

public class pallindrom_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =	784871;
		
		int reverse = 0;
		
		while(n!=0) {
			
			int reminder = n%10;
			
			reverse = reverse * 10 + reminder;
			
			n = n / 10;
			
		}
		
		System.out.println("The reverse string is : " + reverse);
	}

}
