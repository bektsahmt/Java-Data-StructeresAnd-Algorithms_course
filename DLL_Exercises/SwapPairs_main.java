package DLL_Exercises;

public class SwapPairs_main {

	public static void main(String[] args) {
		// Implement a method called swapPairs within the class that swaps the values of adjacent nodes in the linked list.
		//The method should not take any input parameters.
		
		 DoublyLinkedList list = new DoublyLinkedList(1);
	        list.append(2);
	        list.append(3);
	        list.append(4);

	        System.out.println("List before swapPairs:");
	        list.printList();

	        list.swapPairs();

	        System.out.println("\nList after swapPairs:");
	        list.printList();
		

	}

}
