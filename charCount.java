package charCount;

import java.util.HashMap;

public class charCount {

	public static void main(String[] args) {

		int i = 0;
		char c;
		HashMap <Character, Integer> added = new HashMap<Character, Integer>();
		String input = "abcdfffddeeeeeeffffgaa";    
		while (i<input.length()) {
			c = input.charAt(i);
			if(!(added.containsKey(c)))
				added.put(c, 1);
			else
				added.put(input.charAt(i), added.get(input.charAt(i)) + 1 );
			i++;
		}
		System.out.println(added);	
	}

}
