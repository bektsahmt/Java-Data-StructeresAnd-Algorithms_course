package Ht_Exercises;

import java.util.HashSet;
import java.util.Set;

public class HasUniqueChars {

	public static void main(String[] args) {
		
		System.out.println(hasUniqueChars("abcdefg")); 
        System.out.println(hasUniqueChars("hello")); 
        System.out.println(hasUniqueChars("")); 
        System.out.println(hasUniqueChars("0123456789")); 
        System.out.println(hasUniqueChars("abacadaeaf"));

	}
	
	 public static boolean hasUniqueChars(String string) {
	        Set<Character> charSet = new HashSet<>();
	 
	        for (char ch : string.toCharArray()) {
	            if (charSet.contains(ch)) {
	                return false;
	            }
	            charSet.add(ch);
	        }
	 
	        return true;
	    }


}
