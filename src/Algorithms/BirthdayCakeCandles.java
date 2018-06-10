package Algorithms;

import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number of candles");
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Enter the height of candles");
		int[] a=new int[n];
		int tall=0,res=0;
		for(int i=0;i<n;i++) 
		{
			a[i]=scan.nextInt();
		}
		
		for(int i=0;i<n-1;i++) 
		{
			if(a[i]<a[i+1])
			tall=a[i+1];
			else
			tall=a[i];
		}
		System.out.println(tall);
		for(int i=0;i<n;i++)
		{
			if(a[i]==tall)
				res=res+1;
				
		}
    System.out.println(res);
	}

}
