package LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.printAll();
        
        
        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.printAll();
        
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast());
        
        
        
    }

}

	
