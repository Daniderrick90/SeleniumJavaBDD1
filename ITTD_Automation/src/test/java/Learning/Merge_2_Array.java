package Learning;

public class Merge_2_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // first array 
        int a[] = { 30, 25, 40 }; 
        // second array 
        int b[] = { 45, 50, 55, 60, 65 };
        
        int a1 = a.length;
        int b1 = b.length;
        
        int c[] = new int[a1+b1];
        
        for(int i = 0 ; i<a1 ; i++) {
        	c[i] = a[i];
        }
        
        for(int i = 0 ; i<b1 ; i++){
        	c[a1+1] = b[i];
        }
	}

}
