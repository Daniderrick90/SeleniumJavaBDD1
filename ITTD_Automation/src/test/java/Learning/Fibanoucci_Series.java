package Learning;

public class Fibanoucci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 0;
		
		int b = 1;
		
		int c = 0;
		
		System.out.println("The fibonoucci series are : " );
		
		System.out.println(a);
		
		System.out.println(b);
		
		for(int i = 0; i<=15; i++) {
			
			c = a + b;
			
			System.out.println(c);
			
			a = b;
			
			b = c;
			
		}
	}

}
