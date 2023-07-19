package Ht_Exercises;

import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
		 List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
	        List<Integer> newList = removeDuplicates(myList);
	        System.out.println(newList);

	}
	
	 public static List<Integer> removeDuplicates(List<Integer> myList) {
	        Set<Integer> uniqueSet = new HashSet<>(myList);
	        return new ArrayList<>(uniqueSet);
	    }

}
