



class Node{
    int data;
    Node left,right;
    
    public Node( int item ) {
        data = item ;
        left = right = null;
    }
}

class BinaryTree {
    Node root;
    
    public BinaryTree() {
        root = null;
    }
}


public class Invert_Binary_Tree
{
    

	public static void main(String[] args) {
		
		BinaryTree bochu = new BinaryTree();
		bochu.root = new Node(10);

        bochu.root.left = new Node(5);
        bochu.root.right = new Node(15);
    
        bochu.root.left.left = new Node(2);
        bochu.root.left.right = new Node(7);
    
        bochu.root.right.left = new Node(12);
    
        System.out.println("Inorder BEFORE invert:");
        printInorder(bochu.root);
		
		
	}

	
	static void printInorder(Node node) {
    if (node == null) return;

    printInorder(node.left);
    System.out.print(node.data + " ");
    printInorder(node.right);
}

}







