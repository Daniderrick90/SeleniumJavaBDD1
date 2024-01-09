package Learning;

public class Given_substring_is_present_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String find = "premiere";
		int n = find.length();
		System.out.println(n);
		boolean value = false;
		String str = "I love english premier league";
		String[] word = str.split("\\s+");
		int n1 = word.length;
		System.out.println(n1);
		for(String element : word) {
			if(element.equals(find)) {
				value = true;
			}
		}
		if(value==true) {
			System.out.println("The given string is present!");
		}
		else {
			System.out.println("The given string is not present!");
		}
	}

}
