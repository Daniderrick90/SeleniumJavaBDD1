package Learning;

public class Learn_Static_Variable {

	int x = 0;
	
	static int y = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Learn_Static_Variable ls = new Learn_Static_Variable();
		Learn_Static_Variable ls1 = new Learn_Static_Variable();
		ls.data();
		ls.data();
		ls.data();
		ls.data();
		ls1.data();
		ls1.data();
		ls1.data();
	}
	
	public void data() {
		
		x++;
		y++;
		System.out.println("value of x - " + x + ", value of y - " + y);
		
	}

}
