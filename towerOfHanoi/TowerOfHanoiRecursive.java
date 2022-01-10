package com.vasanth.towerOfHanoi;

public class TowerOfHanoiRecursive {
	
	public static void main(String[] args) {
		
		towerOfHanoi(3, 'A', 'C', 'B');
		
	}
	
	
	public static void towerOfHanoi(int n,char start,char end,char aux)
	{
		if(n==1)
		{
			System.out.println("Move 1 from "+start+" to "+end);
			return;	
		}
		
		towerOfHanoi(n-1, start, aux, end);
		System.out.println("Move "+n+" from "+start+" to "+end);
		towerOfHanoi(n-1, aux, end, start);
	}

}
