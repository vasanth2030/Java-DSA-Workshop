package com.vasanth.binarytree;

import java.util.Stack;

public class Node {
	int data;
	Node left;
	Node right;
	
	Node(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
	
	public static void inorderTraversal(Node root) // LEFT ROOT RIGHT
	{
		if(root==null)
			return;
		
		inorderTraversal(root.left);
		System.out.print(root.data+" ");
		inorderTraversal(root.right);
	}
	
	public static void preorderTraversal(Node root) // ROOT LEFT RIGHT
	{
		if(root==null)
			return;
		
		System.out.print(root.data+" ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}
	
	
	public static void postorderTraversal(Node root) // LEFT RIGHT ROOT
	{
		if(root==null)
			return; 
					
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.print(root.data+" ");
	}
	
	public static void inorderIterative(Node root)
	{
		if(root==null)
			return;
		
		Stack<Node> stack=new Stack<>();
		Node curr=root;
		
		while(curr!=null || stack.isEmpty()==false)
		{
			while(curr!=null)
			{
				stack.push(curr);
				curr=curr.left;
			}
			
			curr=stack.pop();
			System.out.print(curr.data+" ");
			curr=curr.right;		
		}
	}
	
	public static void preorderIterative(Node root)
	{
		if(root==null)
			return;
		Stack<Node> st=new Stack<>();
		st.push(root);
		Node curr=root;
		while(st.isEmpty()==false)
		{
			curr=st.pop();
			System.out.print(curr.data+" ");
			
			if(curr.right!=null)
				st.push(curr.right);
			if(curr.left!=null)
				st.push(curr.left);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
