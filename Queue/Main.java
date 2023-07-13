package Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue myQueue = new Queue(4);
        myQueue.printAll();
        
        
        
        myQueue.enqueue(1);
        System.out.println("\n\nAfter enqueue():");
        System.out.println("-------------");
        myQueue.printAll();
        
        System.out.println("------------------------------");
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue().value);
        System.out.println(myQueue.dequeue());

	}

}
