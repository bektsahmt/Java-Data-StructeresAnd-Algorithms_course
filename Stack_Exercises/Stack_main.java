package Stack_Exercises;

public class Stack_main {

	public static void main(String[] args) {
		
		//Stack: Pop for a Stack That Uses an ArrayList
		//Push for a Stack That Uses an ArrayList
		
		 Stack myStack = new Stack();
	        
	        myStack.push(1);
	        myStack.push(2);
	        myStack.push(3);
	        
	        myStack.printStack();
	        
	        System.out.println("\nPopped node:");
	        System.out.println(myStack.pop());
	        
	        System.out.println("\nStack after pop():");
	        myStack.printStack();

	}

}
