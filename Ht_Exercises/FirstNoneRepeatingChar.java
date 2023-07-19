package Ht_Exercises;

import java.util.HashMap;
import java.util.Map;

public class FirstNoneRepeatingChar {

	public static void main(String[] args) {
		
		 System.out.println(firstNonRepeatingChar("leetcode"));
	        System.out.println(firstNonRepeatingChar("hello"));
	        System.out.println(firstNonRepeatingChar("aabbcc"));

	}
	
	public static Character firstNonRepeatingChar(String st){
        Map<Character, Integer> charCounts = new HashMap<>();
        
        for(int i = 0; i < st.length(); i++){
            char c = st.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c,0) + 1 );
        }
        for(int i = 0; i < st.length(); i++){
            char c = st.charAt(i);
            if(charCounts.get(c) == 1 ) {
                return c;
            }
        }
        return null;
    }

}
