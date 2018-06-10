package Algorithms;

import java.util.Scanner;

public class Diagonal_Difference {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number of rows and cols:");
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		
		
		int[][] a=new int[n][n];
		
		System.out.println("Enter the metrix:");
		Scanner scan1= new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=scan1.nextInt();
			}
		}
		int sum1=0,sum2=0,sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					sum1=sum1+a[i][j];
				}
				if(i+j==(n-1))
				{
					sum2=sum2+a[i][j];
				}
			}
		}
		 sum=sum1-sum2;
		 
		System.out.println(Math.abs(sum));

	}

}
