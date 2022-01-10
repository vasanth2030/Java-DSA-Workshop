package com.vasanth.queue;

public class Queue {
	private int front;
	private int rear;
	private int queue[];
	private int capacity;
	
	Queue(int capacity)
	{
		this.capacity=capacity;
		queue=new int[capacity];
		front=rear=0;
	}
	
	public void enqueue(int data)
	{
		if(rear==capacity)
			System.out.println("Queue is full!");
		else
		{
			queue[rear]=data;
			rear++;
		}
		
	}
	
	public void dequeue()
	{
		if(front==rear)
			System.out.println("Queue is empty!");
		else {
			
			for(int i=front;i<rear-1;i++)
			{
				queue[i]=queue[i+1];
			}
			rear--;
		}
		
	}
	
	public void printQueue()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.print(queue[i]+" <-- ");
		}
	}
	
	
	
	
	
	
	

}
