package LL_Exercises;

public class PartitionList_main {

	public static void main(String[] args) {
		
		//You are given a singly linked list with integer values that does not have a tail pointer (which will make this method simpler to implement).
		//Your task is to write a method named "partitionList" that takes an integer "x" as input and rearranges the linked list in such a way that all nodes with values less than "x" come before nodes with values greater than or equal to "x".
		//The method should maintain the relative order of the nodes with values less than "x" and the nodes with values greater than or equal to "x".
		
		
		PartitionList ll = new PartitionList(3);
        ll.append(5);
        ll.append(8);
        ll.append(10);
        ll.append(2);
        ll.append(1);

        
        System.out.println("LL before partitionList:");
        ll.printList(); 

        ll.partitionList(5);

        System.out.println("\nLL after partitionList:");
        ll.printList(); 


	}

}
