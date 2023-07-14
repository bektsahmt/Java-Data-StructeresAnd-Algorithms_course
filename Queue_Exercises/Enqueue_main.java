package Queue_Exercises;

public class Enqueue_main {

	public static void main(String[] args) {
		// Implement the Enqueue Method for a Queue using Two Stacks
		// In this assignment, you are tasked with implementing the enqueue method for a custom queue class called MyQueue using two stacks, stack1 and stack2.
		
		
		
		 MyQueue q = new MyQueue();

	        q.enqueue(1);
	        q.enqueue(2);
	        q.enqueue(3);

	        System.out.println("Front of the queue: " + q.peek());

	        System.out.println("Is the queue empty? " + q.isEmpty());

	}

}
