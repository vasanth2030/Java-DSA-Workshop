package com.vasanth.kadanesalgorithm;

public class KadanesAlgorithm {

	public static void main(String[] args) {
		
		int arr[]= {1,-2,-3,4,6,-8,20,3};
		int ans=maxSubArrayKadanesAlgo(arr);
		System.out.println(ans);	

	}
	
	public static int maxSubArrayKadanesAlgo(int arr[])
	{
		int sum=0;
		int result=Integer.MIN_VALUE;
		
		for(int i:arr)
		{
			sum+=i;
			if(sum<i)   // If the number i is greater than the resultant sum, we'll say sum=i
				sum=i;
			if(sum>result) // if sum is greater than the result, we'll say result=sum
				result=sum;
		}
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	

}
