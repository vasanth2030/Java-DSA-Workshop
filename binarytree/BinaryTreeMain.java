package com.vasanth.binarytree;

public class BinaryTreeMain {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		System.out.println("Inorder Traversal Recursive: ");
		Node.inorderTraversal(root);
		System.out.println();
		System.out.println();
		System.out.println("Inorder Traversal Iterative: ");
		Node.inorderIterative(root);
		System.out.println();
		System.out.println();

		System.out.println("Preorder Traversal Recursive: ");
		Node.preorderTraversal(root);
		System.out.println();
		System.out.println();
		System.out.println("Preorder Traversal Iterative: ");
		Node.preorderIterative(root);
		System.out.println();
		System.out.println();
		
		System.out.println("Postorder Traversal: ");
		Node.postorderTraversal(root);

	}

}
