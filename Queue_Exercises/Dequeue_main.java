package Queue_Exercises;

public class Dequeue_main {

	public static void main(String[] args) {
		// 
		
		
		MyQueue q = new MyQueue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Front of the queue: " + q.peek());
        System.out.println("Dequeued value: " + q.dequeue());
        System.out.println("Dequeued value: " + q.dequeue());
        q.enqueue(4);
        System.out.println("Front of the queue: " + q.peek());
        System.out.println("Dequeued value: " + q.dequeue());
        System.out.println("Dequeued value: " + q.dequeue());

        System.out.println("Is the queue empty? " + q.isEmpty());
	}

}
