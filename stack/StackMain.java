package com.vasanth.stack;

public class StackMain {
	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		System.out.println(st.pop());
		System.out.println(st.pop());
		st.printStack();
		System.out.println("Size: "+st.size());
	}

}
