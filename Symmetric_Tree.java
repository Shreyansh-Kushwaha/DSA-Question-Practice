import java.util.*;


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


public class Symmetric_Tree
{
    

	public static void main(String[] args) {
		
		BinaryTree bochu = new BinaryTree();
		bochu.root = new Node(10);

        bochu.root.left = new Node(5);
        bochu.root.right = new Node(15);
    
        bochu.root.left.left = new Node(2);
        bochu.root.left.right = new Node(7);
    
        bochu.root.right.left = new Node(12);
    
        System.out.println("Before The Inversion");
		prettyPrint(bochu.root, "", false);
		
		boolean result = Is_Symmetric_Tree( bochu.root );
		
		System.out.println( result );
	}
    
    
    public static boolean Is_Symmetric_Tree(Node root) {
            
            if ( root == null ) {
                return 0;
            }
            
    }
    
	
	public static void prettyPrint(Node root, String prefix, boolean isLeft) {
        if (root == null) {
            return;
        }
    
        System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.data);
    
        // Enter the next generation
        prettyPrint(root.left, prefix + (isLeft ? "│   " : "    "), true);
        prettyPrint(root.right, prefix + (isLeft ? "│   " : "    "), false);
    }

}
