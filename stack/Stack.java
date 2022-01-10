package com.vasanth.stack;

public class Stack {
	private int top;
	private final int MAX_SIZE=100;
	private int[]stack;
	
	public Stack() {
		top=-1;
		stack=new int[MAX_SIZE];
	}
	
	
	public void push(int a)
	{
		if(top==MAX_SIZE-1)
			System.out.println("Stack Overflow");
		else {
			stack[++top]=a;		
		}		
		
	}
	
	public int pop()
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
			return -1;
		}
		else {
			return stack[top--];   // stack[top], top=top-1
								   //stack[--top]  top=top-1   stack[top]
		}
		
	}
	
	public int peek()
	{
		if(top<0)
		{
			System.out.println("Empty stack");
			return -1;
		}
		
		else
		{
			return stack[top];
		}
		
	}
	
	public void printStack()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.print(stack[i]+" ");
		}
		
	}
	
	public int size()
	{
		return ++top;
	}
	

}
















