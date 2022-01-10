package com.vasanth.searchingalgos;

import java.util.Arrays;
import java.util.Scanner;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class LinearSearch {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//O(n)*O(1) => O(n) 
		
		int arr[]= {1,2,3,4,5,6,7,8,9,0,15,68,29,45,31,61};
		Arrays.sort(arr);
		for(int i :arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("Enter a number to search: ");
		int n=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				System.out.println("The index of "+n+" is "+i);
				break;
			}
		}
		
		
	}

}
