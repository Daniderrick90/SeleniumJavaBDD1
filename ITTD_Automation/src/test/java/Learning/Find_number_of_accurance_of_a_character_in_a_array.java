package Learning;

import java.util.HashMap;
import java.util.Map;

public class Find_number_of_accurance_of_a_character_in_a_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getCharCount("DanielDerrick");
	}
	
	public static void getCharCount (String value) {
		
		Map<Character , Integer> getMap = new HashMap<Character , Integer>();
		
		char char_arr[] = value.toCharArray();
		
		for(char c : char_arr) {
			
			if(getMap.containsKey(c)) {
				getMap.put(c, getMap.get(c)+1);
			}else {
				getMap.put(c, 1);
			}
		}
		
		System.out.println("name :" + getMap);
	}

}
