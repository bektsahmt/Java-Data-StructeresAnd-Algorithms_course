package RecursionBinarySearchTree;

public class Main {

	public static void main(String[] args) {
		
		 BinarySearchTree myBST = new BinarySearchTree();

	        myBST.insert(47);
	        myBST.insert(21);
	        myBST.insert(76);
	        myBST.insert(18);
	        myBST.insert(27);
	        myBST.insert(52);
	        myBST.insert(82);


	        System.out.println("BST Contains 27:");
	        System.out.println(myBST.rContains(27));

	        System.out.println("\nBST Contains 17:");
	        System.out.println(myBST.rContains(17));
	        System.out.println();
	        

	        BinarySearchTree myBST2 = new BinarySearchTree();

	        myBST2.rInsert(2);
	        myBST2.rInsert(1);
	        myBST2.rInsert(3);
	        
	        System.out.println("Root: " + myBST2.getRoot().value);
	        System.out.println("\nRoot->Left: " + myBST2.getRoot().left.value);
	        System.out.println("\nRoot->Right: " + myBST2.getRoot().right.value);
	        
	        System.out.println();
	        
	        System.out.println(myBST.minValue( myBST.getRoot() ));

	        System.out.println(myBST.minValue( myBST.getRoot().right ));
	        
	        
	        myBST2.deleteNode(2);

	      


	        System.out.println( "\nRoot: " + myBST2.getRoot().value );
	        System.out.println( "Root->Left: " + myBST2.getRoot().left.value );
	        System.out.println( "Root->Right: " + myBST2.getRoot().right );


	}

}
