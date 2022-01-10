package com.vasanth.linkedlist;

public class Node {
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		next=null;
	}
	
	
	public static void insertNode(Node head,int data)
	{
		Node newNode=new Node(data);
		
		
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		temp.next=newNode;
		
	}
	
	
	public static Node deleteNode(Node head,int data)
	{
		if(head.data==data)
		{
			return head.next;	
		}
		else {
			Node temp=head;
			while(temp.next!=null)
			{
				if(temp.next.data==data)
				{
					temp.next=temp.next.next;
					return head;
				}
				else
				{
					temp=temp.next;
				}
			}
			return head;
			
		}
	
	}
	
	public static void printLinkedList(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
	}
	
	
	

}
