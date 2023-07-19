package Ht_Exercises;

import java.util.*;

public class FindDuplicates {

	public static void main(String[] args) {
		
		
		 int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
	        List<Integer> duplicates = findDuplicates(nums);
	        System.out.println(duplicates);

	}
	
	public static List<Integer> findDuplicates(int[] nums){
        Map<Integer, Integer> numCounts = new HashMap<>();
        
        for(int num : nums){
            numCounts.put(num, numCounts.getOrDefault(num,0)+1);  // Eger num degerinde bir sey varsa onu getirecek yoksa default olarak 0
        }
        List<Integer> duplicates = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : numCounts.entrySet()){
            if(entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }

}
