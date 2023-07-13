package Stack;

public class Main {

	public static void main(String[] args) {
		
		
		Stack myStack = new Stack(2);

        System.out.println("Before push():");
        System.out.println("--------------");
        myStack.printAll();

        myStack.push(1);

        System.out.println("\n\nAfter push():");
        System.out.println("-------------");
        myStack.printAll();
        
        
        myStack.makeEmpty();
        
        Stack stack = new Stack(2);
        stack.push(1);

        System.out.println(stack.pop().value);
        System.out.println(stack.pop().value);
        System.out.println(stack.pop());

	}

}
