package DLL_Exercises;

public class IsPalindrome_main {

	public static void main(String[] args) {
		// Write a method to determine whether a given doubly linked list reads the same forwards and backwards.
		// For example, if the list contains the values [1, 2, 3, 2, 1], then the method should return true, since the list is a palindrome.
		
		DoublyLinkedList list1 = new DoublyLinkedList(1);
        list1.append(2);
        list1.append(3);
        list1.append(2);
        list1.append(1);
        
        System.out.println("list1 isPalindrome:");
        System.out.println( list1.isPalindrome() );
        
        
        
        DoublyLinkedList list2 = new DoublyLinkedList(1);
        list2.append(2);
        list2.append(3);
        
        System.out.println("\nlist2 isPalindrome:");
        System.out.println( list2.isPalindrome() );

	}

}
