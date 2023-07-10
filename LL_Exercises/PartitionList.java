package LL_Exercises;

public class PartitionList {
	 private Node head;
	    private Node tail;
	    private int length;

	    class Node {
	        int value;
	        Node next;

	        Node(int value) {
	            this.value = value;
	        }
	    }

	    public PartitionList(int value) {
	        Node newNode = new Node(value);
	        head = newNode;
	        tail = newNode;
	        length = 1;
	    }

	    public Node getHead() {
	        return head;
	    }

	    public Node getTail() {
	        return tail;
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
	            System.out.println("Tail: null");
	        } else {
	            System.out.println("Head: " + head.value);
	            System.out.println("Tail: " + tail.value);
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
	        tail = null;
	        length = 0;
	    }
	    
	    public void append(int value) {
	        Node newNode = new Node(value);
	        if (length == 0) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	        }
	        length++;
	    }

	    public void partitionList(int x){
	        if(head == null) return;
	        
	        Node dummy1 = new Node(0);
	        Node dummy2 = new Node(0);
	        
	        Node prev1=dummy1;
	        Node prev2=dummy2;
	        Node current = head;
	        
	        while(current !=null){
	            if(current.value < x){
	                prev1.next=current;
	                prev1=current;
	            }else{
	                prev2.next=current;
	                prev2=current;
	            }
	            current = current.next;
	        }
	        prev2.next=null;
	        prev1.next=dummy2.next;
	        
	        head=dummy1.next;
	    }

}
