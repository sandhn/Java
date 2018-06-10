package Algorithms;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i+j)>=n)
					{
						System.out.print("*");
					}
					else
					{
					System.out.print(" ");	
					}
			}
			System.out.println();
		}
	}

}
