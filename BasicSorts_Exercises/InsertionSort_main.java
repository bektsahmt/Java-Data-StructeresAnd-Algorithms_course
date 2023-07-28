package BasicSorts_Exercises;

public class InsertionSort_main {

	public static void main(String[] args) {
		
		
		 LinkedList myLinkedList = new LinkedList(4);
	        myLinkedList.append(2);
	        myLinkedList.append(6);
	        myLinkedList.append(5);
	        myLinkedList.append(1);
	        myLinkedList.append(3);


	        System.out.println("Unsorted Linked List:");
	        myLinkedList.printList();

	        myLinkedList.insertionSort();

	        System.out.println("\nSorted Linked List:");
	        myLinkedList.printList();

	}

}
