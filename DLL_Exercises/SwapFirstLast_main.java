package DLL_Exercises;

public class SwapFirstLast_main {

	public static void main(String[] args) {
		//Swap First and Last Node Values in a Doubly Linked List.
		//Given a doubly linked list, write a method called swapFirstLast() that swaps the values of the first and last nodes in the list.
		//If the length of the list is less than 2, the method should not perform any operation.
		
		DoublyLinkedList list = new DoublyLinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        
        System.out.println("list before swap:");
        list.printList();
        
        list.swapFirstLast();
        
        System.out.println("\nlist after swap:");
        list.printList();

	}

}
