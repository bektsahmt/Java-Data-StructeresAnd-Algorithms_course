package LL_Exercises;

public class FindingMiddleNode_main {

	public static void main(String[] args) {
		//Implement a method called findMiddleNode that returns the middle node of the linked list.
		//If the list has an even number of nodes, the method should return the second middle node.
		
		FindingMiddleNode list = new FindingMiddleNode(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        
        list.printList();
        
        System.out.println("Middle Node:");
        System.out.println( list.findMiddleNode().value);

	}

}
