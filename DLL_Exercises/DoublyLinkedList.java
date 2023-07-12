package DLL_Exercises;

public class DoublyLinkedList {
	 private Node head;
	    private Node tail;
	    private int length;

	    class Node {
	        int value;
	        Node next;
	        Node prev;

	        Node(int value) {
	            this.value = value;
	        }
	    }

	    public DoublyLinkedList(int value) {
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
	        System.out.println("\nDoubly Linked List:");
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
	    
	    public void append (int value) {
	        Node newNode = new Node(value);
	        if(length == 0) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }
	        length++;
	    }

		public void swapFirstLast(){
		    if(length < 2){
		        return;
		    }else{
		        int temp = head.value;
		        head.value=tail.value;
		        tail.value=temp;
		    }
		}
		
		public void reverse() {
		    Node current = head;
		    Node temp = null;
		    while(current != null){
		        temp = current.prev; /* temp head tutacagi icin hep prev olarak sonraya alcaz */
		        current.prev = current.next; /*  bir onceki hep sonrakine esit olacak */
		        current.next=temp;  /* sonraki de erisimin yapilabilmesi icin temp olacak*/
		        current = current.prev; /* listenin en basini yeniden current olarak guncelleyecegiz*/
		    }
		    temp = head;
		    head = tail;
		    tail = temp;
		}
		
		
		public boolean isPalindrome(){
		    if(length <= 1) return true;
		    Node forward = head;
		    Node backward = tail;
		    for(int i = 0; i < length/2 ; i++){
		        if(forward.value != backward.value) return false;
		        
		        forward = forward.next;
		        backward = backward.prev;
		    }
		    return true;
		}
		
		public void swapPairs() {
	        Node dummy = new Node(0);
	        dummy.next = head;
	        Node previous = dummy;
	        
	        while (head != null && head.next != null) {
	            Node first = head;
	            Node second = head.next;
	            
	            previous.next = second;
	            first.next = second.next;
	            second.next = first;
	            
	            second.prev = previous;
	            first.prev = second;
	            
	            if(first.next != null){
	                first.next.prev = first;
	            }
	            head = first.next;
	            previous = first;
	            
	            
	        }
	        head=dummy.next;
	        if(head != null) head.prev = null;
	        
	    }
}
