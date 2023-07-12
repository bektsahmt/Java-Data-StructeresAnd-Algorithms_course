package DLL_Exercises;

public class Reverse_main {

	public static void main(String[] args) {
		//Implement a method called reverse() that reverses the order of the nodes in the list.

		
		DoublyLinkedList list = new DoublyLinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        
        System.out.println("list before reverse:");
        list.printList();
        
        list.reverse();
        
        System.out.println("\nlist after reverse:");
        list.printList();

	}

}
