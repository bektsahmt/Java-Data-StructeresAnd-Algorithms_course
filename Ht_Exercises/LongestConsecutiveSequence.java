package Ht_Exercises;

import java.util.*;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		
		//Given an unsorted array of integers, write a function that finds the length of the  longestConsecutiveSequence (i.e., a sequence of integers in which each element is one greater than the previous element).
		
		 	int[] nums = {100, 4, 200, 1, 3, 2};
	        int longest = longestConsecutiveSequence(nums);
	        System.out.println(longest);
		
	}
	
	 public static int longestConsecutiveSequence(int[] nums) {
	        Set<Integer> numSet = new HashSet<>();
	        for (int num : nums) {
	            numSet.add(num);
	        }
	 
	        int longestStreak = 0;
	 
	        for (int num : numSet) {
	            if (!numSet.contains(num - 1)) {
	                int currentNum = num;
	                int currentStreak = 1;
	 
	                while (numSet.contains(currentNum + 1)) {
	                    currentNum++;
	                    currentStreak++;
	                }
	 
	                longestStreak = Math.max(longestStreak, currentStreak);
	            }
	        }
	 
	        return longestStreak;
	    }


}
