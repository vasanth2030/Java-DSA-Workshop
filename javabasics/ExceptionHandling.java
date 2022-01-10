package com.vasanth.javabasics;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Start of program");
		
//		try {
//			System.out.println("Inside try block");
////			throw new Exception("This is an explicit exception");
//		}
//		catch(Exception e) {
//			System.out.println("Inside catch block");
//			System.out.println(e);	
//		}
//		finally {
//			System.out.println("Inside Finally block");
//		}
//		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		try {
			divideNumbers(a, b);
		}
		catch(Exception e)
		{
			System.out.println("Don't divide a number by zero!");
		}
		
		
		System.out.println("End of program");
		
	}
	
	public static int divide(int a,int b) throws Exception,NumberFormatException
	{
		return a/b;
	}
	
	public static void divideNumbers(int a,int b) throws NumberFormatException, Exception
	{
		int div=divide(a, b);
		System.out.println(div);
	}

}
