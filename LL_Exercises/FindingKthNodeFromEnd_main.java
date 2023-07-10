package LL_Exercises;

public class FindingKthNodeFromEnd_main {

	public static void main(String[] args) {
		//Implement a method called findKthFromEnd that returns the k-th node from the end of the list.
		//If the list has fewer than k nodes, the method should return null.
		
		 FindingKthNodeFromEnd myLinkedList = new FindingKthNodeFromEnd(1);
	        myLinkedList.append(2);
	        myLinkedList.append(3);
	        myLinkedList.append(4);
	        myLinkedList.append(5);

	        int k = 2;
	        int result = myLinkedList.findKthFromEnd(k).value;

	        System.out.println(result); 
	      
	}

}
