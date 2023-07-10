package LL_Exercises;

public class ReverseBetween {
		private Node head;
	    private int length;

	    class Node {
	        int value;
	        Node next;

	        Node(int value) {
	            this.value = value;
	        }
	    }

	    public ReverseBetween(int value) {
	        Node newNode = new Node(value);
	        head = newNode;
	        length = 1;
	    }

	    public Node getHead() {
	        return head;
	    }

	    public int getLength() {
	        return length;
	    }

	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.println(temp.value);
	            temp = temp.next;
	        }
	    }

	    public void printAll() {
	        if (length == 0) {
	            System.out.println("Head: null");
	        } else {
	            System.out.println("Head: " + head.value);
	        }
	        System.out.println("Length:" + length);
	        System.out.println("\nLinked List:");
	        if (length == 0) {
	            System.out.println("empty");
	        } else {
	            printList();
	        }
	    }
	    
	    public void makeEmpty() {
	        head = null;
	        length = 0;
	    }
	    
	    public void append(int value) {
	        Node newNode = new Node(value);
	        if (length == 0) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	        length++;
	    }

	    public void reverseBetween(int m, int n){
	        if(head==null) return;
	        Node dummy = new Node(0);
	        dummy.next=head;
	        Node prev = dummy;
	        
	        for(int i=0; i<m; i++){
	            prev=prev.next;
	        }
	        Node current = prev.next;
	        
	        for(int i=0; i<(n-m); i++){
	            Node temp = current.next;
	            current.next=temp.next;
	            temp.next= prev.next;
	            prev.next=temp;
	        }
	        head=dummy.next;
	    }
}
