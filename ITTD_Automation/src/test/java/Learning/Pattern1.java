package Learning;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {3,4,7,8,1,2,3};
		int[] b = {7,4,6,28,12,42,13};
		
		int a_Length = a.length;
		int b_Length = b.length;
		
		int total_Length = a_Length+b_Length;
		
		int[] c = new int[total_Length];
		
		for(int i = 0; i<=a_Length-1;i++) {
			
			c[i] = a[i];
		}
		
		for(int i = 0; i<=b_Length-1;i++) {
			c[a_Length] = b[i];
			a_Length = a_Length+1;
		}
		
		for(int d:c) {
			System.out.println(d);
		}
	}
}
