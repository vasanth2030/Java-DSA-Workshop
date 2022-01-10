package com.vasanth.javabasics;
import java.util.Scanner;

public class ArrayImplementation {

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int secondLargest=secondLargest(arr);
		System.out.println("The second largest element in the array is: "+secondLargest);
	
	}
	
	
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
	public static int largestElement(int arr[])
	{
		int largest=arr[0];
		for(int i:arr)
		{
			if(i>largest)
			{
				largest=i;
			}
			
		}
		return largest;
	}
	
	public static int secondLargest(int arr[])
	{
		int largest= arr[0];
		int secondLargest=Integer.MIN_VALUE;
		for(int i:arr)
		{
			if(i>largest)
			{
				secondLargest=largest;
				largest=i;
			}
			
			else if(i>secondLargest)
			{
				secondLargest=i;
			}
		}
		return secondLargest;
	}
	

}
