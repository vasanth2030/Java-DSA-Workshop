package com.vasanth.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		Node head =new Node(10);
		Node.insertNode(head, 20);
		Node.insertNode(head, 30);
		Node.insertNode(head, 40);
		Node.insertNode(head, 50);
		Node.printLinkedList(head);
		System.out.println();
		
		head=Node.deleteNode(head, 30);
		head=Node.deleteNode(head, 10);
		Node.printLinkedList(head);

	}

}
