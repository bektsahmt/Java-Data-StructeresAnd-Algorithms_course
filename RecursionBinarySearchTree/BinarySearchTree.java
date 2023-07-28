package RecursionBinarySearchTree;

public class BinarySearchTree {
	
	private Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        private Node(int value) {
            this.value = value;
        }
    }
    
    public Node getRoot() {
        return root;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }
    
    private boolean rContains(Node current, int value){
        if(current == null) return false;
        
        if(current.value == value) return true;
        
        if(value < current.value) {
            return rContains( current.left,value);
        }else{
            return rContains(current.right,value);
        }
    }

    public boolean rContains(int value) { return rContains(root, value); }
    
    
    private Node rInsert(Node current, int value){
        if(current == null) return new Node(value);
        if(value < current.value) {
            current.left = rInsert(current.left,value);
        }else if(value > current.value){
            current.right = rInsert(current.right,value);
        }
        return current;
    }
    public void rInsert(int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }    
    
    public int minValue(Node current) {
        while(current.left != null) {
            current = current.left;
        }
        return current.value;
    }
    
    
    private Node deleteNode(Node currentNode, int value) {
        if (currentNode == null) return null;
 
        if (value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = deleteNode(currentNode.right, value);
        } else {
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            } else if (currentNode.left == null) {
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;
            } else {
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = deleteNode(currentNode.right, subTreeMin);
            }
        }
        return currentNode;
    }

    
    public void deleteNode(int value) { deleteNode(root, value); }    
    


}
