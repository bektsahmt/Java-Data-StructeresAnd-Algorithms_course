package LL_Exercises;

import LL_Exercises.FindingMiddleNode.Node;

public class HasLoop {
	private Node head;
	private Node tail;
	
	class Node {
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
		}
	}
	
	public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
	
	public HasLoop(int value) {
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
	
	public boolean hasLoop(){
	    Node slow = head;
	    Node fast = head;
	    
	    while(fast!=null && fast.next!=null){
	        slow = slow.next;
	        fast = fast.next.next;
	        if(slow == fast) return true;
	    }
	    return false;
	}

}
