package com.vasanth.searchingalgos;

public class BinarySearch {
	public static void main(String[] args) {
		
		int arr[]= {1,3,5,8,9,10};
		System.out.println(binarySearchRecursive(arr, 0,arr.length,9));
		
	}
	
	
	public static int binarySearch(int []arr,int x)
	{
		int n=arr.length;
		int left=0;
		int right=arr.length-1;
		
		while(right>=left)
		{
			int mid=left+ (right-left)/2;
			
			if(arr[mid]==x)
				return mid;
			
			else if(arr[mid]>x)
			{
				right=mid-1;
			}
			
			else
			{
				left=mid+1;
			}			
			
		}
		return -1;
	}
	
	public static int binarySearchRecursive(int arr[],int left,int right, int x)
	{
		if(right>=left)
		{
			int mid=left + (right-left)/2;
			
			if(arr[mid]==x)
				return mid;
			
			if(arr[mid]>x)
				return binarySearchRecursive(arr, left, mid-1, x);
			
			else
				return binarySearchRecursive(arr, mid+1, right, x);
		}
		return -1;
		
	}
	

}
