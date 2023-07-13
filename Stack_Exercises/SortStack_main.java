package Stack_Exercises;

public class SortStack_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Stack<Integer> stack = new Stack<>();
	        stack.push(3);
	        stack.push(2);
	        stack.push(5);
	        stack.push(1);
	        stack.push(4);

	        System.out.println("Before sorting:");
	        stack.printStack();

	        sortStack(stack);

	        System.out.println("\nAfter sorting:");
	        stack.printStack();
	 
	        
	        
	    }
	    
	    public static void sortStack(Stack<Integer> stack){
	        Stack<Integer> additionalStack = new Stack<>();
	        while(!stack.isEmpty()){
	            int temp = stack.pop();
	            while(!additionalStack.isEmpty() && additionalStack.peek() > temp){
	                stack.push(additionalStack.pop());
	        }
	        additionalStack.push(temp);
	    }
	    while(!additionalStack.isEmpty()){
	        stack.push(additionalStack.pop());
	    }
	}

}
