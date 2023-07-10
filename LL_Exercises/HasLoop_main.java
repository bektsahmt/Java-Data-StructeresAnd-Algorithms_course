package LL_Exercises;

public class HasLoop_main {

	public static void main(String[] args) {
		
		//Implement a method called hasLoop that checks whether the list contains a loop or not.
		//If the list contains a loop, the method should return true; otherwise, it should return false.
		
		
		HasLoop list = new HasLoop(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        
        list.getTail().next = list.getHead().next;
        

        System.out.println("Has Loop:");
        System.out.println( list.hasLoop());

	}

}
