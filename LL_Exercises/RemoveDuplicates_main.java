package LL_Exercises;

public class RemoveDuplicates_main {

	public static void main(String[] args) {
		//You are given a singly linked list that contains integer values, where some of these values may be duplicated.
		//Your task is to implement a method called removeDuplicates() within the LinkedList class that removes all duplicate values from the list.
		//Your method should not create a new list, but rather modify the existing list in-place, preserving the relative order of the nodes.
		
		RemoveDuplicates myLinkedList = new RemoveDuplicates(1);

        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.removeDuplicates();

        myLinkedList.printList();

	}

}
