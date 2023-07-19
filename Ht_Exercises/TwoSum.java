package Ht_Exercises;

import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));

	}
	
	 public static int[] twoSum(int[] nums, int target) {
	        Map<Integer, Integer> numMap = new HashMap<>();
	 
	        for (int i = 0; i < nums.length; i++) {
	            int num = nums[i];
	            int complement = target - num;
	 
	            if (numMap.containsKey(complement)) {
	                return new int[]{numMap.get(complement), i};
	            }
	            numMap.put(num, i);
	        }
	 
	        return new int[]{};
	    }

}
