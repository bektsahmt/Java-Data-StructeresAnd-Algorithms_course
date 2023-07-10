package LL_Exercises;

public class ReverseBetween_main {

	public static void main(String[] args) {
		//In the LinkedList class, implement a method called reverseBetween that reverses the nodes of the list between indexes m and n (inclusive).
		
		        ReverseBetween myLinkedList = new ReverseBetween(1);
		        myLinkedList.append(2);
		        myLinkedList.append(3);
		        myLinkedList.append(4);
		        myLinkedList.append(5);

		        System.out.println("Original linked list: ");
		        myLinkedList.printList();

		        
		        myLinkedList.reverseBetween(1, 3);
		        System.out.println("\nReversed sublist (1, 3): ");
		        myLinkedList.printList();

		        
		        myLinkedList.reverseBetween(0, 4);
		        System.out.println("\nReversed entire linked list: ");
		        myLinkedList.printList();

	}

}
