package BinarySearchTree;

public class Main {

	public static void main(String[] args) {
			
		 BinarySearchTree myBST = new BinarySearchTree();
	        
	     System.out.println("Root: " + myBST.getRoot());
	     

	        myBST.insert(2);
	        myBST.insert(1);
	        myBST.insert(3);
	        
	        System.out.println("\nRoot: " + myBST.getRoot().value);
	        System.out.println("\nRoot->Left: " + myBST.getRoot().left.value);
	        System.out.println("\nRoot->Right: " + myBST.getRoot().right.value);
	        

	        System.out.println("\nBST Contains 3:");
	        System.out.println(myBST.contains(3));

	        System.out.println("\nBST Contains 17:");
	        System.out.println(myBST.contains(17));

	}

}
