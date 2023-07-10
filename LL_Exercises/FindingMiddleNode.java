package LL_Exercises;

public class FindingMiddleNode {
	private Node head;
	private Node tail;
	
	class Node {
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
		}
	}
	
	public FindingMiddleNode(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;

	}
	
	public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
	
	public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
	
	public Node findMiddleNode(){
	    Node slow = head;
	    Node fast = head;
	    while(fast !=null && fast.next != null){
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    return slow;
	}
}